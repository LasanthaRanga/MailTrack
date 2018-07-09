<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <!-- Favicons -->
        <link rel="apple-touch-icon" href="../assets/img/apple-icon.png">
        <link rel="icon" href="../assets/img/favicon.png">
        <title>
            Mail Track
        </title>
        <!--     Fonts and icons     -->
        <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" />
        <link rel="stylesheet" href="../assets/css/material-dashboard.css?v=2.0.0">
        <!-- Documentation extras -->
        <!-- CSS Just for demo purpose, don't include it in your project -->
        <link href="../assets/assets-for-demo/demo.css" rel="stylesheet" />
        <!-- iframe removal -->
    </head>
    <%@page import="java.util.ArrayList"%>
    <%

        HashMap<String, String> plList = null;
        if (request.getSession().getAttribute("luid") != null) {
            if (request.getSession().getAttribute("pl") != null) {
                plList = (HashMap<String, String>) request.getSession().getAttribute("pl");
                boolean ok = false;

                for (Map.Entry<String, String> entry : plList.entrySet()) {
                    if (entry.getKey().equals(pname)) {
                        ok = true;
                        break;
                    } else {
                        ok = false;
                    }
                }
                if (!ok) {
                    for (Map.Entry<String, String> entry : plList.entrySet()) {
                        if (entry.getValue() != null) {
                            response.sendRedirect(entry.getValue());
                        }
                    }
                }
            }
        } else {
            response.sendRedirect("login.jsp");
        }


    %>
    <body class="">
        <div class="wrapper">
            <div class="sidebar" data-color="green" data-background-color="white" data-image="../assets/img/sidebar-1.jpg">
                <!--
            Tip 1: You can change the color of the sidebar using: data-color="purple | azure | green | orange | danger"
    
            Tip 2: you can also add an image using data-image tag
                -->
                <div class="logo">
                    <a href="" class="simple-text logo-normal">
                        Mail Track
                    </a>
                </div>
                <div class="sidebar-wrapper">
                    <ul class="nav">


                        <%                            if (plList != null) {
                                for (Map.Entry<String, String> entry : plList.entrySet()) {
                                    if (entry.getKey().equals("dip")) {%>
                        <li class="nav-item <% if (pname.equals("dip")) {
                                out.print("active");
                            } %>">
                            <a class="nav-link" href="../view/dipartment.jsp">
                                <i class="material-icons">extension</i>
                                <p>Department</p>
                            </a>
                        </li>
                        <% break;
                                    }
                                }
                            } %>



                        <%
                            if (plList != null) {
                                for (Map.Entry<String, String> entry : plList.entrySet()) {
                                    if (entry.getKey().equals("user_reg")) {%> 
                        <li class="nav-item <% if (pname.equals("user_reg")) {
                                out.print("active");
                            } %>">
                            <a class="nav-link" href="../view/user_registraton.jsp">
                                <i class="material-icons">person</i>
                                <p>User Registration</p>
                            </a>
                        </li>
                        <% break;
                                    }
                                }
                            } %>

                        <%   if (plList != null) {
                                for (Map.Entry<String, String> entry : plList.entrySet()) {
                                    if (entry.getKey().equals("new")) {%> 
                        <li class="nav-item <% if (pname.equals("new")) {
                                out.print("active");
                            } %>">
                            <a class="nav-link" href="../view/create_new.jsp">
                                <i class="material-icons">mail_outline</i>
                                <p>New Mail</p>
                            </a>
                        </li>
                        <% break;
                                    }
                                }
                            } %>

                        <%   if (plList != null) {
                                for (Map.Entry<String, String> entry : plList.entrySet()) {
                                    if (entry.getKey().equals("received_all")) {%> 
                        <li class="nav-item <% if (pname.equals("received_all")) {
                                out.print("active");
                            } %>">
                            <a class="nav-link" href="../view/received_all.jsp">
                                <i class="material-icons">move_to_inbox</i>
                                <p>Received All</p>
                            </a>
                        </li>
                        <% break;
                                    }
                                }
                            } %>


                        <%   if (plList != null) {
                                for (Map.Entry<String, String> entry : plList.entrySet()) {
                                    if (entry.getKey().equals("mymail")) {%> 
                        <li class="nav-item <% if (pname.equals("mymail")) {
                                out.print("active");
                            } %>">
                            <a class="nav-link" href="../view/mymail.jsp">
                                <i class="material-icons">mail_outline</i>
                                <p>Received Mail</p>
                            </a>
                        </li>
                        <% break;
                                    }
                                }
                            } %>

                        <%   if (plList != null) {
                                for (Map.Entry<String, String> entry : plList.entrySet()) {
                                    if (entry.getKey().equals("edit")) {%> 
                        <li class="nav-item <% if (pname.equals("edit")) {
                                out.print("active");
                            }%>">
                            <a class="nav-link" href="../view/edit.jsp">
                                <i class="material-icons">comment</i>
                                <p>Edit Mail</p>
                            </a>
                        </li>
                        <% break;
                                    }
                                }
                            }%>



                        <%   if (plList != null) {
                                    for (Map.Entry<String, String> entry : plList.entrySet()) {
                                        if (entry.getKey().equals("just_added")) {%> 
                        <li class="nav-item <% if (pname.equals("just_added")) {
                                out.print("active");
                            }%>">
                            <a class="nav-link" href="../view/justadded.jsp">
                                <i class="material-icons">comment</i>
                                <p>Just Added</p>
                            </a>
                        </li>
                        <% break;
                                    }
                                }
                            }%>



                        <%   if (plList != null) {
                                    for (Map.Entry<String, String> entry : plList.entrySet()) {
                                        if (entry.getKey().equals("allfor_handl")) {%> 
                        <li class="nav-item <% if (pname.equals("allfor_handl")) {
                                out.print("active");
                            }%>">
                            <a class="nav-link" href="../view/allforhandl.jsp">
                                <i class="material-icons">comment</i>
                                <p>For Send </p>
                            </a>
                        </li>
                        <% break;
                                    }
                                }
                            }%>


                        <%   if (plList != null) {
                                     for (Map.Entry<String, String> entry : plList.entrySet()) {
                                         if (entry.getKey().equals("search")) {%> 
                        <li class="nav-item <% if (pname.equals("search")) {
                                out.print("active");
                            }%>">
                            <a class="nav-link" href="../view/search.jsp">
                                <i class="material-icons">search</i>
                                <p>Search</p>
                            </a>
                        </li>
                        <% break;
                                    }
                                }
                            }%>






                    </ul>
                </div>
            </div>
            <div class="main-panel">
                <!-- Navbar -->
                <nav class="navbar navbar-expand-lg navbar-transparent  navbar-absolute fixed-top">
                    <div class="container-fluid">
                        <div class="navbar-wrapper">
                            <!--<a class="navbar-brand" href="#pablo">Material Dashboard</a>-->
                        </div>
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="navbar-toggler-icon icon-bar"></span>
                            <span class="navbar-toggler-icon icon-bar"></span>
                            <span class="navbar-toggler-icon icon-bar"></span>
                        </button>
                        <div class="collapse navbar-collapse justify-content-end" id="navigation">

                            <ul class="navbar-nav">

                                <!--                                <li class="nav-item dropdown">
                                                                    <a class="nav-link" href="" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                                        <i class="material-icons">notifications</i>
                                                                        <span class="notification">5</span>
                                                                        <p>
                                                                            <span class="d-lg-none d-md-block">Some Actions</span>
                                                                        </p>
                                                                    </a>
                                                                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                                                                        <a class="dropdown-item" href="#">Mike John responded to your email</a>
                                                                        <a class="dropdown-item" href="#">You have 5 new tasks</a>
                                                                        <a class="dropdown-item" href="#">You're now friend with Andrew</a>
                                                                        <a class="dropdown-item" href="#">Another Notification</a>
                                                                        <a class="dropdown-item" href="#">Another One</a>
                                                                    </div>
                                                                </li>-->



                                <li class="nav-item dropdown">
                                    <a class="nav-link" href="" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        <i class="material-icons">person</i>
                                        <!--                                        <p>
                                                                                    <span class="d-lg-none d-md-block">Some Actions</span>
                                                                                </p>-->
                                    </a>
                                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                                        <a class="dropdown-item" href="../LogOut">Sing Out</a>
                                        <a class="dropdown-item" href="#">Other</a>
                                    </div>
                                </li>

                            </ul>
                        </div>
                    </div>
                </nav>
                <!-- End Navbar -->