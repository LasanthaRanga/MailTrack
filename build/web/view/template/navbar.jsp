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
                        
<!--                        <li class="nav-item">
                            <a class="nav-link" href="../examples/notifications.html">
                                <i class="material-icons">notifications</i>
                                <p>Notifications</p>
                            </a>
                        </li>-->
                        
                        <li class="nav-item <% if(pname.equals("dip"))out.print("active"); %>">
                            <a class="nav-link" href="../view/dipartment.jsp">
                                <i class="material-icons">extension</i>
                                <p>Dipartment</p>
                            </a>
                        </li>
                        
                        <li class="nav-item <% if(pname.equals("user_reg"))out.print("active"); %>">
                            <a class="nav-link" href="../view/user_registraton.jsp">
                                <i class="material-icons">person</i>
                                <p>User Registration</p>
                            </a>
                        </li>
                        
                         <li class="nav-item <% if(pname.equals("new"))out.print("active"); %>">
                            <a class="nav-link" href="../view/create_new.jsp">
                                <i class="material-icons">mail_outline</i>
                                <p>New Mail</p>
                            </a>
                        </li>
                        
                        <li class="nav-item <% if(pname.equals("received_all"))out.print("active"); %>">
                            <a class="nav-link" href="../view/received_all.jsp">
                                <i class="material-icons">move_to_inbox</i>
                                <p>Received All</p>
                            </a>
                        </li>
                        
                        <li class="nav-item <% if(pname.equals("mymail"))out.print("active"); %>">
                            <a class="nav-link" href="../view/mymail.jsp">
                                <i class="material-icons">mail_outline</i>
                                <p>Received Mail</p>
                            </a>
                        </li>
                        
                        <li class="nav-item <% if(pname.equals("edit"))out.print("active"); %>">
                            <a class="nav-link" href="../view/edit.jsp">
                                <i class="material-icons">comment</i>
                                <p>Edit Mail</p>
                            </a>
                        </li>
                       
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
<!--                            <form class="navbar-form">
                                <div class="input-group no-border">
                                    <input type="text" value="" class="form-control" placeholder="Search...">
                                    <button type="submit" class="btn btn-white btn-round btn-just-icon">
                                        <i class="material-icons">search</i>
                                        <div class="ripple-container"></div>
                                    </button>
                                </div>
                            </form>-->
                            <ul class="navbar-nav">
<!--                                <li class="nav-item">
                                    <a class="nav-link" href="#pablo">
                                        <i class="material-icons">dashboard</i>
                                        <p>
                                            <span class="d-lg-none d-md-block">Stats</span>
                                        </p>
                                    </a>
                                </li>-->
                                <li class="nav-item dropdown">
                                    <a class="nav-link" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
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
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#pablo">
                                        <i class="material-icons">person</i>
                                        <p>
                                            <span class="d-lg-none d-md-block">Account</span>
                                        </p>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>
                <!-- End Navbar -->