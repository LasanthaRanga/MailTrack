<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="org.hibernate.Session"%>
<% String pname = "just_added";%>
<%@include file="template/navbar.jsp" %>
<div class="content">
    <div class="container-fluid">
        <div class="col-md-12" >
            <div class="card">
                <div class="card-header card-header-primary">
                    <h4 class="card-title ">Simple Table</h4>
                    <p class="card-category"> Here is a subtitle for this table</p>
                </div>
                <div class="card-body">
                    <div class="table-responsive">
                        <table class="table">
                            <thead class=" text-primary">

                            <th>ID</th>
                            <th>Sender Name</th>
                            <th>Institute </th>
                            <th>Date</th>
                            <th>Title</th>
                            <th>More</th>
                            </thead>
                            <tbody>

                                <%
                                    Session jasession = conn.NewHibernateUtil.getSessionFactory().openSession();
                                    try {
                                        List<pojo.Mailinfo> milist = jasession.createCriteria(pojo.Mailinfo.class).add(Restrictions.eq("mailstatus", (pojo.Mailstatus) jasession.load(pojo.Mailstatus.class, 1))).list();
                                        for (pojo.Mailinfo minfo : milist) {%>

                                <tr>
                                    <td><%out.print(minfo.getIdMailInfo()); %></td>
                                    <td><%out.print(minfo.getMailInfoSender());%></td>
                                    <td><%out.print(minfo.getMailInfoInstitute());%></td>
                                    <td><%out.print(minfo.getMailInfoReceivedDate());%></td>
                                    <td><%out.print(minfo.getMailInfoTitle());%></td>
                                    <td><a href="../view/fullview.jsp?latter=<%out.print(minfo.getIdMailInfo());%>" class="btn btn-info btn-sm"> Link</a></td>
                                </tr>


                                <% }
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    } finally {
                                        jasession.close();
                                    }
                                %>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>

        </div>        
    </div>
</div>
<%@include file="template/footer.jsp" %>