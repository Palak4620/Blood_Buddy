<%-- 
    Document   : newjspbloodbanklogin
    Created on : Jun 5, 2024, 12:37:46 AM
    Author     : Asus
--%>
<%@page import="dao.bloodbankDAO"%>
<%@include file='header.jsp' %>
<%@page import="dao.BloodDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <title>JSP Page</title>
    </head>
    <style>
        .conn {
            margin: 50px;
            padding: 0;
            font-family: Arial, sans-serif;
            /*            background: url('blood4.jpg') no-repeat center center fixed;*/
            background-size: cover;
            height: 59vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .login-container {
            background-color: rgba(255, 255, 255, 0.8);
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.3);
            width: 500px;
            text-align: center;
        }

        .login-container h2 {
            margin-bottom: 20px;
        }

        .form-group {
            margin-bottom: 15px;
        }

        .form-group label {
            display: block;
            margin-bottom: 5px;
        }

        .form-group input {
            width: 100%;
            padding: 7px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        .login-button {
            background-color: #d9534f;
            color: white;
            border: none;
            padding: 10px 15px;
            border-radius: 3px;
            cursor: pointer;
            width: 100%;
        }

        .login-button:hover {
            background-color: #c9302c;
        }


        .ftr{
            background-color: rgba(0,0,0,0.4);
            height: 180px;
        }
        .ftr p{
           font-size: 1.2rem;
        }

        .fa {
            padding: 20px;
            font-size: 30px;
            width: 30px;
            text-align: center;
            text-decoration: none;
            margin: 5px 2px;
        }
        .fa:hover {
            opacity: 0.7;
        }

        .fa-facebook {
            background: #3B5998;
            color: white;
        }

        .fa-twitter {
            background: #55ACEE;
            color: white;
        }


        .fa-youtube {
            background: #bb0000;
            color: white;
        }

        .fa-instagram {
            background: #125688;
            color: white;
        }
    </style>
    <body>
        <div class="conn">
            <div class="login-container">
                <h2>BloodBank Login</h2>
                <form action="#" method="post">
                    <div class="form-group">
                        <label for="username">Hospital name:</label>
                        <input type="text" id="username" name="username" required>
                    </div>
                    <div class="form-group">
                        <label for="password">Password:</label>
                        <input type="password" id="password" name="password" required>
                    </div>
                    <button type="submit" class="login-button">Login</button>
                </form>
                <%
                    String user = null, pass = null, msg;
                    user = request.getParameter("username");
                    pass = request.getParameter("password");
                    if (user != null && pass != null) {
                        bloodbankDAO bd = new bloodbankDAO();
                        if (bd.checklogin(user, pass)) {
                            response.sendRedirect("FrontPage.jsp");
                        } else {
                            out.println("<font color=red size=4>Invalid UserID or Password</font>");
                        }
                    }
                %>
                <p>Add your bloodbank?<a href="AddBloodBank.jsp">Sign Up</a></p>
            </div>
        </div>
        <footer class="ftr">
            <center><h1>JOIN OUR CAUSE</h1></center>
            <p>Donating blood or platelets can be intimidating and even scary. Time to put those 
                hesitations and fears aside. Learn from Blood Buddy and platelet donors how simple and easy it is to roll up a sleeve and help save lives.</p>
            <center>
                <a href="#" class="fa fa-facebook"></a>
                <a href="#" class="fa fa-twitter"></a>
                <a href="#" class="fa fa-youtube"></a>
            </center>
        </footer>
    </body>
</html>
