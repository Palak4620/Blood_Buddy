package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FrontPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <title>Blood Donation</title>\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                font-family: \"Montserrat\", sans-serif;\n");
      out.write("/*                background-color: rgba(56,12,12,0.4);*/\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            nav a{\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: white;\n");
      out.write("                margin: 30px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            nav{\n");
      out.write("                /*                background-color: lightgoldenrodyellow;*/\n");
      out.write("                color: black;\n");
      out.write("                padding: 40px;\n");
      out.write("                float: right;\n");
      out.write("                font-size:25px;\n");
      out.write("                padding-top: 40px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .logo{\n");
      out.write("                display: inline;\n");
      out.write("                height: 40px;\n");
      out.write("                width:30px;\n");
      out.write("            }\n");
      out.write("            .content{\n");
      out.write("                /*                background-color: #A92626;*/\n");
      out.write("                background-color: #A92626;\n");
      out.write("            }\n");
      out.write("            .dropdown {\n");
      out.write("                display: inline-block;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-options {\n");
      out.write("                display: none;\n");
      out.write("                position: absolute;\n");
      out.write("                overflow: auto;\n");
      out.write("                background-color: #f9f9f9;\n");
      out.write("                box-shadow: 15px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("                z-index: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-options a {\n");
      out.write("                padding: 5px 2px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: block;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown:hover .dropdown-options {\n");
      out.write("                display: block;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown:hover .dropdown-options a:hover{\n");
      out.write("                color: #C23314;\n");
      out.write("                animation: slide;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("/*            #abt{\n");
      out.write("                font-style: Brush Script MT;\n");
      out.write("            }*/\n");
      out.write("            #c1{\n");
      out.write("                transition: 2s;\n");
      out.write("                box-shadow: 0 0 15px rgba(0,0,0,0.2);\n");
      out.write("                border-radius: 5px;\n");
      out.write("                width: 25%;\n");
      out.write("                display: inline-block;\n");
      out.write("                margin: 2%;\n");
      out.write("            }\n");
      out.write("            #c1:hover{\n");
      out.write("                transform: scale(1.05,1.05);\n");
      out.write("                /*                transform: rotate(5deg);*/\n");
      out.write("                /*                transform: translate(10px,10px);*/\n");
      out.write("                /*                  transform: skew(250deg);*/\n");
      out.write("            }\n");
      out.write("            .image img {\n");
      out.write("                width: 50%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h3 {\n");
      out.write("/*                font-family: \"Alegreya Sans SC\", sans-serif;*/\n");
      out.write("            }\n");
      out.write("            #c1 p{\n");
      out.write("                padding: 3px;\n");
      out.write("                text-align: center;\n");
      out.write("                padding-top: 10px;\n");
      out.write("                border-radius: 2.8rem;\n");
      out.write("                margin: 10px;\n");
      out.write("                font-family: \"NTR\", sans-serif;\n");
      out.write("                font-size: 1rem;\n");
      out.write("            }\n");
      out.write("            .img{\n");
      out.write("                float: right;\n");
      out.write("                width: 40%;\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("            li{\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            p{\n");
      out.write("                margin-left: 10px;\n");
      out.write("                font-size: 1.25rem;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .f{\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: black;\n");
      out.write("                color: white;\n");
      out.write("                height: 10%;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #f1{\n");
      out.write("                display: inline-block;\n");
      out.write("                margin: 10px;\n");
      out.write("                margin-left:150px;\n");
      out.write("                margin-top:-30px;\n");
      out.write("            }\n");
      out.write("            .fimg img{\n");
      out.write("                margin-top: -90px;\n");
      out.write("                height: 300px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .matter{\n");
      out.write("/*                font-family: \"NTR\", sans-serif;*/\n");
      out.write("                font-size: 1.0rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .ftr{\n");
      out.write("                background-color: rgba(0,0,0,0.4);\n");
      out.write("                height: 210px;\n");
      out.write("                font-family: \"NTR\", sans-serif;\n");
      out.write("                font-size: 1.2rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .fa {\n");
      out.write("                padding: 20px;\n");
      out.write("                font-size: 30px;\n");
      out.write("                width: 30px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                margin: 5px 2px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .fa:hover {\n");
      out.write("                opacity: 0.7;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .fa-facebook {\n");
      out.write("                background: #3B5998;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .fa-twitter {\n");
      out.write("                background: #55ACEE;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .fa-youtube {\n");
      out.write("                background: #bb0000;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .fa-instagram {\n");
      out.write("                background: #125688;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write(" </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <header class=\"main-header\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <a href=\"FrontPage.jsp\" >\n");
      out.write("                        <img src=\"./Images/bb_logo(white).png\" style=\"height:85px\"></a>\n");
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
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <a href=\"#\">Blood Bank Login</a>\n");
      out.write("                        <div class=\"dropdown-options\">\n");
      out.write("                            <a href=\"#\">Bloodbank Login</a><hr>\n");
      out.write("                            <a href=\"AddBloodBank.jsp\">Add Your Bloodbank</a>  \n");
      out.write("\n");
      out.write("                            </nav>\n");
      out.write("                        </div>\n");
      out.write("                        </header>\n");
      out.write("                        <div class=\"matter\">\n");
      out.write("                            <div>\n");
      out.write("                                <img src=\"./Images/blood.jpg\" class=\"img\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <center>\n");
      out.write("\n");
      out.write("                                <h1>How Blood Type Is Determined And Why You Need To Know</h1>\n");
      out.write("                                <p>Blood types are determined by the presence or absence of certain antigens ? substances that can trigger an immune response if they are foreign to the body.  Since some antigens can trigger a patient's immune system to attack the transfused blood, safe blood transfusions depend on careful blood typing and cross-matching. Do you know what blood type is safe for you if you need a transfusion?</p>\n");
      out.write("\n");
      out.write("                                <p>There are four major blood groups determined by the presence or absence of two antigens, A and B, on the surface of red blood cells. In addition to the A and B antigens, there is a protein called the Rh factor, which can be either present (+) or absent (?), creating the 8 most common blood types (A+, A-,  B+, B-,  O+, O-,  AB+, AB-).</p>\n");
      out.write("                                <h2> Blood Types and Transfusion</h2>\n");
      out.write("                                <p>There are very specific ways in which blood types must be matched for a safe transfusion. The right blood transfusion can mean the difference between life and death. Use the interactive graphic below to learn more about matching blood types for transfusions.</p>\n");
      out.write("                                <p>Also, Rh-negative blood is given to Rh-negative patients, and Rh-positive or Rh-negative blood may be given to Rh-positive patients. The rules for plasma are the reverse. </p>\n");
      out.write("                            </center>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>The universal red cell donor has Type O negative blood.</li>\n");
      out.write("                                <li>The universal plasma donor has Type AB blood.</li>\n");
      out.write("                            </ul>\n");
      out.write("                            <center>\n");
      out.write("                                <h1>What Is A Universal Blood Donor?</h1></center>\n");
      out.write("                            <p>Universal donors are those with an O negative blood type.  Why?  O negative blood can be used in transfusions for any blood type.</p>\n");
      out.write("                            <p>Type O is routinely in short supply and in high demand by hospitals ? both because it is the most common blood type and because type O negative blood is the universal blood type needed for emergency transfusions and for immune deficient infants.</p>\n");
      out.write("                            <p>Approximately 45 percent of Caucasians are type O (positive or negative), but 51 percent of African-Americans and 57 percent of Hispanics are type O. Minority and diverse populations, therefore, play a critical role in meeting the constant need for blood.</p>\n");
      out.write("                            <p>Types O negative and O positive are in high demand.  Only 7% of the population are O negative. However, the need for O negative blood is the highest because it is used most often during emergencies. The need for O+ is high because it is the most frequently occurring blood type (37% of the population).</p>\n");
      out.write("                            <p>The universal red cell donor has Type O negative blood. The universal plasma donor has Type AB blood. For more about plasma donation, visit the plasma donation facts.</p>\n");
      out.write("                            <center>\n");
      out.write("                                <div class=\"fimg\">\n");
      out.write("                                    <img src=\"./Images/flogo1.gif\">\n");
      out.write("                                </div>\n");
      out.write("                            </center>\n");
      out.write("                            <div>\n");
      out.write("                                <center>\n");
      out.write("                                    <b><h1 id=\"abt\">What is this all about?</h1></b>\n");
      out.write("                                    <p  style=\"text-shadow:0px 0px 10px grey\" >We solve the problem of blood emergencies by connecting blood donors directly with people in blood need.</p>\n");
      out.write("                                </center>\n");
      out.write("                            </div>\n");
      out.write("                            <center>\n");
      out.write("                                <div class=\"cards1\">\n");
      out.write("                                    <div id=\"c1\">\n");
      out.write("                                        <div class=\"image\"><img src=\"./Images/drop.png\"></div>\n");
      out.write("                                        <h3>What we do ?</h3>\n");
      out.write("                                        <p>We connect blood donors with recipients, without any intermediary such as blood banks, for an\n");
      out.write("                                            efficient and seamless process.</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"c1\">\n");
      out.write("                                        <div class=\"image\"><img src=\"./Images/innovation.png\"></div>\n");
      out.write("                                        <h3>Innovative</h3>\n");
      out.write("                                        <p>Blood Buddy is an innovative approach to address global health.We provide immediate\n");
      out.write("                                            access to blood donors.</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"c1\">\n");
      out.write("                                        <div class=\"image\"><img src=\"./Images/netwotk.png\"></div>\n");
      out.write("                                        <h3>Network</h3>\n");
      out.write("                                        <p>Blood Buddy is one of several community organizations working together as a network that\n");
      out.write("                                            responds to emergencies in an efficient manner.</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"cards2\">\n");
      out.write("                                    <div id=\"c1\">\n");
      out.write("                                        <div class=\"image\">\n");
      out.write("                                            <img src=\"./Images/noti.png\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <h3>Get notified</h3>\n");
      out.write("                                        <p>Blood Buddy Connect works with network partners to connect blood donors and recipients\n");
      out.write("                                            through an automated SMS service and a mobile app.</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"c1\">\n");
      out.write("                                        <div class=\"image\">\n");
      out.write("                                            <img src=\"./Images/cost.png\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <h3>Totally Free</h3>\n");
      out.write("                                        <p>Blood Budyy's ultimate goal is to provide an easy -to-use, easy-to-access, fast, efficient,\n");
      out.write("                                            and reliable way to get life-saving blood, totally <span>Free of cost.</span></p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"c1\">\n");
      out.write("                                        <div class=\"image\">\n");
      out.write("                                            <img src=\"./Images/save.png\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <h3>Save Life</h3>\n");
      out.write("                                        <p>We are a non profit foundation and our main objective is to make sure that everything is done\n");
      out.write("                                            to protect vulnerable persons.<span>Help\n");
      out.write("                                                us by making a gift!</span></p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </center>\n");
      out.write("                            <!--            <div>\n");
      out.write("                                            <img src=\"./Images/blood.jpg\" class=\"img\">\n");
      out.write("                                        </div>\n");
      out.write("                                               \n");
      out.write("                                                <center>\n");
      out.write("                                                    \n");
      out.write("                                                <h1>How Blood Type Is Determined And Why You Need To Know</h1>\n");
      out.write("                                                <p>Blood types are determined by the presence or absence of certain antigens ? substances that can trigger an immune response if they are foreign to the body.  Since some antigens can trigger a patient's immune system to attack the transfused blood, safe blood transfusions depend on careful blood typing and cross-matching. Do you know what blood type is safe for you if you need a transfusion?</p>\n");
      out.write("                                                \n");
      out.write("                                                <p>There are four major blood groups determined by the presence or absence of two antigens, A and B, on the surface of red blood cells. In addition to the A and B antigens, there is a protein called the Rh factor, which can be either present (+) or absent (?), creating the 8 most common blood types (A+, A-,  B+, B-,  O+, O-,  AB+, AB-).</p>\n");
      out.write("                                                <h2> Blood Types and Transfusion</h2>\n");
      out.write("                                                <p>There are very specific ways in which blood types must be matched for a safe transfusion. The right blood transfusion can mean the difference between life and death. Use the interactive graphic below to learn more about matching blood types for transfusions.</p>\n");
      out.write("                                                <p>Also, Rh-negative blood is given to Rh-negative patients, and Rh-positive or Rh-negative blood may be given to Rh-positive patients. The rules for plasma are the reverse. </p>\n");
      out.write("                                                 </center>\n");
      out.write("                                                <ul>\n");
      out.write("                                                    <li>The universal red cell donor has Type O negative blood.</li>\n");
      out.write("                                                <li>The universal plasma donor has Type AB blood.</li>\n");
      out.write("                                                </ul>\n");
      out.write("                                                <center>\n");
      out.write("                                                <h1>What Is A Universal Blood Donor?</h1></center>\n");
      out.write("                                                <p>Universal donors are those with an O negative blood type.  Why?  O negative blood can be used in transfusions for any blood type.</p>\n");
      out.write("                                                <p>Type O is routinely in short supply and in high demand by hospitals ? both because it is the most common blood type and because type O negative blood is the universal blood type needed for emergency transfusions and for immune deficient infants.</p>\n");
      out.write("                                                <p>Approximately 45 percent of Caucasians are type O (positive or negative), but 51 percent of African-Americans and 57 percent of Hispanics are type O. Minority and diverse populations, therefore, play a critical role in meeting the constant need for blood.</p>\n");
      out.write("                                                <p>Types O negative and O positive are in high demand.  Only 7% of the population are O negative. However, the need for O negative blood is the highest because it is used most often during emergencies. The need for O+ is high because it is the most frequently occurring blood type (37% of the population).</p>\n");
      out.write("                                                <p>The universal red cell donor has Type O negative blood. The universal plasma donor has Type AB blood. For more about plasma donation, visit the plasma donation facts.</p>\n");
      out.write("                                              \n");
      out.write("                            </header>\n");
      out.write("                                <center>\n");
      out.write("                                    <div class=\"fimg\">\n");
      out.write("                                        <img src=\"./Images/flogo1.gif\">\n");
      out.write("                                    </div>\n");
      out.write("                                </center>-->\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("        <footer class=\"ftr\">\n");
      out.write("                                <center><h1>JOIN OUR CAUSE</h1></center>\n");
      out.write("                                <p>Donating blood or platelets can be intimidating and even scary. Time to put those \n");
      out.write("                                    hesitations and fears aside. Learn from Blood Buddy and platelet donors how simple and easy it is to roll up a sleeve and help save lives.</p>\n");
      out.write("                                <center>\n");
      out.write("                                    <a href=\"#\" class=\"fa fa-facebook\"></a>\n");
      out.write("                                    <a href=\"#\" class=\"fa fa-twitter\"></a>\n");
      out.write("                                    <a href=\"#\" class=\"fa fa-youtube\"></a>\n");
      out.write("                                </center>\n");
      out.write("                            </footer>\n");
      out.write("                        </body>\n");
      out.write("                        </html>");
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
