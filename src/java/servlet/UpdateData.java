/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RM.LasanthaRanga@gmail.com
 */
@WebServlet(name = "UpdateData", urlPatterns = {"/UpdateData"})
public class UpdateData extends HttpServlet {

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

            try {

                if (!request.getParameter("ryear").equals("")) {
                    if (!request.getParameter("rmonth").equals(0)) {
                        if (!request.getParameter("rdate").equals(0)) {
                            //=====================
                            String ry = request.getParameter("ryear");
                            String rm = request.getParameter("rmonth");
                            String rd = request.getParameter("rdate");
                            String rday = ry + "-" + rm + "-" + rd;
                            Date rdate = new SimpleDateFormat("yyyy-MM-dd").parse(rday);

                            //=====================
                            if (!request.getParameter("lyear").equals("")) {
                                if (!request.getParameter("lmonth").equals(0)) {
                                    if (!request.getParameter("ldate").equals(0)) {
                                        //==================
                                        String ly = request.getParameter("lyear");
                                        String lm = request.getParameter("lmonth");
                                        String ld = request.getParameter("ldate");
                                        Date ldate = new SimpleDateFormat("yyyy-MM-dd").parse(ly + "-" + lm + "-" + ld);
                                        //==================
                                        if (Integer.parseInt(request.getParameter("pages").toString()) > 0) {
                                            //=========================
                                            if (Integer.parseInt(request.getParameter("mailcat").toString()) > 0) {
                                                int mailcat = Integer.parseInt(request.getParameter("mailcat").toString());
                                                String pages = request.getParameter("pages");
                                                String title = request.getParameter("title");
                                                String myno = request.getParameter("myno");
                                                String sender = request.getParameter("sender_name");
                                                String institute = request.getParameter("institute");

                                                System.out.println(mailcat);

                                                int saveNewMail = modle.GetInstans.getNewMail().saveNewMail(mailcat, sender, institute, rdate, ldate, title, myno, Integer.parseInt(pages), Integer.parseInt(request.getSession().getAttribute("luid").toString()));
                                                if (saveNewMail > 0) {
                                                    response.sendRedirect("view/upload_mail.jsp?latter=" + saveNewMail);
                                                } else {
                                                }
                                            } else {
                                            }
                                        } else {
                                        }
                                    } else {
                                    }
                                } else {
                                }
                            } else {
                            }
                        } else {
                        }
                    } else {
                    }
                } else {
                }
            } catch (Exception e) {
                e.printStackTrace();
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
