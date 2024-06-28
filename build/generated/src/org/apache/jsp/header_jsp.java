package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
