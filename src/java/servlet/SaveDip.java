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
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.json.JSONArray;
import org.json.JSONObject;
import pojo.Department;

/**
 *
 * @author RM.LasanthaRanga@gmail.com
 */
@WebServlet(name = "SaveDip", urlPatterns = {"/SaveDip"})
public class SaveDip extends HttpServlet {

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

        JSONObject jo = new JSONObject();

        try (PrintWriter out = response.getWriter()) {
            if (request.getParameter("dipname") != null) {
                if (request.getParameter("dipname").length() > 1) {
                    Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
                    Transaction transaction = session.beginTransaction();
                    try {
                        Department department = new pojo.Department();
                        department.setDepartmentName(request.getParameter("dipname"));
                        session.save(department);
                        transaction.commit();
                        jo.put("ok", "good");
                    } catch (Exception e) {
                        transaction.rollback();
                        e.printStackTrace();
                    } finally {
                        session.close();
                    }
                } else {
                    jo.put("ok", "error");
                }
            } else {
                jo.put("ok", "null");
            }
            JSONArray jsonArray = new JSONArray();
            jsonArray.put(jo);
            out.print(jsonArray.toString());
            System.out.println(jsonArray.toString());
        } catch (Exception e) {
            e.printStackTrace();
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
