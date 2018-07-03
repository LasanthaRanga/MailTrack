/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import pojo.Mailinfo;
import pojo.Proces;
import pojo.User;
import pojo.Usercatagory;

/**
 *
 * @author RM.LasanthaRanga@gmail.com
 */
@WebServlet(name = "DipHead", urlPatterns = {"/DipHead"})
public class DipHead extends HttpServlet {

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

            int luid = Integer.parseInt(request.getSession().getAttribute("luid").toString());
            int latter = Integer.parseInt(request.getParameter("latterno"));
            String comment = request.getParameter("comment");
            Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            try {
                Mailinfo mailinfo = (pojo.Mailinfo) session.load(pojo.Mailinfo.class, latter);
                User user = (pojo.User) session.load(pojo.User.class, luid);
                Usercatagory usercatagory = user.getUsercatagory();

                Criteria criteria = session.createCriteria(pojo.Proces.class);
                criteria.add(Restrictions.eq("mailinfo", mailinfo));
                List<pojo.Proces> list = criteria.add(Restrictions.eq("userByUserTo", user)).list();
                pojo.Proces pro = null;
                for (Proces proces : list) {
                    pro = proces;
                }
                
                pro.setProcesComent(comment);
                session.update(pro);
                transaction.commit();
                response.sendRedirect("view/sendto.jsp?latter="+latter);
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
                response.sendRedirect("view/fullinfo.jsp?latter="+latter);
            } finally {
                session.close();
            }

            out.print(latter + "<br>");
            out.print(comment);

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
