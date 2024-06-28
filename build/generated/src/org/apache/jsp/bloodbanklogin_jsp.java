package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.BloodDAO;

public final class bloodbanklogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("<!--        <link rel=\"stylesheet\" href=\"header.css\">-->\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        nav a{\n");
      out.write("    text-decoration: none;\n");
      out.write("    color: white;\n");
      out.write("    margin: 30px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("nav{\n");
      out.write("    /*                background-color: lightgoldenrodyellow;*/\n");
      out.write("    color: black;\n");
      out.write("    padding: 40px;\n");
      out.write("    float: right;\n");
      out.write("    font-size:25px;\n");
      out.write("    padding-top: 40px;\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write(".logo{\n");
      out.write("    display: inline;\n");
      out.write("    height: 20px;\n");
      out.write("    width: 40px;\n");
      out.write("}\n");
      out.write(".header{\n");
      out.write("    background-color: white;\n");
      out.write("}\n");
      out.write(".dropdown {\n");
      out.write("    display: inline-block;\n");
      out.write("    position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-options {\n");
      out.write("    display: none;\n");
      out.write("    position: absolute;\n");
      out.write("    overflow: auto;\n");
      out.write("    background-color: #f9f9f9;\n");
      out.write("    box-shadow: 15px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-options a {\n");
      out.write("    padding: 5px 2px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("    color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-options {\n");
      out.write("    display: block;\n");
      out.write("    font-size: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-options a:hover{\n");
      out.write("    color: #C23314;\n");
      out.write("    animation: slide;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#abt{\n");
      out.write("    font-style: Brush Script MT;\n");
      out.write("}</style>\n");
      out.write("    <body>\n");
      out.write("         <header class=\"main-header\">\n");
      out.write("             <div class=\"header\" style=\"background-color: #A92626\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <a href=\"FrontPage.jsp\" >\n");
      out.write("                        <img src=\"./Images/bb_logo(white).png\" style=\"height: 85px\"></a>\n");
      out.write("                </div>\n");
      out.write("                <nav class=\"menu\">\n");
      out.write("                    <a href=\"#\">About Us</a>\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <a href=\"#\">Looking For Blood</a>\n");
      out.write("                        <div class=\"dropdown-options\">\n");
      out.write("                            <a href=\"SearchDonar.jsp\">Blood Availability</a><hr>\n");
      out.write("                            <a href=\"SearchBloodBank.jsp\">Blood Bank Directory</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <a href=\"#\">Want To Donate Blood</a>\n");
      out.write("                        <div class=\"dropdown-options\">\n");
      out.write("                            <a href=\"givingBloodForFirstTime.jsp\">Giving Blood for the first time</a><hr>\n");
      out.write("                            <a href=\"AddDonar.jsp\">Donar Login</a><hr>\n");
      out.write("                            <a href=\"#\">Blood Donation Camps</a><hr>\n");
      out.write("                            <a href=\"#\">About Blood Donation</a><hr>\n");
      out.write("                            <a href=\"#\">Register Donation Camp</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <a href=\"#\">Blood Bank Login</a>\n");
      out.write("                        <div class=\"dropdown-options\">\n");
      out.write("                            <a href=\"#\">Bloodbank Login</a><hr>\n");
      out.write("                            <a href=\"AddBloodBank.jsp\">Add Your Bloodbank</a>  \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .conn {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            /*            background: url('blood4.jpg') no-repeat center center fixed;*/\n");
      out.write("            background-size: cover;\n");
      out.write("            height: 100vh;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        .login-container {\n");
      out.write("            background-color: rgba(255, 255, 255, 0.8);\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.3);\n");
      out.write("            width: 300px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-container h2 {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-group {\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-group label {\n");
      out.write("            display: block;\n");
      out.write("            margin-bottom: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-group input {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 3px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-button {\n");
      out.write("            background-color: #d9534f;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            padding: 10px 15px;\n");
      out.write("            border-radius: 3px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-button:hover {\n");
      out.write("            background-color: #c9302c;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        .ftr{\n");
      out.write("            background-color: rgba(0,0,0,0.4);\n");
      out.write("            height: 200px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .fa {\n");
      out.write("            padding: 20px;\n");
      out.write("            font-size: 50px;\n");
      out.write("            width: 30px;\n");
      out.write("            text-align: center;\n");
      out.write("            text-decoration: none;\n");
      out.write("            margin: 5px 2px;\n");
      out.write("        }\n");
      out.write("        .fa:hover {\n");
      out.write("            opacity: 0.7;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .fa-facebook {\n");
      out.write("            background: #3B5998;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .fa-twitter {\n");
      out.write("            background: #55ACEE;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        .fa-youtube {\n");
      out.write("            background: #bb0000;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .fa-instagram {\n");
      out.write("            background: #125688;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"conn\">\n");
      out.write("            <div class=\"login-container\">\n");
      out.write("                <h2>Hospital Login</h2>\n");
      out.write("                <form action=\"#\" method=\"post\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"username\">Username:</label>\n");
      out.write("                        <input type=\"text\" id=\"username\" name=\"username\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"password\">Password:</label>\n");
      out.write("                        <input type=\"password\" id=\"password\" name=\"password\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"login-button\">Login</button>\n");
      out.write("                </form>\n");
      out.write("                ");

                    String user = null, pass = null, msg;
                    user = request.getParameter("username");
                    pass = request.getParameter("password");
                    if (user != null && pass != null) {
                        BloodDAO bd = new BloodDAO();
                        if (bd.checklogin(user, pass)) {
                            response.sendRedirect("FrontPage.jsp");
                        } else {
                            out.println("<font color=red size=4>Invalid UserID or Password</font>");
                        }
                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer class=\"ftr\">\n");
      out.write("            <center><h1>JOIN OUR CAUSE</h1></center>\n");
      out.write("            <p>Donating blood or platelets can be intimidating and even scary. Time to put those \n");
      out.write("                hesitations and fears aside. Learn from Blood Buddy and platelet donors how simple and easy it is to roll up a sleeve and help save lives.</p>\n");
      out.write("            <center>\n");
      out.write("                <a href=\"#\" class=\"fa fa-facebook\"></a>\n");
      out.write("                <a href=\"#\" class=\"fa fa-twitter\"></a>\n");
      out.write("                <a href=\"#\" class=\"fa fa-youtube\"></a>\n");
      out.write("            </center>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
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
