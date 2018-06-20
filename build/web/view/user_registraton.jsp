<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String pname = "user_reg";%>
<%@include file="template/navbar.jsp" %>
<div class="content">
    <div class="container-fluid">


        <div class="row">
            <div class="col-md-8 offset-md-2">
                <div class="card card-profile">
                    <div class="card-avatar">
                        <a href="#pablo">
                            <img class="img" src="../assets/img/faces/marc.jpg" />
                        </a>
                    </div>
                    <div class="card-header card-header-primary">
                        <h4 class="card-title">User Profile</h4>
                        <p class="card-category">Complete user profile</p>
                    </div>
                    <div class="card-body">
                        <form action="../UserReg" method="POST">
                            <div class="row">   
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Category</label>
                                        <select name="ucat" class="form-control">
                                            <option value="0"></option>
                                            <% HashMap<Integer, String> hm = modle.GetInstans.getUserCategory().getUserCatList();
                                                for (Map.Entry<Integer, String> en : hm.entrySet()) {
                                                    Integer key = en.getKey();
                                                    String val = en.getValue();%>
                                                    <option value="<%=key%>"><%=val%></option>
                                            <%}%>
                                        </select>                                        
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Department</label>
                                        <select name="dip" class="form-control">                                            
                                            <option value="0"></option>
                                            <% HashMap<Integer, String> hmd = modle.GetInstans.getDepartment().getDepartmentList();                                            
                                            for (Map.Entry<Integer, String> en : hmd.entrySet()) {
                                                    Integer key = en.getKey();
                                                    String val = en.getValue();%>
                                                    <option value="<%=key%>"><%=val%></option>
                                            <%}%>
                                        </select>                                        
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Full Name</label>
                                        <input name="fullname" type="text" class="form-control" required="">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Email</label>
                                        <input name="email" type="email" class="form-control" required="">
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Password</label>
                                        <input name="pword" type="password" class="form-control" required="">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Designation</label>
                                        <input name="des" type="text" class="form-control">
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">NIC</label>
                                        <input name="nic" type="text" class="form-control">
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group">
                                    <button type="submit" class="btn btn-lg btn-primary">Update Profile</button>
                                </div>
                            </div>
                            <div class="clearfix"></div>
                        </form>
                    </div>
                </div>
            </div>           
        </div>






    </div>
</div>
<%@include file="template/footer.jsp" %>