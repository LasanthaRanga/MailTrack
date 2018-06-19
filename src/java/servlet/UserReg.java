/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Department;
import pojo.User;
import pojo.Usercatagory;
import pojo.Userhasdepartment;

/**
 *
 * @author RM.LasanthaRanga@gmail.com
 */
@WebServlet(name = "UserReg", urlPatterns = {"/UserReg"})
public class UserReg extends HttpServlet {

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

        try {
            if (Integer.parseInt(request.getParameter("ucat")) > 0) {
                if (Integer.parseInt(request.getParameter("dip")) > 0) {
                    if (request.getParameter("email").length() > 3) {
                        if (request.getParameter("pword").length() > 3) {
                            String pass = modle.MD5.cryptWithMD5(request.getParameter("pword"));
                            Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
                            Transaction transaction = session.beginTransaction();
                            try {
                                Usercatagory usercatagory = (pojo.Usercatagory) session.load(pojo.Usercatagory.class, Integer.parseInt(request.getParameter("ucat")));

                                Department department = (pojo.Department) session.load(pojo.Department.class, Integer.parseInt(request.getParameter("dip")));

                                User user = new pojo.User(usercatagory);
                                Userhasdepartment userhasdepartment = new pojo.Userhasdepartment();
                                userhasdepartment.setDepartment(department);
                                userhasdepartment.setUser(user);

                                user.setUserFullName(request.getParameter("fullname"));
                                user.setUserDesignation(request.getParameter("des"));
                                user.setUserEmail(request.getParameter("email"));
                                user.setUserPassword(pass);
                                user.setUserNic(request.getParameter("nic"));
                                user.setUserStatus(0);
                                int nextInt = new Random().nextInt(10000);
                                user.setUserVerify(nextInt + "");

                                session.save(user);
                                session.save(userhasdepartment);

                                transaction.commit();
                                String vurl = "http://localhost:8080/MailTrack/EmailVerify?mail=" + request.getParameter("email") + "&code=" + nextInt;

                                String ss = "<!DOCTYPE html>\n"
                                        + "<html>\n"
                                        + "    <head>\n"
                                        + "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n"
                                        + "        <title>Mail Track Verification</title>\n"
                                        + "        <style type=\"text/css\">\n"
                                        + "            body{\n"
                                        + "                margin: auto;\n"
                                        + "                text-align: center;\n"
                                        + "                color: skyblue;\n"
                                        + "            }\n"
                                        + "            button{\n"
                                        + "                padding: 10px;\n"
                                        + "                font-size: 18px;                \n"
                                        + "                color: blue; \n"
                                        + "                background-color: lightgreen;\n"
                                        + "                border-radius: 5px;\n"
                                        + "                \n"
                                        + "            }\n"
                                        + "        </style>\n"
                                        + "    </head>\n"
                                        + "    <body>\n"
                                        + "        <h1>Mail Track</h1>\n"
                                        + "        <h2>Hello </h2>\n"
                                        + "        <h3>This is Email Verification</h3>\n"
                                        + "        <a href=\""+vurl+"\"><h3>Click Here to verify</h3></a>\n"
                                        + "    </body>\n"
                                        + "</html>\n"
                                        + "";
                                modle.Mail.sendEmail(request.getParameter("email"), ss);

                            } catch (Exception e) {
                                e.printStackTrace();
                                transaction.rollback();
                            } finally {
                                session.close();
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
