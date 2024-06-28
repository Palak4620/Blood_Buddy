package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tryyyyy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>CSS Image Slider</title>\n");
      out.write("    <style>\n");
      out.write("        /* styles.css */\n");
      out.write("\n");
      out.write("body {\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    height: 100vh;\n");
      out.write("    background-color: #f0f0f0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".slider {\n");
      out.write("    width: 80%;\n");
      out.write("    max-width: 800px;\n");
      out.write("    overflow: hidden;\n");
      out.write("    border: 2px solid #ccc;\n");
      out.write("    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("    position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".slides {\n");
      out.write("    display: flex;\n");
      out.write("    width: 400%; /* Adjust based on the number of slides */\n");
      out.write("    animation: slide 16s infinite;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".slide {\n");
      out.write("    width: 100%;\n");
      out.write("    flex-shrink: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".slide img {\n");
      out.write("    width: 100%;\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes slide {\n");
      out.write("    0% {\n");
      out.write("        transform: translateX(0%);\n");
      out.write("    }\n");
      out.write("    20% {\n");
      out.write("        transform: translateX(0%);\n");
      out.write("    }\n");
      out.write("    25% {\n");
      out.write("        transform: translateX(-100%);\n");
      out.write("    }\n");
      out.write("    45% {\n");
      out.write("        transform: translateX(-100%);\n");
      out.write("    }\n");
      out.write("    50% {\n");
      out.write("        transform: translateX(-200%);\n");
      out.write("    }\n");
      out.write("    70% {\n");
      out.write("        transform: translateX(-200%);\n");
      out.write("    }\n");
      out.write("    75% {\n");
      out.write("        transform: translateX(-300%);\n");
      out.write("    }\n");
      out.write("    95% {\n");
      out.write("        transform: translateX(-300%);\n");
      out.write("    }\n");
      out.write("    100% {\n");
      out.write("        transform: translateX(0%);\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"slider\">\n");
      out.write("        <div class=\"slides\">\n");
      out.write("            <div class=\"slide\"><img src=\"img1.jpg\" alt=\"Image 1\"></div>\n");
      out.write("            <div class=\"slide\"><img src=\"img2.webp\" alt=\"Image 2\"></div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
