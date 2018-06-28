package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import pojo.Department;
import pojo.Mailinfo;
import pojo.Proces;
import pojo.User;
import pojo.Userhasdepartment;

@WebServlet(name = "SendToDep", urlPatterns = {"/SendToDep"})
public class SendToDep extends HttpServlet {

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
            if (request.getParameter("latter") != null) {
                Session session = conn.NewHibernateUtil.getSessionFactory().openSession();
                Transaction transaction = session.beginTransaction();
                try {
                    int l = Integer.parseInt(request.getParameter("latter"));
                    Mailinfo mi = (pojo.Mailinfo) session.load(pojo.Mailinfo.class, l);
                    mi.setMailInfoComment(request.getParameter("comment"));
                    String day = request.getParameter("year") + "-" + request.getParameter("month") + "-" + request.getParameter("day");
                    Date dadline = new SimpleDateFormat("yyyy-MM-dd").parse(day);
                    mi.setMailInfoDeadline(dadline);
                    mi.setMailstatus((pojo.Mailstatus) session.load(pojo.Mailstatus.class, 3));
                    session.update(mi);
                    Department department = (pojo.Department) session.load(pojo.Department.class, Integer.parseInt(request.getParameter("dip")));

                    Criteria user = session.createCriteria(pojo.User.class);
                    List<pojo.User> depHedUsers = user.add(Restrictions.eq("usercatagory", session.load(pojo.Usercatagory.class, 4))).list(); //Depatment are dip hed 

                    Criteria ud = session.createCriteria(pojo.Userhasdepartment.class);
                    List<pojo.Userhasdepartment> usersInDep = ud.add(Restrictions.eq("department", department)).list();//users in depatement
                    pojo.User toUser = null;
                    for (User u : depHedUsers) {
                        for (Userhasdepartment uhd : usersInDep) {
                            if (u.getIdUser() == uhd.getUser().getIdUser()) {
                                toUser = u;
                                break;
                            }
                        }
                    }
                    if (toUser != null) {

                        int fuid = Integer.parseInt(request.getSession().getAttribute("luid").toString());
                        User fromUser = (pojo.User) session.load(pojo.User.class, fuid);

                        List<pojo.Proces> proList = session.createCriteria(pojo.Proces.class).add(Restrictions.eq("mailinfo", mi)).list();
                        int processOder = 0;
                        if (proList != null) {
                            processOder = proList.size() + 1;
                        }

                        Proces proces = new pojo.Proces();
                        proces.setMailinfo(mi);
                        proces.setDepartment(department);
                        proces.setMailstatus((pojo.Mailstatus) session.load(pojo.Mailstatus.class, 3));
                        proces.setUserByUserTo(toUser);
                        proces.setUserByUserFrom(fromUser);
                        proces.setProcesOder(processOder);
                        session.save(proces);
                        transaction.commit();
                        response.sendRedirect("view/allforhandl.jsp");
                    } else {
                        System.out.println("Department Head Null");
                        transaction.rollback();
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Number Format Exception");
                    transaction.rollback();
                } finally {
                    session.close();
                }
            } else {
                response.sendRedirect("");
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
