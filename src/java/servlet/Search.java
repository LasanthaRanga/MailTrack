/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import com.sun.xml.ws.security.impl.policy.EncryptedParts;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
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
import pojo.Mailcatagory;
import pojo.Mailinfo;

/**
 *
 * @author RM.LasanthaRanga@gmail.com
 */
@WebServlet(name = "Search", urlPatterns = {"/Search"})
public class Search extends HttpServlet {

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

            try {

                String sender_name = request.getParameter("sender_name");
                String institute = request.getParameter("institute");
                String title = request.getParameter("title");
                //Received
                int ryear = Integer.parseInt(request.getParameter("ryear"));
                int rmonth = Integer.parseInt(request.getParameter("rmonth"));
                int rdate = Integer.parseInt(request.getParameter("rdate"));

                //LaterDate
                int lyear = Integer.parseInt(request.getParameter("lyear"));
                int lmonth = Integer.parseInt(request.getParameter("lmonth"));
                int ldate = Integer.parseInt(request.getParameter("ldate"));

                int mailcat = Integer.parseInt(request.getParameter("mailcat"));
                Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
                Transaction transaction = session.beginTransaction();
                transaction.commit();
                try {
                    Criteria criteria = session.createCriteria(pojo.Mailinfo.class);

                    if (sender_name != null) {
                        if (sender_name.length() > 1) {
                            out.println(sender_name);
                            criteria.add(Restrictions.eq("mailInfoSender", sender_name));

                        }
                    }
                    if (institute != null) {
                        if (institute.length() > 1) {
                            out.println(institute);
                            criteria.add(Restrictions.eq("mailInfoInstitute", institute));
                        }
                    }
                    if (title != null) {
                        if (institute.length() > 1) {
                            out.print(title);
                            criteria.add(Restrictions.eq("mailInfoTitle", title));
                        }
                    }

                    if (mailcat > 0) {
                        Mailcatagory mc = (pojo.Mailcatagory) session.load(pojo.Mailcatagory.class, mailcat);
                        criteria.add(Restrictions.eq("mailcatagory", mc));
                    }

                    //Recived
                    if (ryear > 1900) {
                        out.print(ryear);
                        if (rmonth > 0) {
                            out.print(rmonth);
                            if (rdate > 0) {
                                out.print(rdate);
                            }
                        }
                    }

                    //:atter
                    if (lyear > 1900) {
                        if (lmonth > 0) {
                            if (ldate > 0) {

                            }
                        }
                    }

                    //HashMap miHashMap = new HashMap<Integer, pojo.Mailinfo>();
                    ArrayList<Integer> milist = new ArrayList<Integer>();

                    List<pojo.Mailinfo> list = criteria.list();
                    for (Mailinfo mailinfo : list) {
                        // miHashMap.put(mailinfo.getIdMailInfo(), mailinfo);
                        milist.add(mailinfo.getIdMailInfo());
                    }
                    if (request.getSession().getAttribute("milist") != null) {
                        request.getSession().removeAttribute("milist");
                    }
                    request.getSession().setAttribute("milist", milist);

                    response.sendRedirect("view/search.jsp");

                } catch (Exception e) {
                    e.printStackTrace();
                }

            } catch (Exception e) {
                System.out.println("Number Format Exception ");
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
