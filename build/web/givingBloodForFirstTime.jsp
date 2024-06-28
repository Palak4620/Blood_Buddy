<%@include file='header.jsp' %>
<%-- 
    Document   : givingBloodForFirstTime
    Created on : Jun 1, 2024, 5:00:04 PM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="FrontPage.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    </head>
    <body>
<!--        <header class="main-header">
            <div class="header">

                <div class="logo">
                    <a href="FrontPage.jsp" >
                        <img src="./Images/bb_logo(white).png" style="height:85px"></a>
                </div>
                <nav class="menu">
                    <a href="#">About Us</a>
                    <div class="dropdown">
                        <a href="#">Looking For Blood</a>
                        <div class="dropdown-options">
                            <a href="SearchDonar.jsp">Blood Availability</a><hr>
                            <a href="#">Blood Bank Directory</a>
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
                            <a href="#">Bloodbank Login</a><hr>
                            <a href="AddBloodBank.jsp">Add Your Bloodbank</a>  
                        </div>

                    </div>

                </nav>
            </div>
        </header>-->

        <div class="content">
            <h1>Giving blood for the first time</h1><br>
            <h3>Find out the next steps to become a blood donor. </h3>
            <p>Tens of thousands of people are doing something
                amazing by signing up to join our growing community
                of blood donors - ready to save lives when the NHS needs them.</p>
            <p>Just 1 hour of your time can help save up to 3 lives.</p>

            <div>
                <div class="start">
                    <h1>Getting started</h1>
                    <p>As a new donor, we know you're eager to give blood and save lives straight away.</p>
                    <p>If you can’t find a blood donation appointment immediately, 
                        don't worry. We'll still need your help in the future so please 
                        search several months ahead.</p>
                    <p>To get started, you'll need to register your details. We will ask you to:</p>
                    <p>&nbsp;&nbsp;&nbsp;&#x2022;answer some basic questions to check you're able to start the registration process.</p>
                    <p>&nbsp;&nbsp;&nbsp;&#x2022;register and validate your email address so we can contact you about your appointment.</p>
                    <p>&nbsp;&nbsp;&nbsp;&#x2022;complete your personal details to set up your account.</p>
                </div>
                <div class="btn">
                 
                        <h2 style="font-weight: lighter">Become a Donar</h2>
                        <button onclick="window.location.href='AddDonar.jsp'" type="button" class="button">Sign Up</button>
                 
                    
                </div>
            </div>
            <h1>Making your first donation</h1>
            <div>
                <div class="boxx">
                    <center><h2>Step 1</h2></center>
                    <p>When you arrive at your appointment,
                        complete a health check questionnaire and drink
                        500ml of water.</p>
                    <div class="image">
                        <img src="./Images/img3.jpg">
                    </div>
                </div>
                <div class="boxx">
                    <center><h2>Step 2</h2></center>
                    <p>Have a private health screening with a friendly member of the team.</p>
                    <div class="image">
                        <img src="./Images/img4.jpg">
                    </div>
                </div>
                <div class="boxx">
                    <center><h2>Step 3</h2></center>
                    <p>Take a seat and give blood for 5-10 minutes.</p>
                    <div class="image">
                        <img src="./Images/img5.jpg">
                    </div>
                </div>
            </div>
            <div>
                <div class="boxx">
                    <center><h2>Step 4</h2></center>
                    <p>Enjoy a free drink and snack while you rest for 15 minutes.</p>
                    <div class="image">
                        <img src="./Images/ing6.jpg">
                    </div>
                </div>
                <div class="boxx">
                    <center><h2>Step 5</h2></center>
                    <p>You're all done. Your donation will help save up to three lives.</p>
                    <div class="image">
                        <img src="./Images/img7.jpg">
                    </div>
                </div>

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
