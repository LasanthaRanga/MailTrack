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
                                <div class="col-md-4">
                                    <h5>My Number : <strong><%=mailinfo.getMailInfoMyNo()%></strong></h5>
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

                        <form action="../SendToDep" method="POST">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Description</label>
                                        <textarea name="comment" required="" rows="5" id="dipname" type="text" class="form-control" ></textarea>
                                    </div>
                                </div>

                            </div>
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
                                        <select name="month" class="form-control">
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

                                <div class="col-md-1">
                                    <div class="form-group label-floating">
                                        <label class="control-label">Day</label>
                                        <select name="day" class="form-control">
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




                                <div class="col-md-5 offset-md-1"> 
                                    <div class="form-group label-floating"> 
                                        <label class="control-label">Department</label>
                                        <select name="dip" class="form-control">
                                            <% HashMap<Integer, String> hmd = modle.GetInstans.getDepartment().getDepartmentList();
                                                for (Map.Entry<Integer, String> en : hmd.entrySet()) {
                                                    Integer key = en.getKey();
                                                    String val = en.getValue();%>
                                            <option value="<%=key%>"><%=val%></option>
                                            <%}%>
                                        </select>
                                    </div>
                                </div>
                            </div>
                          


                            <button type="submit" name="latter" value="<%=request.getParameter("latter") %>" class="btn btn-success pull-right" >Send To</button>    
                        </form>
                    </div>
                </div>
            </div>
        </div>

    </div>

</div>
<%@include file="template/footer.jsp" %>