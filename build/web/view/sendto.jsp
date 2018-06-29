<%@page import="org.hibernate.Criteria"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="org.hibernate.validator.constraints.br.CNPJ"%>
<%@page import="java.util.Set"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.jboss.classfilewriter.annotations.IntAnnotationValue"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String pname = "received_all";%>
<%@include file="template/navbar.jsp" %>
<div class="content">
    <div class="container-fluid">
        <div class="col-md-12" >
            <div class="card">
                <div class="card-header card-header-primary">
                    <h4 class="card-title">Send</h4>
                    <p class="card-category">Department Registration Form</p>
                </div>
                <div class="card-body">
                    <div class="card-body">
                        <div class="row">
                            <div class="col-md-4">
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
                        </div>
                        <button class="btn btn-primary ">Send To Department Head</button> 
                    </div>
                </div>





                <div class="col-md-12" >
                    <div class="card">
                        <div class="card-header card-header-info">
                            <h4 class="card-title ">Members in <%=modle.GetInstans.getDepartment().getDepOfLogUser(Integer.parseInt(session.getAttribute("luid").toString()))%> Department</h4>
                            <p class="card-category">Select To send</p>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table">
                                    <thead class=" text-primary">
                                    <th>ID</th>
                                    <th>Member Name</th>
                                    <th>Designation </th>
                                    <th>More</th>
                                    </thead>
                                    <tbody>
                                    <form method="POST" action="../SendToEmployee">

                                        <%

                                            Session UserSess = conn.NewHibernateUtil.getSessionFactory().openSession();
                                            pojo.Department dip = null;
                                            try {
                                                pojo.User user = (pojo.User) UserSess.load(pojo.User.class, Integer.parseInt(session.getAttribute("luid").toString()));
                                                Set<pojo.Userhasdepartment> userhasdepartments = user.getUserhasdepartments();
                                                for (pojo.Userhasdepartment userhasdepartment : userhasdepartments) {
                                                    dip = userhasdepartment.getDepartment();
                                                }

                                                Criteria cr = UserSess.createCriteria(pojo.Userhasdepartment.class);
                                                List<pojo.Userhasdepartment> uhdl = cr.add(Restrictions.eq("department", dip)).list();

                                                for (pojo.Userhasdepartment uhd : uhdl) {
                                                    if (uhd.getUser() != user) {
                                                    }

                                        %>

                                        <tr>
                                        <input type="hidden" name="<%=uhd.getUser().getIdUser()%>">
                                        <td><%=uhd.getUser().getIdUser()%></td>
                                        <td><%=uhd.getUser().getUserFullName()%></td>
                                        <td><%=uhd.getUser().getUserDesignation()%></td>
                                        <td><input  type="checkbox" name="uid" value="<%=uhd.getUser().getIdUser()%>"></td>
                                        </tr>


                                        <%  }

                                            } catch (Exception e) {
                                                e.printStackTrace();
                                            } finally {
                                                UserSess.close();
                                            }


                                        %>


                                        </tbody>
                                </table>
                                <button type="submit" class="btn btn-primary pull-right ">Send To Selected Members</button> 
                                </form>
                            </div>

                        </div>
                    </div>

                </div>   






            </div>
        </div>

    </div>

</div>
<%@include file="template/footer.jsp" %>