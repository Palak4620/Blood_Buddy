package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.BloodDAO;
import java.util.*;
import model.Donar;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <center>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead> \n");
      out.write("            <tr>\n");
      out.write("                <th>Donar ID</th><th>Name</th><th>Father Name</th><th>Mother Name</th>\n");
      out.write("                <th>Phone no.</th><th>Email ID</th><th>Blood Group</th><th>Gender</th>\n");
      out.write("                <th>City</th> <th>Address</th>\n");
      out.write("            </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("            ");

                List<Donar> mylist = new ArrayList<Donar>();
                BloodDAO bd = new BloodDAO();
                String bloodGroup;
                bloodGroup=request.getParameter("bgroup");
                mylist = bd.searchByBG(bloodGroup);
                for (Donar B : mylist) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>String id = \"");
      out.print( B.getDid());
      out.write("\"</td>\n");
      out.write("                 out.print(\"<td align=center >\" + id + \"</td>\");\n");
      out.write("                <td>");
      out.print( B.getName());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( B.getFname());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( B.getMname());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( B.getPhoneno());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( B.getEmail());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( B.getBgroup());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( B.getGender());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( B.getCity());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( B.getAddress());
      out.write("</td>\n");
      out.write("                   </tr>\n");
      out.write("           \n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                 </tbody>\n");
      out.write("        </table>\n");
      out.write("        </center>\n");
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
