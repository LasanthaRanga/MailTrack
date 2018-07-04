<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Session"%>
<% String pname = "fullinfo";%>
<%@include file="template/navbar.jsp" %>
<div class="content">
    <div class="container-fluid">
        <div class="col-md-12" >


            <%
                Session imageSession = conn.NewHibernateUtil.getSessionFactory().openSession();
                imageSession.beginTransaction().commit();
                try {
                    pojo.Mailinfo mailinfo = (pojo.Mailinfo) imageSession.load(pojo.Mailinfo.class, Integer.parseInt(request.getParameter("latter")));%>

            <div class="card">
                <div class="card-header card-header-primary">
                    <h4 class="card-title"><%=mailinfo.getMailInfoTitle()%></h4>
                    <p class="card-category"><%=mailinfo.getMailInfoSender()%></p>
                </div>
                <div class="card-body">
                    <div class="card-body">


                        <div class="row">




                            <div class="col-md-8">
                                <h5>Sender Name : <strong><%=mailinfo.getMailInfoSender()%></strong></h5>
                            </div>
                            <div class="col-md-4">
                                <h5>Institute : <strong><%=mailinfo.getMailInfoInstitute()%></strong></h5>
                            </div>
                            <div class="col-md-4">
                                <h5>Received Date : <strong><%=mailinfo.getMailInfoReceivedDate()%></strong></h5>
                            </div>
                            <div class="col-md-4">
                                <h5>Mail Category : <strong><%=mailinfo.getMailcatagory().getMailCatagoryCatagory()%></strong></h5>
                            </div>
                            <div class="col-md-4">
                                <h5>Title : <strong><%=mailinfo.getMailInfoTitle()%></strong></h5>
                            </div>                            
                            <div class="col-md-4">
                                <h5>Page Count : <strong><%=mailinfo.getMailInfoPageCount()%></strong></h5>
                            </div>
                            <div class="col-md-8">
                                <h5>My Number : <strong><%=mailinfo.getMailInfoMyNo()%></strong></h5>
                            </div>

                            <br>

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
                            <% }%>

                            <div class="col-md-12">
                                <p>Comment By Secretary : <strong><%=mailinfo.getMailInfoComment()%></strong></p>
                            </div>



                            <%

                                List<pojo.Proces> proceses = imageSession.createCriteria(pojo.Proces.class).add(Restrictions.eq("mailinfo", mailinfo)).list();
                                for (pojo.Proces proces : proceses) {
                            %>      
                            <div class="col-md-8">
                                <hp>By <%=proces.getUserByUserTo().getUserFullName()%> : <strong><%=proces.getProcesComent()%></strong></hp>
                            </div>
                            <br>
                            <% }

                            %>





                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-md-12">
                                <h3>Attachments</h3>
                            </div>
                            <%  Criteria ca = imageSession.createCriteria(pojo.Attachmantbyofficer.class);
                                ca.add(Restrictions.eq("mailinfo", mailinfo));
                                List<pojo.Attachmantbyofficer> alist = ca.list();
                                for (pojo.Attachmantbyofficer at : alist) {
                                    String apath = at.getAttachmantByOfficerPath();
                                    String aTitle = at.getAttachmantByOfficerTitle();
                                    int aNo = at.getAttachmantByOfficerNumber();
                                    String un = at.getUser().getUserFullName();

                            %>


                            <div class="col-md-3">
                                <div class="thumbnail">
                                    <a href="<%=apath%>">
                                        <img src="<%=apath%>" alt="Click Here To View" style="width:100%">

                                    </a>
                                    <div class="caption">
                                        <p>No :<%=aNo%> <br>Title :<%=aTitle%><br>By : <%=un%></p>                                              
                                    </div>
                                </div>
                            </div>



                            <% }
                            %>
                        </div>

                        <%                            pojo.User u = (pojo.User) imageSession.load(pojo.User.class, Integer.parseInt(request.getSession().getAttribute("luid").toString()));

                            if (u.getUsercatagory().getIdUserCatagory() != 5) {%>

                        <div class="row">
                            <div class="col-md-12">
                                <form method="POST" action="../DipHead">
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <label class="bmd-label-floating">Comment</label>
                                            <textarea name="comment" type="text" class="form-control" required=""></textarea>
                                        </div>
                                    </div>
                                    <button type="submit" value="<%=request.getParameter("latter")%>" name="latterno" class="btn btn-primary">Send</button>

                                </form>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="col-md-12">
                                        <a class="btn btn-primary" href="edit.jsp?latter=<%=request.getParameter("latter")%>">EDIT</a>
                                    </div>
                                </div>

                            </div>
                        </div>

                        <%  } else {%>


                        <div class="row">
                            <div class="col-md-12">
                                <a class="btn btn-primary" href="edit.jsp?latter=<%=request.getParameter("latter")%>">EDIT</a>
                            </div>

                        </div>


                        <% } %>







                        <% } catch (Exception e) {
                                e.printStackTrace();
                            } finally {
                                imageSession.close();
                            }

                        %>


                    </div>
                </div>
            </div>
        </div>

    </div>

</div>
<%@include file="template/footer.jsp" %>