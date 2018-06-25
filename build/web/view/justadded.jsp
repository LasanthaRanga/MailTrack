<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String pname = "just_added";%>
<%@include file="template/navbar.jsp" %>
<div class="content">
    <div class="container-fluid">
        <div class="col-md-12" >
            <div class="card">
                <div class="card-header card-header-primary">
                    <h4 class="card-title ">Simple Table</h4>
                    <p class="card-category"> Here is a subtitle for this table</p>
                </div>
                <div class="card-body">
                    <div class="table-responsive">
                        <table class="table">
                            <thead class=" text-primary">
                                <th>ID</th>
                                <th>Sender Name</th>
                                <th>Institute </th>
                                <th>Date</th>
                                <th>Title</th>
                                <th>More</th>
                            </thead>
                            <tbody>
                                <tr>
                                
                                    <td> 1</td>
                                    <td> දැන් හරි</td>
                                    <td> Niger </td>
                                    <td> 2018.10.10</td>
                                    <td> Water</td>
                                    <td><a href="../view/fullview.jsp" class="btn btn-info btn-sm"> Link</a></td>
                                </tr>
                                 <tr>
                                    <td> 2</td>
                                    <td> Dakota Rice  </td>
                                    <td> Niger </td>
                                    <td> 2018.10.10</td>
                                    <td> Water</td>
                                    <td><a href="../view/fullview.jsp"> Link</a></td>
                                </tr>
                                 <tr>
                                    <td> 3</td>
                                    <td> Dakota Rice  </td>
                                    <td> Niger </td>
                                    <td> 2018.10.10</td>
                                    <td> Water</td>
                                    <td><a href="../view/fullview.jsp"> Link</a></td>
                                </tr>
                                 <tr>
                                    <td> 4</td>
                                    <td> Dakota Rice  </td>
                                    <td> Niger </td>
                                    <td> 2018.10.10</td>
                                    <td> Water</td>
                                    <td><a href=""> Link</a></td>
                                </tr>
                                 <tr>
                                    <td> 5</td>
                                    <td> Dakota Rice  </td>
                                    <td> Niger </td>
                                    <td> 2018.10.10</td>
                                    <td> Water</td>
                                    <td><a href=""> Link</a></td>
                                </tr>
                                <tr>  
                                    <td>  6 </td>
                                    <td> Minerva Hooper </td>
                                    <td> Curaçao </td>
                                    <td> Sinaai-Waas </td>
                                    <td>  $23,789 </td>
                                    <td class="text-primary">  Link </td>
                                </tr>
                                
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>

        </div>        
    </div>
</div>
<%@include file="template/footer.jsp" %>