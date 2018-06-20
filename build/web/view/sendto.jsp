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
                                    <select class="form-control">
                                        <option value=""></option>
                                        <option value="">Department Head</option>
                                        <option value="">User Head</option>
                                        <option value="">two</option>
                                        <option value="">there</option>
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
                                <h4 class="card-title ">Members in This Department</h4>
                                <p class="card-category">Select To send</p>
                            </div>
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table">
                                        <thead class=" text-primary">
                                        <th>ID</th>
                                        <th>Member Name</th>
                                        <th>Designation </th>
                                        <th>Type</th>
                                        
                                        <th>More</th>
                                        </thead>
                                        <tbody>
                                            <tr>

                                                <td> 1</td>
                                                <td> දැන් හරි</td>
                                                <td> Niger </td>
                                                <td> 2018.10.10</td>
                                              
                                                <td><input  type="checkbox" name="vehicle" value="Bike"></td>
                                            </tr>
                                            <tr>
                                                <td> 2</td>
                                                <td> Dakota Rice  </td>
                                                <td> Niger </td>
                                                <td> 2018.10.10</td>
                                             
                                                <td>  <input  type="checkbox" name="vehicle" value="Bike"></td>
                                            </tr>
                                            <tr>
                                                <td> 3</td>
                                                <td> Dakota Rice  </td>
                                                <td> Niger </td>
                                                <td> 2018.10.10</td>
                                               
                                                <td><input  type="checkbox" name="vehicle" value="Bike"></td>
                                            </tr>
                                            <tr>
                                                <td> 4</td>
                                                <td> Dakota Rice  </td>
                                                <td> Niger </td>
                                                <td> 2018.10.10</td>
                                             
                                                <td><input  type="checkbox" name="vehicle" value="Bike"></td>
                                            </tr>
                                            <tr>
                                                <td> 5</td>
                                                <td> Dakota Rice  </td>
                                                <td> Niger </td>
                                                <td> 2018.10.10</td>
                                                
                                                <td><input  type="checkbox" name="vehicle" value="Bike"></td>
                                            </tr>
                                            <tr>  
                                                <td>  6 </td>
                                                <td> Minerva Hooper </td>
                                                <td> Curaçao </td>
                                                <td> Sinaai-Waas </td>
                                             
                                                <td class="text-primary">  Link </td>
                                            </tr>

                                        </tbody>
                                    </table>
                                </div>
                                <button class="btn btn-primary pull-right ">Send To Selected Members</button> 
                            </div>
                        </div>

                    </div>   

                    
          



            </div>
        </div>

    </div>

</div>
<%@include file="template/footer.jsp" %>