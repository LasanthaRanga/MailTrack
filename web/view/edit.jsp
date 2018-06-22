<%@page contentType="text/html" pageEncoding="UTF-8"%>
                <% String pname = "edit";%>
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
                            <div class="col-md-8">
                                <h5>Sender Name : <strong>Kamal Jayasekara</strong></h5>
                            </div>
                            <div class="col-md-4">
                                <h5>Institute : <strong>WDA</strong></h5>
                            </div>
                            <div class="col-md-4">
                                <h5>Receved Date : <strong>2018-10-10</strong></h5>
                            </div>
                            <div class="col-md-4">
                                <h5>Mail Category : <strong>Hand Write</strong></h5>
                            </div>
                            <div class="col-md-4">
                                <h5>Title : <strong>Water Billing </strong></h5>
                            </div>                            
                            <div class="col-md-4">
                                <h5>Title : <strong>Page Count</strong></h5>
                            </div>
                            <div class="col-md-4">
                                <h5>Title : <strong>My Number</strong></h5>
                            </div>

                        </div>
                        <hr>




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



                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Description</label>
                                    <textarea rows="5" class="form-control"></textarea>
                                </div>
                            </div>

                        </div>

                       


                        <a href="../view/attach.jsp" class="btn btn-info pull-left" >Attachment</a>                        
                        <a href="" class="btn btn-primary" >Save</a>                        
                        <a href="" class="btn btn-success pull-right" >Finish</a>                        
                    </div>
                </div>
            </div>
        </div>

    </div>

</div>
<%@include file="template/footer.jsp" %>