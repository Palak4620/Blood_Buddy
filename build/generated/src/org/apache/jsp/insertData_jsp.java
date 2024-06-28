package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import dao.BloodDAO;

public final class insertData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/FrontPage.jsp");
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Blood Donation</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f4f4f4;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .header {\n");
      out.write("            background-color: #d9534f;\n");
      out.write("            color: white;\n");
      out.write("            padding: 15px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .menu {\n");
      out.write("            background-color: #333;\n");
      out.write("            color: white;\n");
      out.write("            padding: 10px;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-around;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .menu a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: white;\n");
      out.write("            padding: 5px;\n");
      out.write("            transition: background-color 0.3s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .menu a:hover {\n");
      out.write("            background-color: #555;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .content {\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <h1>Blood Donation</h1>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"menu\">\n");
      out.write("        <a href=\"AddDonar.jsp\">Add Donor Details</a>\n");
      out.write("        <a href=\"#\">Update Donor Details</a>\n");
      out.write("        <a href=\"DonarList.jsp\">Donor List</a>\n");
      out.write("        <a href=\"SearchDonar.jsp\">Search Donor</a>\n");
      out.write("        <a href=\"#\">Blood Stock</a>\n");
      out.write("        <a href=\"DeleteDonar.jsp\">Delete Donor</a>\n");
      out.write("        <a href=\"#\">Log Out</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <!-- Content goes here -->\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      model.Donar b = null;
      synchronized (_jspx_page_context) {
        b = (model.Donar) _jspx_page_context.getAttribute("b", PageContext.PAGE_SCOPE);
        if (b == null){
          b = new model.Donar();
          _jspx_page_context.setAttribute("b", b, PageContext.PAGE_SCOPE);
          out.write("\n");
          out.write("    ");
          org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("b"), request);
          out.write('\n');
        }
      }
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        ");

//            int did;
//            String name, fname, mname, phoneno, email, bgroup,gender, city, address;
//            Date dob;
//            did=Integer.parseInt(request.getParameter("donorId"));
//            name=request.getParameter("fullName");
//            fname=request.getParameter("fatherName");
//            mname=request.getParameter("motherName");
////            dob=Date.parse("dob");
//            phoneno=request.getParameter("phone");
//            email=request.getParameter("email");
//            bgroup=request.getParameter("bloodGroup");
//            gender=request.getParameter("gender");
//            city=request.getParameter("city");
//            address=request.getParameter("address");
//            b.setDid(did);
//            b.setName(name);
//            b.setFname(fname);
//            b.setMname(mname);
////            b.setDob(dob);
//            b.setPhoneno(phoneno);
//            b.setEmail(email);
//            b.setBgroup(bgroup);
//            b.setGender(gender);
//            b.setCity(city);
//            b.setAddress(address);
          BloodDAO bd= new BloodDAO();
          if(bd.insertdata(b)){
              out.println("<br><br><font size=5 color= green>Your Record Has Been Inserted</font>");
          }else{
               out.println("Record not Inserted");
          }
              
        
      out.write("\n");
      out.write("    </center>\n");
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
