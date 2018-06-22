/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
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

        if (!request.getParameter("ryear").equals("")) {
            if (!request.getParameter("rmonth").equals(0)) {
                if (!request.getParameter("rdate").equals(0)) {
                    //=====================
                    String ry = request.getParameter("ryear");
                    String rm = request.getParameter("rmonth");
                    String rd = request.getParameter("rdate");
                    Date rdate = new Date(ry + "-" + rm + "-" + rd);
                    //=====================
                    if (!request.getParameter("lyear").equals("")) {
                        if (!request.getParameter("lmonth").equals(0)) {
                            if (!request.getParameter("ldate").equals(0)) {
                                //==================
                                String ly = request.getParameter("lyear");
                                String lm = request.getParameter("lmonth");
                                String ld = request.getParameter("ldate");
                                Date ldate = new Date(ly + "-" + lm + "-" + ld);
                                //==================
                                if (Integer.parseInt(request.getParameter("pages").toString()) > 0) {
                                    //=========================
                                    if (Integer.parseInt(request.getParameter("mailcat").toString()) > 0) {
                                        String mailcat  = request.getParameter("mailcat");
                                        String pages  = request.getParameter("pages");
                                        String title  = request.getParameter("title");
                                        String myno = request.getParameter("myno");
                                        String sender = request.getParameter("sender_name");
                                        String institute  = request.getParameter("institute");
                                        
                                        
                                        
                                        
                                        
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
    }
}
