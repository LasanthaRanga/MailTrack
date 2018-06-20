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
            Login to Mail Track
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
        <div class="col-md-4 offset-md-4">
            <br>
            <br>
            <hr>
            <div class="col-md-12">
                <div class="card">
                    <div class="card-header card-header-success">
                        <h4 class="card-title ">Login</h4>
                        <p class="card-category">Login to Mail Track </p>
                    </div>
                    <div class="card-body">
                        <form action="../Login" method="POST">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Email</label>
                                        <input name="email" type="email" class="form-control" required="">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <label class="bmd-label-floating">Password</label>
                                        <input name="pword" type="password" class="form-control" required="">
                                    </div>
                                </div>
                            </div>
                            <button type="submit" class="btn btn-success btn-block">Login</button>
                            <div class="clearfix"></div>
                            <p class="card-category" style="text-align: center;">if you forget you password <a href="">click here</a></p>
                        </form>
                    </div>
                </div>
                <hr>
            </div>
        </div>
    </body>

    <script src="../assets/js/core/jquery.min.js"></script>
    <script src="../assets/js/core/popper.min.js"></script>
    <script src="../assets/js/bootstrap-material-design.js"></script>
    <script src="../assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
    <!--  Charts Plugin, full documentation here: https://gionkunz.github.io/chartist-js/ -->
    <script src="../assets/js/plugins/chartist.min.js"></script>
    <!-- Library for adding dinamically elements -->
    <script src="../assets/js/plugins/arrive.min.js" type="text/javascript"></script>
    <!--  Notifications Plugin, full documentation here: http://bootstrap-notify.remabledesigns.com/    -->
    <script src="../assets/js/plugins/bootstrap-notify.js"></script>
    <!-- Material Dashboard Core initialisations of plugins and Bootstrap Material Design Library -->
    <script src="../assets/js/material-dashboard.js?v=2.0.0"></script>
    <!-- demo init -->
    <script src="../assets/js/plugins/demo.js"></script>
</html>
