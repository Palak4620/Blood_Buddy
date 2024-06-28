<%-- 
    Document   : header
    Created on : Jun 2, 2024, 12:26:54 PM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
<!--        <link rel="stylesheet" href="header.css">-->
    </head>
    <style>
        nav a{
    text-decoration: none;
    color: white;
    margin: 30px;

}
nav{
    /*                background-color: lightgoldenrodyellow;*/
    color: black;
    padding: 40px;
    float: right;
    font-size:25px;
    padding-top: 40px;


}
.logo{
    display: inline;
    height: 20px;
    width: 40px;
}
.header{
    background-color: white;
}
.dropdown {
    display: inline-block;
    position: relative;
}

.dropdown-options {
    display: none;
    position: absolute;
    overflow: auto;
    background-color: #f9f9f9;
    box-shadow: 15px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-options a {
    padding: 5px 2px;
    text-decoration: none;
    display: block;
    color: black;
}

.dropdown:hover .dropdown-options {
    display: block;
    font-size: 20px;
}

.dropdown:hover .dropdown-options a:hover{
    color: #C23314;
    animation: slide;
}

#abt{
    font-style: Brush Script MT;
}</style>
    <body>
         <header class="main-header">
             <div class="header" style="background-color: #A92626">
                <div class="logo">
                    <a href="FrontPage.jsp" >
                        <img src="./Images/bb_logo(white).png" style="height: 85px"></a>
                </div>
                <nav class="menu">
                    <a href="#">About Us</a>
                    <div class="dropdown">
                        <a href="#">Looking For Blood</a>
                        <div class="dropdown-options">
                            <a href="SearchDonar.jsp">Blood Availability</a><hr>
                            <a href="SearchBloodBank.jsp">Blood Bank Directory</a>
                        </div>
                    </div>
                    <div class="dropdown">
                        <a href="#">Want To Donate Blood</a>
                        <div class="dropdown-options">
                            <a href="givingBloodForFirstTime.jsp">Giving Blood for the first time</a><hr>
                            <a href="AddDonar.jsp">Donar Login</a><hr>
                            <a href="#">Blood Donation Camps</a><hr>
                            <a href="#">About Blood Donation</a><hr>
                            <a href="#">Register Donation Camp</a>
                        </div>
                    </div>

                    <div class="dropdown">
                        <a href="#">Blood Bank Login</a>
                        <div class="dropdown-options">
                            <a href="bloodbanklogin.jsp">Bloodbank Login</a><hr>
                            <a href="AddBloodBank.jsp">Add Your Bloodbank</a>  
                        </div>

                    </div>

                </nav>
            </div>
        </header>
    </body>
</html>
