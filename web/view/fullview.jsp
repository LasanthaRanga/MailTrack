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
                                    <input required="" id="dipname" type="text" class="form-control" >
                                </div>
                            </div>

                        </div>

                        <!--DeadLine-->
                        <div class="row">
                            <h4><strong>Set Deadline</strong></h4>
                            <div class="col-md-1">
                                <div class="form-group label-floating">
                                    <label class="control-label">Year</label>
                                    <input name="year"  type="text" class="datepicker form-control"  value="2018">
                                </div>
                            </div>
                            <div class="col-md-2">
                                <div class="form-group label-floating">
                                    <label class="control-label">Month</label>
                                    <select class="form-control">
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

                            <div class="col-md-1">
                                <div class="form-group label-floating">
                                    <label class="control-label">Day</label>
                                    <select class="form-control">
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



                        </div>    <!--DeadLine-->


                        <a href="../view/sendto.jsp" class="btn btn-primary pull-right" >Send TO</a>                        
                    </div>
                </div>
            </div>
        </div>

    </div>

</div>
<%@include file="template/footer.jsp" %>