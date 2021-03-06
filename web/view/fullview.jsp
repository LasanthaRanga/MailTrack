<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Session"%>
<% String pname = "just_added";%>
<%@include file="template/navbar.jsp" %>
<div class="content">
    <div class="container-fluid">
        <div class="col-md-12" >
            <div class="card">
                <div class="card-header card-header-primary">
                    <h4 class="card-title">Full Info Of Mail</h4>
                    <p class="card-category">All Details</p>
                </div>
                <div class="card-body">
                    <div class="card-body">


                        <div class="row">


                            <%
                                Session imageSession = conn.NewHibernateUtil.getSessionFactory().openSession();
                                imageSession.beginTransaction().commit();
                                try {
                                    pojo.Mailinfo mailinfo = (pojo.Mailinfo) imageSession.load(pojo.Mailinfo.class, Integer.parseInt(request.getParameter("latter")));%>
                            <div class="row">
                                <div class="col-md-8">
                                    <h5>Sender Name : <strong><%=mailinfo.getMailInfoSender() %></strong></h5>
                                </div>
                                <div class="col-md-4">
                                    <h5>Institute : <strong><%=mailinfo.getMailInfoInstitute() %></strong></h5>
                                </div>
                                <div class="col-md-4">
                                    <h5>Receved Date : <strong><%=mailinfo.getMailInfoReceivedDate() %></strong></h5>
                                </div>
                                <div class="col-md-4">
                                    <h5>Mail Category : <strong><%=mailinfo.getMailcatagory().getMailCatagoryCatagory() %></strong></h5>
                                </div>
                                <div class="col-md-4">
                                    <h5>Title : <strong><%=mailinfo.getMailInfoTitle() %></strong></h5>
                                </div>                            
                                <div class="col-md-4">
                                    <h5>Page Count : <strong><%=mailinfo.getMailInfoPageCount() %></strong></h5>
                                </div>
                                <div class="col-md-4">
                                    <h5>My Number : <strong><%=mailinfo.getMailInfoMyNo() %></strong></h5>
                                </div>

                            <hr>
                            </div>
                            <%   List<pojo.Attachmant> alit = imageSession.createCriteria(pojo.Attachmant.class).add(Restrictions.eq("mailinfo", mailinfo)).list();
                                for (pojo.Attachmant atach : alit) {%>



                            <div class="col-md-3">
                                <div class="thumbnail">
                                    <a href="<%=atach.getAttachmantPath()%>">
                                        <img src="<%=atach.getAttachmantPath()%>" alt="Click Here To View" style="width:100%">
                                        <div class="caption">
                                            <p>No <%=atach.getAttachmantNumber()%></p>
                                        </div>
                                    </a>
                                </div>
                            </div>
                            <% }

                                } catch (Exception e) {
                                    e.printStackTrace();
                                } finally {
                                    imageSession.close();
                                }

                            %>

                        </div>

                        <a href="../view/justedit.jsp?latter=<%=request.getParameter("latter")%>" class="btn btn-primary pull-left" >Edit</a>                        
                        <a href="../SendToCommissioner?latter=<%=request.getParameter("latter")%>" class="btn btn-success pull-right" >Send tO Commissioner</a>                        
                    </div>
                </div>
            </div>
        </div>

    </div>

</div>
<%@include file="template/footer.jsp" %>