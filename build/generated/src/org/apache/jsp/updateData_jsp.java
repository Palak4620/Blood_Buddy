package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Donar;
import dao.BloodDAO;

public final class updateData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");

            int did;
            String name, fname, mname, phoneno, email, bgroup,gender, city, address;
            HttpSession S2 = request.getSession();
            did= Integer.parseInt(S2.getAttribute("did").toString());
            name=request.getParameter("name");
            fname=request.getParameter("fname");
            mname=request.getParameter("mname");
            phoneno=request.getParameter("phoneno");
            email=request.getParameter("email");
            bgroup=request.getParameter("bgroup");
            gender=request.getParameter("gender");
            city=request.getParameter("city");
            address=request.getParameter("address");
            Donar b= new Donar();
            b.setDid(did);
            b.setName(name);
            b.setFname(fname);
            b.setMname(mname);
            b.setPhoneno(phoneno);
            b.setEmail(email);
            b.setBgroup(bgroup);
            b.setGender(gender);
            b.setCity(city);
            b.setAddress(address);
           BloodDAO bd= new BloodDAO();  
           if(bd.updateData(b))
              out.println("Record Updated");
           else
              out.println("Record not Updated");
       
      out.write("\n");
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
