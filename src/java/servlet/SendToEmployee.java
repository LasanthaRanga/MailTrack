/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import pojo.Department;
import pojo.Mailinfo;
import pojo.Proces;
import pojo.User;

/**
 *
 * @author RM.LasanthaRanga@gmail.com
 */
@WebServlet(name = "SendToEmployee", urlPatterns = {"/SendToEmployee"})
public class SendToEmployee extends HttpServlet {

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
            String[] parameterValues = request.getParameterValues("uid");
            int latter = Integer.parseInt(request.getParameter("latter"));
            Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            try {
                Mailinfo mi = (pojo.Mailinfo) session.load(pojo.Mailinfo.class, latter);
                mi.setMailstatus((pojo.Mailstatus) session.load(pojo.Mailstatus.class, 4));
                session.update(mi);
                Department department = (pojo.Department) session.load(pojo.Department.class, Integer.parseInt(request.getParameter("dip")));

                int fuid = Integer.parseInt(request.getSession().getAttribute("luid").toString());
                User fromUser = (pojo.User) session.load(pojo.User.class, fuid);

                Criteria cr = session.createCriteria(pojo.Proces.class);
                cr.add(Restrictions.eq("mailinfo", mi));
                cr.add(Restrictions.eq("userByUserTo", fromUser));

                List<pojo.Proces> list = cr.list();
                for (Proces proces : list) {
                    proces.setProcesStatus(0);
                    session.update(proces);
                }

                List<pojo.Proces> proList = session.createCriteria(pojo.Proces.class).add(Restrictions.eq("mailinfo", mi)).list();
                int processOder = 0;
                if (proList != null) {
                    processOder = proList.size() + 1;
                }

                for (String parameterValue : parameterValues) {
                    int parseInt = Integer.parseInt(parameterValue);
                    User toUser = (pojo.User) session.load(pojo.User.class, parseInt);
                    Proces proces = new pojo.Proces();
                    proces.setMailinfo(mi);
                    proces.setDepartment(department);
                    proces.setMailstatus((pojo.Mailstatus) session.load(pojo.Mailstatus.class, 4));
                    proces.setUserByUserTo(toUser);
                    proces.setUserByUserFrom(fromUser);
                    proces.setProcesOder(processOder);
                    proces.setProcesStatus(1);
                    session.save(proces);
                }

                //============
                transaction.commit();
                response.sendRedirect("view/received_all.jsp");
                //==================================

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                session.close();
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
