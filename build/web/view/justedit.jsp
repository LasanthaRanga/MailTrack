<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Session"%>
<% String pname = "just_edit";%>
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




                            <form method="POST" action="../UpdateData">
                                <div class="row">
                                    <div class="col-md-7">
                                        <div class="form-group">
                                            <label class="bmd-label-floating">Sender Name</label>
                                            <input name="sender_name" type="text" class="form-control" value="<%=mailinfo.getMailInfoSender()%>" >
                                        </div>
                                    </div>
                                    <div class="col-md-5">
                                        <div class="form-group">
                                            <label class="bmd-label-floating">Institute</label>
                                            <input name="institute" type="text" class="form-control" value="<%=mailinfo.getMailInfoInstitute()%>" >
                                        </div>
                                    </div>
                                </div>




                                <% Date rd = mailinfo.getMailInfoReceivedDate();
                                    String year = new SimpleDateFormat("yyyy").format(rd);
                                    String month = new SimpleDateFormat("MM").format(rd);
                                    String date = new SimpleDateFormat("dd").format(rd);
                                    rd.getMonth();
                                    rd.getDate();
                                %>  



                                <div class="form-inline" >
                                    <div class="form-group">
                                        <label for="email">Year: </label>
                                        <input name="" type="text" class="form-control col-md-3" id="email">
                                    </div>
                                    <div class="form-group">
                                        <label for="pwd">Month: </label>
                                        <input name="" type="text" class="form-control col-md-3" id="pwd">
                                    </div>
                                    <div class="form-group">
                                        <label for="pwd">Day: </label>
                                        <input name="" type="text" class="form-control col-md-3" id="pwd">
                                    </div>

                                </div>



                                <div class="form-inline" >
                                    <div class="form-group">
                                        <label for="email">Year: </label>
                                        <input name="" type="text" class="form-control col-md-3" id="email">
                                    </div>
                                    <div class="form-group">
                                        <label for="pwd">Month: </label>
                                        <input name="" type="text" class="form-control col-md-3" id="pwd">
                                    </div>
                                    <div class="form-group">
                                        <label  for="pwd">Day: </label>
                                        <input name="" type="text" class="form-control col-md-3" id="pwd">
                                    </div>

                                </div>





                        </div>
                        <div class="col-md-6 ">
                            <div class="row">
                                <div class="col-md-2">
                                    <div class="form-group label-floating">
                                        <label class="control-label">Year</label>
                                        <input name="lyear"  type="text" class="datepicker form-control"  value="2018">

                                    </div>
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
                                    <% for (Map.Entry<Integer, String> cl : modle.GetInstans.getMailCatagory().getCatagoryList().entrySet()) {%>                                                
                                    <option value="<%=cl.getKey()%>"><%=cl.getValue()%></option>                                                
                                    <% } %>
                                </select>
                            </div>
                        </div>
                    </div>
                </div>
                <button type="submit" id="" class="btn btn-primary pull-right">Add Mail</button>         
                </form>





















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

            <a href="../view/sendto.jsp" class="btn btn-primary pull-left" >Edit</a>                        
            <a href="../SendToCommissioner?latter=<%=request.getParameter("latter")%>" class="btn btn-success pull-right" >Send tO Commissioner</a>                        
        </div>
    </div>
</div>
</div>

</div>

</div>

<%@include file="template/footer.jsp" %>
<script>
    function selectItemByValue(elmnt, value) {
        for (var i = 0; i < elmnt.options.length; i++) {
            if (elmnt.options[i].value === value) {
                elmnt.selectedIndex = i;
                break;
            }
        }
    }

</script>
</script>