package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0\" name=\"viewport\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("        <!-- Favicons -->\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"../assets/img/apple-icon.png\">\n");
      out.write("        <link rel=\"icon\" href=\"../assets/img/favicon.png\">\n");
      out.write("        <title>\n");
      out.write("            Login to Mail Track\n");
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
      out.write("\n");
      out.write("    <body class=\"\">\n");
      out.write("        <div class=\"col-md-4 offset-md-4\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-header card-header-success\">\n");
      out.write("                        <h4 class=\"card-title \">Login</h4>\n");
      out.write("                        <p class=\"card-category\">Login to Mail Track </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <form action=\"../Login\" method=\"POST\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"bmd-label-floating\">Email</label>\n");
      out.write("                                        <input name=\"email\" type=\"email\" class=\"form-control\" required=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"bmd-label-floating\">Password</label>\n");
      out.write("                                        <input name=\"pword\" type=\"password\" class=\"form-control\" required=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success btn-block\">Login</button>\n");
      out.write("                            <div class=\"clearfix\"></div>\n");
      out.write("                            <p class=\"card-category\" style=\"text-align: center;\">if you forget you password <a href=\"\">click here</a></p>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <script src=\"../assets/js/core/jquery.min.js\"></script>\n");
      out.write("    <script src=\"../assets/js/core/popper.min.js\"></script>\n");
      out.write("    <script src=\"../assets/js/bootstrap-material-design.js\"></script>\n");
      out.write("    <script src=\"../assets/js/plugins/perfect-scrollbar.jquery.min.js\"></script>\n");
      out.write("    <!--  Charts Plugin, full documentation here: https://gionkunz.github.io/chartist-js/ -->\n");
      out.write("    <script src=\"../assets/js/plugins/chartist.min.js\"></script>\n");
      out.write("    <!-- Library for adding dinamically elements -->\n");
      out.write("    <script src=\"../assets/js/plugins/arrive.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <!--  Notifications Plugin, full documentation here: http://bootstrap-notify.remabledesigns.com/    -->\n");
      out.write("    <script src=\"../assets/js/plugins/bootstrap-notify.js\"></script>\n");
      out.write("    <!-- Material Dashboard Core initialisations of plugins and Bootstrap Material Design Library -->\n");
      out.write("    <script src=\"../assets/js/material-dashboard.js?v=2.0.0\"></script>\n");
      out.write("    <!-- demo init -->\n");
      out.write("    <script src=\"../assets/js/plugins/demo.js\"></script>\n");
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
