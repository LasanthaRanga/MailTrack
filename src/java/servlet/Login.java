/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import pojo.Privilege;
import pojo.User;

/**
 *
 * @author RM.LasanthaRanga@gmail.com
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            if (request.getParameter("email").length() > 3) {
                if (request.getParameter("pword").length() > 3) {
                    Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
                    session.beginTransaction().commit();
                    try {
                        Criteria criteria = session.createCriteria(pojo.User.class);
                        criteria.add(Restrictions.eq("userEmail", request.getParameter("email")));
                        criteria.add(Restrictions.eq("userPassword", modle.MD5.cryptWithMD5(request.getParameter("pword"))));
                        User user = (pojo.User) criteria.uniqueResult();
                        if (user != null) {
                            if (user.getUserStatus() == 0) {
                            } else if (user.getUserStatus() == 1) {

                                ArrayList al = new ArrayList<String>();

                                request.getSession().setAttribute("luid", user.getIdUser());
                                Set<Privilege> pl = user.getUsercatagory().getPrivileges();
                                for (pojo.Privilege privilege : pl) {
                                    al.add(privilege.getPrivilegeName());
                                }
                                request.getSession().setAttribute("pl", al);
                                response.sendRedirect("view/mymail.jsp");
                            }
                        } else {
                            response.sendRedirect("view/login.jsp");
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        session.close();
                    }
                }
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
