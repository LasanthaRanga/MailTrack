<%@page import="java.util.List"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="org.hibernate.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String pname = "upload_mail";
%>
<%@include file="template/navbar.jsp" %>
<div class="content">
    <div class="container-fluid">
        <div class="col-md-12" >
            <div class="card">
                <div class="card-header card-header-primary">
                    <h4 class="card-title">Upload Mail <strong> Mail Title</strong></h4>
                    <p class="card-category">Scan document or soft copy upload one by one</p>
                </div>
                <div class="card-body">
                    <div class="card-body">



                        <div class="row">


                            <%
                                Session imageSession = conn.NewHibernateUtil.getSessionFactory().openSession();
                                imageSession.beginTransaction().commit();
                                try {

                                    List<pojo.Attachmant> alit = imageSession.createCriteria(pojo.Attachmant.class).add(Restrictions.eq("mailinfo", imageSession.load(pojo.Mailinfo.class, Integer.parseInt(request.getParameter("latter"))))).list();
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


                            <hr>

                        <form action="../UpMailDoc" method="post" enctype="multipart/form-data">

                            <div class="row">
                                <div class="col-md-3">
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

                        <form action="create_new.jsp" method="POST">
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