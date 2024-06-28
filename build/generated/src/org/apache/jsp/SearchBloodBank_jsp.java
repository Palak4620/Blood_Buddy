package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.bloodbank;
import dao.bloodbankDAO;
import dao.BloodDAO;
import java.util.*;
import model.Donar;

public final class SearchBloodBank_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("<!--        <link rel=\"stylesheet\" href=\"header.css\">-->\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        nav a{\n");
      out.write("    text-decoration: none;\n");
      out.write("    color: black;\n");
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
      out.write("             <div class=\"header\" style=\"background-color: wheat;\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <a href=\"FrontPage.jsp\" >\n");
      out.write("                        <img src=\"./Images/bb_logo(white).png\" style=\"height:110px\"></a>\n");
      out.write("                </div>\n");
      out.write("                <nav class=\"menu\">\n");
      out.write("                    <a href=\"#\">About Us</a>\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <a href=\"#\">Looking For Blood</a>\n");
      out.write("                        <div class=\"dropdown-options\">\n");
      out.write("                            <a href=\"SearchDonar.jsp\">Blood Availability</a><hr>\n");
      out.write("                            <a href=\"#\">Blood Bank Directory</a>\n");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("                <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <title>Blood Stock Availability</title>\n");
      out.write("        <style>\n");
      out.write("            .box {\n");
      out.write("                border: 2px solid;\n");
      out.write("                height: 100%;\n");
      out.write("                box-shadow: 0 0 2px white;\n");
      out.write("                margin: auto;\n");
      out.write("                width: 1100px;\n");
      out.write("                background-color: white;\n");
      out.write("            }\n");
      out.write("            h1 {\n");
      out.write("                color: darkred;\n");
      out.write("            }\n");
      out.write("            #heading {\n");
      out.write("                background-color: #DC143C;\n");
      out.write("                color: white;\n");
      out.write("                height: 50px;\n");
      out.write("                padding: 5px;\n");
      out.write("            }\n");
      out.write("            .cb {\n");
      out.write("                padding: 20px;\n");
      out.write("                margin-left: 90px;\n");
      out.write("            }\n");
      out.write("            #button {\n");
      out.write("                cursor: pointer;\n");
      out.write("                height: 30px;\n");
      out.write("                width: 80px;\n");
      out.write("                color: black;\n");
      out.write("                margin-left: 40px;\n");
      out.write("            }\n");
      out.write("            #button:hover {\n");
      out.write("                background-color:#DC143C;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .content1 {\n");
      out.write("                padding-left: 100px;\n");
      out.write("                padding-right: 100px;\n");
      out.write("            }\n");
      out.write("            #head{\n");
      out.write("                color: black;\n");
      out.write("                background-color: #DC143C;\n");
      out.write("                padding: 900px;\n");
      out.write("                height: 50px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #table{\n");
      out.write("                width: 60%;\n");
      out.write("                height: 120px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write(".ftr{\n");
      out.write("    background-color: rgba(0,0,0,0.4);\n");
      out.write("    height: 200px;\n");
      out.write("    margin-top:  400px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fa {\n");
      out.write("  padding: 20px;\n");
      out.write("  font-size: 50px;\n");
      out.write("  width: 30px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  margin: 5px 2px;\n");
      out.write("}\n");
      out.write(".fa:hover {\n");
      out.write("    opacity: 0.7;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fa-facebook {\n");
      out.write("  background: #3B5998;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fa-twitter {\n");
      out.write("  background: #55ACEE;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".fa-youtube {\n");
      out.write("  background: #bb0000;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fa-instagram {\n");
      out.write("  background: #125688;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"content1\">\n");
      out.write("            <h1>Nearest Blood Bank(BB)/ Blood Storage Unit(BSU)</h1>\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <!--<div id=\"heading\"><h3>Nearest Blood Bank(BB)/ Blood Storage Unit(BSU)</h3></div>-->\n");
      out.write("                <div class=\"cb\">\n");
      out.write("                    <form method=\"post\" action=\"SearchBloodBank.jsp\">\n");
      out.write("                        Enter State:<input type=\"text\" name=\"state\">\n");
      out.write("                        Enter City:<input type=\"text\" name=\"city\">\n");
      out.write("                        Hospital Name:<input type=\"text\" name=\"hname\">\n");
      out.write("\n");
      out.write("                        <input type=\"submit\" id=\"button\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");


            List<bloodbank> mylist = new ArrayList<bloodbank>();
//                  Donar B=new Donar();
            String str1 = null, str2 = null, str3 = null;
            str1 = request.getParameter("state");
            str2 = request.getParameter("city");
            str3 = request.getParameter("hname");
            if (str1 != null && str2 != null && str3 != null) {
                bloodbankDAO bd = new bloodbankDAO();
                mylist = bd.searchBloodBank(str1, str2, str3);
//                BloodDAO bd = new BloodDAO();
//                String bloodGroup;
//                bloodGroup=request.getParameter("bgroup");
//                if(bloodGroup!=null){
//                mylist = bd.searchByBG(bloodGroup);
//                for (Donar B : mylist) {
                if (!mylist.isEmpty()){
        
      out.write("\n");
      out.write("        %>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("    <center>\n");
      out.write("        <table border=\"1\" id=\"table\">\n");
      out.write("            <thead>\n");
      out.write("                <tr id=\"head\">\n");
      out.write("                    <th>License NO.</th><th>Blood Bank</th><th>Hospital</th><th>Category</th>\n");
      out.write("                    <th>Contact Person</th><th>Contact no.</th><th>Email id</th><th>Helpline no.</th>\n");
      out.write("                    <th>state</th><th>City</th> <th>Address</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    for (bloodbank B : mylist) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( B.getLicno());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( B.getBname());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( B.getHname());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( B.getCategory());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( B.getContact_person());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( B.getContact_no());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( B.getEmail());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( B.getHelplineno());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( B.getState());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( B.getCity());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( B.getAddress());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("                        ");

                            } else {
                                out.println("Record Not Found");
                            }
            }

                        
      out.write("\n");
      out.write("                        \n");
      out.write("                  \n");
      out.write("            </tbody>\n");
      out.write("        </table> \n");
      out.write("    </center>\n");
      out.write("    <footer class=\"ftr\">\n");
      out.write("                                <center><h1>JOIN OUR CAUSE</h1></center>\n");
      out.write("                                <p>Donating blood or platelets can be intimidating and even scary. Time to put those \n");
      out.write("                                    hesitations and fears aside. Learn from Blood Buddy and platelet donors how simple and easy it is to roll up a sleeve and help save lives.</p>\n");
      out.write("                                <center>\n");
      out.write("                                    <a href=\"#\" class=\"fa fa-facebook\"></a>\n");
      out.write("                                    <a href=\"#\" class=\"fa fa-twitter\"></a>\n");
      out.write("                                    <a href=\"#\" class=\"fa fa-youtube\"></a>\n");
      out.write("                                </center>\n");
      out.write("                            </footer>\n");
      out.write("</body>\n");
      out.write("</html>");
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
