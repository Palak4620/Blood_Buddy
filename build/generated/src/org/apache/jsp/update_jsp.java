package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Donar;
import dao.BloodDAO;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Donar B=new Donar();
 int did;

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
      out.write("        <a href=\"UpdateDonar.jsp\">Update Donor Details</a>\n");
      out.write("        <a href=\"DonarList.jsp\">Donor List</a>\n");
      out.write("        <a href=\"SearchDonar.jsp\">Search Donor</a>\n");
      out.write("        <a href=\"#\">Blood Stock</a>\n");
      out.write("        <a href=\"DeleteDonar.jsp\">Delete Donor</a>\n");
      out.write("        <a href=\"logout.jsp\">Log Out</a>\n");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>Update Blood Donor Details</title>\n");
      out.write("<!--<style>\n");
      out.write("  body {\n");
      out.write("     margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    background-image: url('blood3.jpg');\n");
      out.write("    background-size: cover;\n");
      out.write("    background-position: center;\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("  }\n");
      out.write("  .container {\n");
      out.write("    max-width: 400px;\n");
      out.write("    margin: auto;\n");
      out.write("    background-color: rgba(255, 255, 255, 0.8);\n");
      out.write("    padding: 20px;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);\n");
      out.write("  }\n");
      out.write("  .container h1 {\n");
      out.write("    text-align: center;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  table {\n");
      out.write("    width: 100%;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    margin-bottom: 15px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  th, td {\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    padding: 8px;\n");
      out.write("    text-align: left;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  th {\n");
      out.write("    background-color: #f2f2f2;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  input[type=\"text\"], input[type=\"email\"], input[type=\"tel\"], input[type=\"date\"], select {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 10px;\n");
      out.write("    margin-bottom: 15px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  label {\n");
      out.write("    font-weight: bold;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .submit-btn {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .submit-btn:hover {\n");
      out.write("    background-color: #45a049;\n");
      out.write("  }\n");
      out.write("</style>-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!--<div class=\"container\">\n");
      out.write("  <h2>Update Blood Donor Details</h2>\n");
      out.write("  <form action=\"UpdateDonar.jsp\" method=\"post\">\n");
      out.write("     <label for=\"donorId\">Enter Donor ID:</label>\n");
      out.write("      <input type=\"text\" id=\"donorId\" name=\"did\" required>\n");
      out.write("    <td><input type=\"submit\" value=\"Update\"></td>\n");
      out.write("      </form>\n");
      out.write("</div>-->\n");
      out.write("<center>\n");
      out.write("    <table border=\"1\">\n");
      out.write("        <form method=\"post\" action=\"Update.jsp\">\n");
      out.write("            <tr><th>Enter ID</th><td><input type=\"text\" name=\"txtno\"></td></tr>\n");
      out.write("             <tr><th></th><td><input type=\"submit\" value=\"Submit\"></td></tr>\n");
      out.write("        </form>\n");
      out.write("    </table>\n");
      out.write("</center>\n");
      out.write("           ");

               String str=null;
               str=request.getParameter("txtno");
               //session= request.getSession(true);
               if(str!=null){
                   did=Integer.parseInt(str);
                   BloodDAO bd= new BloodDAO();
                   B=bd.searchByID(did);
                   if(B!=null){
                      // session.setAttribute("did", B.getDid());
        
      out.write(" \n");
      out.write("        <br><br><br><br><br><br>\n");
      out.write("                <form method=\"post\" action=\"updatedata.jsp\"> \n");
      out.write("       <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Donar ID</th><th>Name</th><th>Father Name</th><th>Mother Name</th>\n");
      out.write("                <th>Phone no.</th><th>Email ID</th><th>Blood Group</th><th>Gender</th>\n");
      out.write("                <th>City</th> <th>Address</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(B.getDid());
      out.write("</td>\n");
      out.write("                <td><input type=\"text\" name=\"name\" value=\"");
      out.print(B.getName());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"fname\" value=\"");
      out.print(B.getFname());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"mname\" value=\"");
      out.print(B.getMname());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"phoneno\" value=\"");
      out.print(B.getPhoneno());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"email\" value=\"");
      out.print(B.getEmail());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"bgroup\" value=\"");
      out.print(B.getBgroup());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"gender\" value=\"");
      out.print(B.getGender());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"city\" value=\"");
      out.print(B.getCity());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"address\" value=\"");
      out.print(B.getAddress());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"submit\" value=\"Update\"></td>\n");
      out.write("            </tr> \n");
      out.write("        </table> \n");
      out.write("        </form>\n");
      out.write("                       ");

               }
               else
                   out.println("Record not found");
           }
                
      out.write("\n");
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
