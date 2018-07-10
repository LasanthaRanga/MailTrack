<%@page import="org.hibernate.Criteria"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="org.hibernate.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String pname = "upload_attach";
%>
<%@include file="template/navbar.jsp" %>
<div class="content">
    <div class="container-fluid">
        <div class="col-md-12" >


            <%
                Session imageSession = conn.NewHibernateUtil.getSessionFactory().openSession();
                imageSession.beginTransaction().commit();
                try {
                    pojo.Mailinfo mailinfo = (pojo.Mailinfo) imageSession.load(pojo.Mailinfo.class, Integer.parseInt(request.getParameter("latter")));
            %>




            <div class="card">
                <div class="card-header card-header-primary">
                    <h4 class="card-title">Upload Mail Attachment <strong> <%=mailinfo.getMailInfoTitle()%> </strong></h4>
                    <p class="card-category">Scan document or soft copy upload one by one</p>
                </div>
                <div class="card-body">
                    <div class="card-body">



                        <div class="row">


                            <%    List<pojo.Attachmant> alit = imageSession.createCriteria(pojo.Attachmant.class).add(Restrictions.eq("mailinfo", mailinfo)).list();
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






                            <% }  %>


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







                            <%    } catch (Exception e) {
                                    e.printStackTrace();
                                } finally {
                                    imageSession.close();
                                }

                            %>

                        </div>


                        <hr>

                        <form action="../UpMailAtch" method="post" enctype="multipart/form-data">

                            <div class="row">
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Attachment Title</label>
                                        <input name="atitle" type="text" class="form-control"/>
                                    </div>
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Page No</label>
                                        <input name="pageNo" type="number" class="form-control"/>
                                    </div>
                                    <input name="fupload" type="file" id="" class="btn-info"/>
                                    <input name="latter" type="hidden" id="" value="<%=request.getParameter("latter")%>">
                                </div>

                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <button type="submit" class="btn btn-lg btn-primary"> Upload </button>
                                    </div>
                                </div>

                            </div>
                        </form>

                        <form action="received_all.jsp" method="POST">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <button type="submit" class="btn btn-lg btn-success pull-right"> All Files Upload Complete </button>
                                    </div>
                                </div>

                            </div>
                        </form>        
                    </div>
                </div>




            </div>

        </div>

    </div>
</div>
<%@include file="template/footer.jsp" %>