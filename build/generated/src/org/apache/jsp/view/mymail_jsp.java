package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public final class mymail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/view/template/navbar.jsp");
    _jspx_dependants.add("/view/template/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
 String pname = "mymail";

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0\" name=\"viewport\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("        <!-- Favicons -->\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"../assets/img/apple-icon.png\">\n");
      out.write("        <link rel=\"icon\" href=\"../assets/img/favicon.png\">\n");
      out.write("        <title>\n");
      out.write("            Mail Track\n");
      out.write("        </title>\n");
      out.write("        <!--     Fonts and icons     -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/material-dashboard.css?v=2.0.0\">\n");
      out.write("        <!-- Documentation extras -->\n");
      out.write("        <!-- CSS Just for demo purpose, don't include it in your project -->\n");
      out.write("        <link href=\"../assets/assets-for-demo/demo.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- iframe removal -->\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    ");


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


    
      out.write("\n");
      out.write("    <body class=\"\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div class=\"sidebar\" data-color=\"green\" data-background-color=\"white\" data-image=\"../assets/img/sidebar-1.jpg\">\n");
      out.write("                <!--\n");
      out.write("            Tip 1: You can change the color of the sidebar using: data-color=\"purple | azure | green | orange | danger\"\n");
      out.write("    \n");
      out.write("            Tip 2: you can also add an image using data-image tag\n");
      out.write("                -->\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <a href=\"\" class=\"simple-text logo-normal\">\n");
      out.write("                        Mail Track\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sidebar-wrapper\">\n");
      out.write("                    <ul class=\"nav\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");
                            if (plList != null) {
                                for (Map.Entry<String, String> entry : plList.entrySet()) {
                                    if (entry.getKey().equals("dip")) {
      out.write("\n");
      out.write("                        <li class=\"nav-item ");
 if (pname.equals("dip")) {
                                out.print("active");
                            } 
      out.write("\">\n");
      out.write("                            <a class=\"nav-link\" href=\"../view/dipartment.jsp\">\n");
      out.write("                                <i class=\"material-icons\">extension</i>\n");
      out.write("                                <p>Department</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
 break;
                                    }
                                }
                            } 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");

                            if (plList != null) {
                                for (Map.Entry<String, String> entry : plList.entrySet()) {
                                    if (entry.getKey().equals("user_reg")) {
      out.write(" \n");
      out.write("                        <li class=\"nav-item ");
 if (pname.equals("user_reg")) {
                                out.print("active");
                            } 
      out.write("\">\n");
      out.write("                            <a class=\"nav-link\" href=\"../view/user_registraton.jsp\">\n");
      out.write("                                <i class=\"material-icons\">person</i>\n");
      out.write("                                <p>User Registration</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
 break;
                                    }
                                }
                            } 
      out.write("\n");
      out.write("\n");
      out.write("                        ");
   if (plList != null) {
                                for (Map.Entry<String, String> entry : plList.entrySet()) {
                                    if (entry.getKey().equals("new")) {
      out.write(" \n");
      out.write("                        <li class=\"nav-item ");
 if (pname.equals("new")) {
                                out.print("active");
                            } 
      out.write("\">\n");
      out.write("                            <a class=\"nav-link\" href=\"../view/create_new.jsp\">\n");
      out.write("                                <i class=\"material-icons\">mail_outline</i>\n");
      out.write("                                <p>New Mail</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
 break;
                                    }
                                }
                            } 
      out.write("\n");
      out.write("\n");
      out.write("                        ");
   if (plList != null) {
                                for (Map.Entry<String, String> entry : plList.entrySet()) {
                                    if (entry.getKey().equals("received_all")) {
      out.write(" \n");
      out.write("                        <li class=\"nav-item ");
 if (pname.equals("received_all")) {
                                out.print("active");
                            } 
      out.write("\">\n");
      out.write("                            <a class=\"nav-link\" href=\"../view/received_all.jsp\">\n");
      out.write("                                <i class=\"material-icons\">move_to_inbox</i>\n");
      out.write("                                <p>Received All</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
 break;
                                    }
                                }
                            } 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");
   if (plList != null) {
                                for (Map.Entry<String, String> entry : plList.entrySet()) {
                                    if (entry.getKey().equals("mymail")) {
      out.write(" \n");
      out.write("                        <li class=\"nav-item ");
 if (pname.equals("mymail")) {
                                out.print("active");
                            } 
      out.write("\">\n");
      out.write("                            <a class=\"nav-link\" href=\"../view/mymail.jsp\">\n");
      out.write("                                <i class=\"material-icons\">mail_outline</i>\n");
      out.write("                                <p>Received Mail</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
 break;
                                    }
                                }
                            } 
      out.write("\n");
      out.write("\n");
      out.write("                        ");
   if (plList != null) {
                                for (Map.Entry<String, String> entry : plList.entrySet()) {
                                    if (entry.getKey().equals("edit")) {
      out.write(" \n");
      out.write("                        <li class=\"nav-item ");
 if (pname.equals("edit")) {
                                out.print("active");
                            }
      out.write("\">\n");
      out.write("                            <a class=\"nav-link\" href=\"../view/edit.jsp\">\n");
      out.write("                                <i class=\"material-icons\">comment</i>\n");
      out.write("                                <p>Edit Mail</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
 break;
                                    }
                                }
                            }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");
   if (plList != null) {
                                    for (Map.Entry<String, String> entry : plList.entrySet()) {
                                        if (entry.getKey().equals("just_added")) {
      out.write(" \n");
      out.write("                        <li class=\"nav-item ");
 if (pname.equals("just_added")) {
                                out.print("active");
                            }
      out.write("\">\n");
      out.write("                            <a class=\"nav-link\" href=\"../view/justadded.jsp\">\n");
      out.write("                                <i class=\"material-icons\">comment</i>\n");
      out.write("                                <p>Just Added</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
 break;
                                    }
                                }
                            }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");
   if (plList != null) {
                                    for (Map.Entry<String, String> entry : plList.entrySet()) {
                                        if (entry.getKey().equals("allfor_handl")) {
      out.write(" \n");
      out.write("                        <li class=\"nav-item ");
 if (pname.equals("allfor_handl")) {
                                out.print("active");
                            }
      out.write("\">\n");
      out.write("                            <a class=\"nav-link\" href=\"../view/allforhandl.jsp\">\n");
      out.write("                                <i class=\"material-icons\">comment</i>\n");
      out.write("                                <p>For Send </p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
 break;
                                    }
                                }
                            }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");
   if (plList != null) {
                                     for (Map.Entry<String, String> entry : plList.entrySet()) {
                                         if (entry.getKey().equals("search")) {
      out.write(" \n");
      out.write("                        <li class=\"nav-item ");
 if (pname.equals("search")) {
                                out.print("active");
                            }
      out.write("\">\n");
      out.write("                            <a class=\"nav-link\" href=\"../view/search.jsp\">\n");
      out.write("                                <i class=\"material-icons\">search</i>\n");
      out.write("                                <p>Search</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
 break;
                                    }
                                }
                            }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"main-panel\">\n");
      out.write("                <!-- Navbar -->\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-transparent  navbar-absolute fixed-top\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"navbar-wrapper\">\n");
      out.write("                            <!--<a class=\"navbar-brand\" href=\"#pablo\">Material Dashboard</a>-->\n");
      out.write("                        </div>\n");
      out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navigation\" aria-controls=\"navigation-index\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"navbar-toggler-icon icon-bar\"></span>\n");
      out.write("                            <span class=\"navbar-toggler-icon icon-bar\"></span>\n");
      out.write("                            <span class=\"navbar-toggler-icon icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"collapse navbar-collapse justify-content-end\" id=\"navigation\">\n");
      out.write("\n");
      out.write("                            <ul class=\"navbar-nav\">\n");
      out.write("\n");
      out.write("                                <!--                                <li class=\"nav-item dropdown\">\n");
      out.write("                                                                    <a class=\"nav-link\" href=\"\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                                                        <i class=\"material-icons\">notifications</i>\n");
      out.write("                                                                        <span class=\"notification\">5</span>\n");
      out.write("                                                                        <p>\n");
      out.write("                                                                            <span class=\"d-lg-none d-md-block\">Some Actions</span>\n");
      out.write("                                                                        </p>\n");
      out.write("                                                                    </a>\n");
      out.write("                                                                    <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"#\">Mike John responded to your email</a>\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"#\">You have 5 new tasks</a>\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"#\">You're now friend with Andrew</a>\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"#\">Another Notification</a>\n");
      out.write("                                                                        <a class=\"dropdown-item\" href=\"#\">Another One</a>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </li>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <li class=\"nav-item dropdown\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                        <i class=\"material-icons\">person</i>\n");
      out.write("                                        <!--                                        <p>\n");
      out.write("                                                                                    <span class=\"d-lg-none d-md-block\">Some Actions</span>\n");
      out.write("                                                                                </p>-->\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"../LogOut\">Sing Out</a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Other</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("                <!-- End Navbar -->");
      out.write("\n");
      out.write("<div class=\"content\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<footer class=\"footer \">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <nav class=\"pull-left\">\n");
      out.write("            <!--                        <ul>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"https://www.creative-tim.com\">\n");
      out.write("                                                Creative Tim\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"http://presentation.creative-tim.com\">\n");
      out.write("                                                About Us\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"http://blog.creative-tim.com\">\n");
      out.write("                                                Blog\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"https://www.creative-tim.com/license\">\n");
      out.write("                                                Licenses\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>-->\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"copyright pull-right\">\n");
      out.write("            &copy; WDA 2018\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!--                        &copy;\n");
      out.write("                                    <script>\n");
      out.write("                                        document.write(new Date().getFullYear())\n");
      out.write("                                    </script>, made with love by\n");
      out.write("                                    <a href=\"\" target=\"_blank\">Creative Tim</a> for a better web.\n");
      out.write("                                </div>-->\n");
      out.write("        </div>\n");
      out.write("</footer>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("<!--   Core JS Files   -->\n");
      out.write("<script src=\"../assets/js/core/jquery.min.js\"></script>\n");
      out.write("<script src=\"../assets/js/core/popper.min.js\"></script>\n");
      out.write("<script src=\"../assets/js/bootstrap-material-design.js\"></script>\n");
      out.write("<script src=\"../assets/js/plugins/perfect-scrollbar.jquery.min.js\"></script>\n");
      out.write("<!--  Charts Plugin, full documentation here: https://gionkunz.github.io/chartist-js/ -->\n");
      out.write("<script src=\"../assets/js/plugins/chartist.min.js\"></script>\n");
      out.write("<!-- Library for adding dinamically elements -->\n");
      out.write("<script src=\"../assets/js/plugins/arrive.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<!--  Notifications Plugin, full documentation here: http://bootstrap-notify.remabledesigns.com/    -->\n");
      out.write("<script src=\"../assets/js/plugins/bootstrap-notify.js\"></script>\n");
      out.write("<!-- Material Dashboard Core initialisations of plugins and Bootstrap Material Design Library -->\n");
      out.write("<script src=\"../assets/js/material-dashboard.js?v=2.0.0\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- demo init -->\n");
      out.write("<script src=\"../assets/js/plugins/demo.js\"></script>\n");
      out.write("<!--<script src=\"../assets/js/bootstrap-datepicker.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"../assets/js/material-kit.js\" type=\"text/javascript\"></script>-->\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function () {\n");
      out.write("\n");
      out.write("        //init wizard\n");
      out.write("\n");
      out.write("        // demo.initMaterialWizard();\n");
      out.write("\n");
      out.write("        // Javascript method's body can be found in assets/js/demos.js\n");
      out.write("        demo.initDashboardPageCharts();\n");
      out.write("\n");
      out.write("        demo.initCharts();\n");
      out.write("\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<script src=\"../js/ajax.js\"></script>\n");
      out.write("<!--\n");
      out.write("-->\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
