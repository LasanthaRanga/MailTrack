<%@page import="org.hibernate.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String pname = "received_all";%>
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
                                    Session ms = conn.NewHibernateUtil.getSessionFactory().openSession();
                                    try {

                                        HashMap<Integer, pojo.Mailinfo> hm = modle.GetInstans.getMailList().getRecivedList(Integer.parseInt(session.getAttribute("luid").toString()));
                                        for (Map.Entry<Integer, pojo.Mailinfo> en : hm.entrySet()) {
                                            Integer key = en.getKey();
                                            pojo.Mailinfo val = (pojo.Mailinfo)ms.load(pojo.Mailinfo.class, key);
                                %>



                                <tr>

                                    <td><%=key%></td>
                                    <td><%=val.getMailInfoSender()%></td>
                                    <td><%=val.getMailInfoInstitute()%></td>
                                    <td><%=val.getMailInfoReceivedDate()%></td>
                                    <td><%=val.getMailInfoTitle()%></td>
                                    <td><a href="../view/fullinfo.jsp?latter=<%=key%>" class="btn btn-info btn-sm"> Link</a></td>
                                </tr>



                                <% }

                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    } finally {
                                        ms.close();
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