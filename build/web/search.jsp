<%--
    Document   : search
    Created on : Aug 20, 2023, 9:52:09 AM
    Author     : Asus
--%>
<%@page import="dao.BloodDAO"%>
<%@page import="java.util.*"%>
<%@page import="model.Donar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
            <table border="1">
                <thead>
                    <tr>
                        <th>Donar ID</th><th>Name</th><th>Father Name</th><th>Mother Name</th>
                        <th>Phone no.</th><th>Email ID</th><th>Blood Group</th><th>Gender</th>
                        <th>City</th> <th>Address</th>
                    </tr>
                </thead>
                <tbody>
                     <%
                List<Donar> mylist = new ArrayList<Donar>();
                BloodDAO bd = new BloodDAO();
                mylist = bd.searchByCity(city);
                for (Donar B : mylist) {
            %>
            <tr>
                <td><%= B.getDid()%></td>
                <td><%= B.getName()%></td>
                <td><%= B.getFname()%></td>
                <td><%= B.getMname()%></td>
                <td><%= B.getPhoneno()%></td>
                <td><%= B.getEmail()%></td>
                <td><%= B.getBgroup()%></td>
                <td><%= B.getGender()%></td>
                <td><%= B.getCity()%></td>
                <td><%= B.getAddress()%></td>
                   </tr>
                <%
                    }
                %>
         
        </table>
    </center>
   
    </body>
</html>