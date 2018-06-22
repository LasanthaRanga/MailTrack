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
                            <div class="col-md-3">
                                <div class="thumbnail">
                                    <a href="/w3images/lights.jpg">
                                        <img src="../images/lights.jpg" alt="Lights" style="width:100%">
                                        <div class="caption">
                                            <p>Page No 1</p>
                                        </div>
                                    </a>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="thumbnail">
                                    <a href="/w3images/lights.jpg">
                                        <img src="../images/lights.jpg" alt="Lights" style="width:100%">
                                        <div class="caption">
                                            <p>Page No 2</p>
                                        </div>
                                    </a>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="thumbnail">
                                    <a href="/w3images/lights.jpg">
                                        <img src="../images/lights.jpg" alt="Lights" style="width:100%">
                                        <div class="caption">
                                            <p>Page No 3</p>
                                        </div>
                                    </a>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="thumbnail">
                                    <a href="/w3images/lights.jpg">
                                        <img src="../images/lights.jpg" alt="Lights" style="width:100%">
                                        <div class="caption">
                                            <p>Page No 4</p>
                                        </div>
                                    </a>
                                </div>
                            </div>
                        </div>




                        <form action="../UpMailDoc" method="post" enctype="multipart/form-data">

                            <div class="row">
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Page No</label>
                                        <input id="" type="number" class="form-control"/>
                                    </div>
                                    <input name="SelectFile" type="file" id="" class="btn-info"/>
                                </div>

                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <button type="submit" class="btn btn-lg btn-primary">Update Profile</button>
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