<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String pname = "new";%>
<%@include file="template/navbar.jsp" %>
<div class="content">
    <div class="container-fluid">
        <div class="col-md-12" >
            <div class="card">
                <div class="card-header card-header-primary">
                    <h4 class="card-title">New Mail</h4>
                    <p class="card-category">Add new mail to system</p>
                </div>
                <div class="card-body">
                    <div class="card-body">
                        <form method="POST" action="../view/upload_mail.jsp">
                            <div class="row">
                                <div class="col-md-7">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Sender Name</label>
                                        <input name="sender_name" type="text" class="form-control" >
                                    </div>
                                </div>
                                <div class="col-md-5">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Institute</label>
                                        <input name="institute" type="text" class="form-control" >
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6 pull-left">
                                    <div class="row" >
                                        <div class="col-md-6" >
                                            <h5 >Recived Date</h5>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-2">
                                            <div class="form-group label-floating">
                                                <label class="control-label">Year</label>
                                                <input name="ryear"  type="text" class="datepicker form-control"  value="2018">
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="form-group label-floating">
                                                <label class="control-label">Month</label>
                                                <select class="form-control" name="rmonth">
                                                    <option value="0"></option>
                                                    <option value="1">01 January</option>
                                                    <option value="2">02 February</option>
                                                    <option value="3">03 March</option>
                                                    <option value="4">04 April</option>
                                                    <option value="5">05 May</option>
                                                    <option value="6">06 June</option>
                                                    <option value="7">07 July</option>
                                                    <option value="8">08 August</option>
                                                    <option value="9">09 September</option>
                                                    <option value="10">10 October</option>
                                                    <option value="11">11 November</option>
                                                    <option value="12">12 December</option>
                                                </select>  
                                            </div>
                                        </div>
                                        <div class="col-md-2">
                                            <div class="form-group label-floating">
                                                <label class="control-label">Day</label>
                                                <select class="form-control" name="rdate">
                                                    <option value="0"></option>
                                                    <option value="1">01</option>
                                                    <option value="2">02</option>
                                                    <option value="3">03</option>
                                                    <option value="4">04</option>
                                                    <option value="5">05</option>
                                                    <option value="6">06</option>
                                                    <option value="7">07</option>
                                                    <option value="8">08</option>
                                                    <option value="9">09</option>
                                                    <option value="10">10</option>
                                                    <option value="11">11</option>
                                                    <option value="12">12</option>
                                                    <option value="13">13</option>
                                                    <option value="14">14</option>
                                                    <option value="15">15</option>
                                                    <option value="16">16</option>
                                                    <option value="17">17</option>
                                                    <option value="18">18</option>
                                                    <option value="19">19</option>
                                                    <option value="21">21</option>
                                                    <option value="22">22</option>
                                                    <option value="23">23</option>
                                                    <option value="24">24</option>
                                                    <option value="25">25</option>
                                                    <option value="26">26</option>
                                                    <option value="27">27</option>
                                                    <option value="28">28</option>
                                                    <option value="29">29</option>
                                                    <option value="30">30</option>
                                                    <option value="31">31</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-6 pull-right">
                                    <div class="row " >
                                        <div class="col-md-12" >
                                            <h5 >Date of the latter</h5>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-2">
                                            <div class="form-group label-floating">
                                                <label class="control-label">Year</label>
                                                <input name="lyear"  type="text" class="datepicker form-control"  value="2018">
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="form-group label-floating">
                                                <label class="control-label">Month</label>
                                                <select class="form-control" name="lmonth">
                                                    <option value="0"></option>
                                                    <option value="1">01 January</option>
                                                    <option value="2">02 February</option>
                                                    <option value="3">03 March</option>
                                                    <option value="4">04 April</option>
                                                    <option value="5">05 May</option>
                                                    <option value="6">06 June</option>
                                                    <option value="7">07 July</option>
                                                    <option value="8">08 August</option>
                                                    <option value="9">09 September</option>
                                                    <option value="10">10 October</option>
                                                    <option value="11">11 November</option>
                                                    <option value="12">12 December</option>
                                                </select>  
                                            </div>
                                        </div>
                                        <div class="col-md-2">
                                            <div class="form-group label-floating">
                                                <label class="control-label">Day</label>
                                                <select class="form-control" name="ldate">
                                                    <option value="0"></option>
                                                    <option value="1">01</option>
                                                    <option value="2">02</option>
                                                    <option value="3">03</option>
                                                    <option value="4">04</option>
                                                    <option value="5">05</option>
                                                    <option value="6">06</option>
                                                    <option value="7">07</option>
                                                    <option value="8">08</option>
                                                    <option value="9">09</option>
                                                    <option value="10">10</option>
                                                    <option value="11">11</option>
                                                    <option value="12">12</option>
                                                    <option value="13">13</option>
                                                    <option value="14">14</option>
                                                    <option value="15">15</option>
                                                    <option value="16">16</option>
                                                    <option value="17">17</option>
                                                    <option value="18">18</option>
                                                    <option value="19">19</option>
                                                    <option value="21">21</option>
                                                    <option value="22">22</option>
                                                    <option value="23">23</option>
                                                    <option value="24">24</option>
                                                    <option value="25">25</option>
                                                    <option value="26">26</option>
                                                    <option value="27">27</option>
                                                    <option value="28">28</option>
                                                    <option value="29">29</option>
                                                    <option value="30">30</option>
                                                    <option value="31">31</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-7">
                                    <div class="form-group label-floating">
                                        <div class="form-group label-floating">
                                            <label class="control-label">Title</label>
                                            <input name="title"  type="text" class="datepicker form-control">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <div class="form-group label-floating">
                                        <label class="control-label">Page Count</label>
                                        <input name="pages"  type="text" class="datepicker form-control" required="">
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="form-group label-floating">
                                        <label class="control-label">My Number</label>
                                        <input name="myno"  type="text" class="datepicker form-control" >
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                    <div class="form-group label-floating">
                                        <div class="form-group label-floating">
                                            <label class="control-label">Mail Category</label>
                                            <select class="form-control" name="mailcat">
                                                <option value="0">Select One</option>
                                                <% for(Map.Entry<Integer, String> cl :modle.GetInstans.getMailCatagory().getCatagoryList().entrySet()){ %>                                                
                                                <option value="<%=cl.getKey()%>"><%=cl.getValue()%></option>                                                
                                                <% } %>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <button type="submit" id="" class="btn btn-primary pull-right">Add Mail</button>         
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file="template/footer.jsp" %>