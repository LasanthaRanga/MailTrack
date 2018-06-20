<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String pname = "dip";
%>
<%@include file="template/navbar.jsp" %>
<div class="content">
    <div class="container-fluid">
        <div class="col-md-8" >
            <div class="card">
                <div class="card-header card-header-primary">
                    <h4 class="card-title">Department</h4>
                    <p class="card-category">Department Registration Form</p>
                </div>
                <div class="card-body">
                    <div class="card-body">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label class="bmd-label-floating">Department Name</label>
                                    <input id="dipname" type="text" class="form-control" >
                                </div>
                            </div>
                        </div>
                        <button id="saveDipBtn" class="btn btn-primary pull-right">Save Department</button>                        
                    </div>
                </div>
            </div>
        </div>
        
    </div>

</div>
<%@include file="template/footer.jsp" %>