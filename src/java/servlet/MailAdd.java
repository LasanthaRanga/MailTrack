/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
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
@WebServlet(name = "MailAdd", urlPatterns = {"/MailAdd"})
public class MailAdd extends HttpServlet {

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {

            if (Integer.parseInt(request.getParameter("ryear"))>2000 && 2100 > Integer.parseInt(request.getParameter("ryear")) ) {
                if (Integer.parseInt(request.getParameter("rmonth"))>0) {
                    if (Integer.parseInt(request.getParameter("rdate"))>0) {
                        //=====================
                        String ry = request.getParameter("ryear");
                        String rm = request.getParameter("rmonth");
                        String rd = request.getParameter("rdate");
                        String rday = ry + "-" + rm + "-" + rd;
                        Date rdate = new SimpleDateFormat("yyyy-MM-dd").parse(rday);

                        //=====================
                        if (Integer.parseInt(request.getParameter("lyear"))> 2000 && 2100 >Integer.parseInt(request.getParameter("lyear"))) {
                            if (Integer.parseInt(request.getParameter("lmonth"))>0) {
                                if (Integer.parseInt(request.getParameter("ldate"))>0) {
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
                                          if (saveNewMail>0) {
                                              response.sendRedirect("view/upload_mail.jsp?latter="+saveNewMail);
                                            } else {
                                               response.sendRedirect("view/create_new.jsp?error=Please cheack Data and Try Again");
                                          }
                                        } else {
                                             response.sendRedirect("view/create_new.jsp?error=Please Mail Catagory");
                                        }
                                    } else {
                                        response.sendRedirect("view/create_new.jsp?error=Please Page Count");
                                    }
                                } else {
                                     response.sendRedirect("view/create_new.jsp?error=Please Latter Date");
                                }
                            } else {
                                response.sendRedirect("view/create_new.jsp?error=Please Latter Month");
                            }
                        } else {
                             response.sendRedirect("view/create_new.jsp?error=Please Cheack Latter Year");
                        }
                    } else {
                        response.sendRedirect("view/create_new.jsp?error=Please Select Date");
                    }
                } else {
                    response.sendRedirect("view/create_new.jsp?error=Please Select Month");
                }
            } else {
                response.sendRedirect("view/create_new.jsp?error=Please Cheack Receve Year");
            }
        } catch (Exception e) {
            e.printStackTrace();
             response.sendRedirect("view/create_new.jsp?error=Please Cheack Data");
        }
    }

}
