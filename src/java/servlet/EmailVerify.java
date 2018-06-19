/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import pojo.User;

/**
 *
 * @author RM.LasanthaRanga@gmail.com
 */
@WebServlet(name = "EmailVerify", urlPatterns = {"/EmailVerify"})
public class EmailVerify extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EmailVerify</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EmailVerify at " + request.getContextPath() + "</h1>");

            out.println(request.getParameter("mail"));
            out.println(request.getParameter("code"));

            Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            try {
                Criteria criteria = session.createCriteria(pojo.User.class);
                criteria.add(Restrictions.eq("userEmail", request.getParameter("mail")));
                criteria.add(Restrictions.eq("userVerify", request.getParameter("code")));
                User user = (pojo.User) criteria.uniqueResult();
                user.setUserStatus(1);
                session.update(user);
                transaction.commit();
                response.sendRedirect("view/verify_good.jsp");
                
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
            } finally {
                session.close();
            }
            out.println("</body>");
            out.println("</html>");
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
