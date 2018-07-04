/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author RM.LasanthaRanga@gmail.com
 */
@WebServlet(name = "UpMailAtch", urlPatterns = {"/UpMailAtch"})
public class UpMailAtch extends HttpServlet {

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

                int uid = Integer.parseInt(request.getSession().getAttribute("luid").toString());

                DiskFileItemFactory fectory = new DiskFileItemFactory();

                ServletFileUpload upload = new ServletFileUpload(fectory);

                String txt = "";
                String latterNo = "";
                String thumb = "";
                String path = "";

                List itList = upload.parseRequest(request);

                for (Object object : itList) {

                    FileItem fileItem = (FileItem) object;

                    if (fileItem.isFormField()) {

                        if (fileItem.getFieldName().equals("pageNo")) {

                            txt = fileItem.toString();
                            txt = fileItem.getString();
                            //  System.out.println(txt);
                        }
                        if (fileItem.getFieldName().equals("latter")) {

                            latterNo = fileItem.toString();
                            latterNo = fileItem.getString();
                            //  System.out.println(latterNo);
                        }

                    } else if (fileItem.getFieldName().equals("fupload")) {
                        thumb = "A" + latterNo + "_P" + txt + "_" + Math.random() + fileItem.getName();

                        File f = new File(getServletContext().getRealPath("/") + "fup/" + thumb);
                        path = "../fup/" + thumb;
                        fileItem.write(f);

                        System.out.println(fileItem.getSize() + "byte");
                        System.out.print(latterNo + "  = Latter No");
                        System.out.print(txt + "  = number");
                    }
                }
                boolean uploadInfo = modle.GetInstans.getUploadMail().uploadAttach(path, Integer.parseInt(latterNo), uid, Integer.parseInt(txt), txt);
                if (uploadInfo) {
                    response.sendRedirect("view/upload_mail.jsp?latter=" + latterNo);
                } else {
                    //upload save eroor
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
