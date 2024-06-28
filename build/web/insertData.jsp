<%@include file='FrontPage.jsp' %>
<%@page import="java.util.*"%>
<%@page import="dao.BloodDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="model.Donar" id="b">
    <jsp:setProperty name="b" property="*"></jsp:setProperty>
</jsp:useBean>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <%
            int did;
            String name, fname, mname, phoneno, email, bgroup,gender, city, address;
            Date dob;
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
              
        %>
    </center>
    </body>
</html>
