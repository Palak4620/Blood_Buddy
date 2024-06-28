<%@page import="dao.BloodDAO"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href='Register.css'>
    <link rel="icon" href='./Images/bb_logo(black).png' type="image/png">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
</head>
<style>
    @import url('https://fonts.googleapis.com/css2?family=Alegreya+Sans+SC:wght@300&display=swap');

body{
    background: url('./Images/ug.png');
}

header{
    background-color: white;
    color: white;
    height: 18%;
    width: 100%;
	z-index: 10;
	position: fixed;
    font-weight: 100;
}

.header-logo{
    font-size: 10px;
    float: left;
    padding-left: 30px;
    padding-top: 0px;

}

.header-logo > img {
    width: 70%;
}

li a{
    text-decoration: none;
    display: block;
    text-decoration: none;
    text-transform: uppercase;
    color: black;
    font-size: 20px;
    font-family: 'Raleway', sans-serif;
    letter-spacing: 2px;
    font-weight: 600;
    margin-bottom: 10px;
    padding: 20px;
    transition: all ease 0.5s;
}

li{
    float: right;
    padding-left: 30px;
    padding-top: 30px;
    list-style: none;
    padding-right: 40px;
    font-size: 24px;
}

header ul li a:hover{
    background-color:rgba(220,20,60);
    color: white;
}

*{
    margin: 0;
    padding: 0;
    box-sizing: border-box;

}

.inner{
    height: 85%;
    width: 70%;
    position: absolute;
    top: 80%;
    left: 50%;
    bottom: 50%;
    transform: translate(-50%,-50%);
    box-shadow: 10px 10px 68px -6px rgba(0,0,0,0.5);
    display: flex;
    justify-content: space-between;
    border-radius: 10px;
}

.photo{
    width: 50%;
    height: 100%;
}

.photo img{
    width: 110%;
    height: 100%;
}

.user-form{
    background: #F08080;
    padding: 40px;
    width: 50%;
    height: 100%;
    border-radius: 0px 10px 10px 0px;
}

.user-form h1{
    color: #fff;
    padding: 30px 0;
    margin: 25px 10px;
    font-weight: 700;
    font-family: 'Alegreya Sans SC', sans-serif;
    letter-spacing: 2px;
}

.user-form i{
    position: absolute;
    margin: 25px 10px;
    color:#F08080 ;
}

input{
    width: 100%;
    height: 3em;
    border: none;
    border-radius: 30px;
    font-size: 15px;
    margin: 10px 0;
    padding: 0 30px;
}

.safety{
    width: 100%;
    display: flex;
    justify-content: space-between;
    color: #fff;
}

.line{
    height: 6px;
    border-radius: 20px;
    width: 20%;
    background: #fff;
    margin: 5px;
}

.action-btn{
    width: 100%;
    display: flex;
    margin: 30px 0;
}

.btn{
    font-family:'Alegreya Sans SC', sans-serif;
    border: 1px solid #fff;
    padding: 10px;
    background: transparent;
    border-radius: 20px;
    width: 100%;
    cursor: pointer;
    font-weight:700px;
    font-size: medium;
    margin: 0 10px;
    background: none;
    border: 2px solid white;
    color: white;
}

.primary{
    font-size: medium;
    font-family:'Alegreya Sans SC', sans-serif;
    background: none;
    border: 2px solid white;
    color: white;

}
.primary:hover{
    background: linear-gradient(45deg, yellow 24%, orange 100%);
    border: none;
    color: black;

  
}
.btn:hover{
    background: linear-gradient(45deg, yellow 24%, orange 100%);
    border: none;
    color: black;  
}

@media(max-width:700px){
    .photo{
        display: none;
    }
    .user-form{
        width: 100%;
        border-radius: 10px;
        font-size: 20px
    }
    .action-btn{
        margin: 5px;
        display: block;
        width: 100%;
    }

    .btn{
        width:100%;
        margin:5px;
        padding:5px;
       
    }
}

@media screen and (max-width:990px) and (min-width:665px){
    .action-btn{
        margin: 5px;
        display: block;
        width: 100%;
    }

    .btn{
        width:100%;
        margin:5px;
        padding:5px;
    }
}

</style>
<title>Start Saving Lives </title>
<body>
<header>
    <nav>
    <div class="header-logo"><img src="./Images/bb_logo(black).png"></div>
    <div class="header-list">
        <ul>
            <li><a href="help.html">Get Help</li></a>
            <li><a href="donate.html">Donate</li></a>
            <li><a href="index.html#vol-sect">Volunteer</li></a>
            <li><a href="index.html#about-us">About Us</a></li>
            </ul>
    </div>
    </nav>
</header>

<div class="inner">
    <div class="photo">
        <img src="regphoto.png">
    </div>
    <div class="user-form">
        <h1>Start Saving Lives</h1>
        <form>
            <i class="fas fa-user icon"></i>
            <input type="text" placeholder="Name" name="username">
            <br>
            <i class="fas fa-lock"></i>
            <input type="password" placeholder="Password" name="password" id="password_data">
            <div class="safety" style="font-family: sans-serif; font-size: 20px;">         
            </div>
            <div class="action-btn">
                <button class="btn primary">Login</button>
            </div>
                    <center>Don't have an account?<a href="index.html">Sign up</center>
        </form>
    </div>
                 <%
           String user=null,pass=null,msg;
           user=request.getParameter("username");
           pass=request.getParameter("password");
           if(user!=null && pass!=null){
               BloodDAO bd=new BloodDAO();
               if(bd.checklogin(user, pass)){
                   response.sendRedirect("FrontPage.jsp");
               }else{
                     out.println("<font color=red size=4>Invalid UserID or Password</font>");
               }
           }
        %>
</div>
    <script>
        const passwordInput = document.querySelector("#password_data");

passwordInput.addEventListener("keyup", () => {
    let password = passwordInput.value;
    
    var strongRegex = new RegExp("^(?=.{14,})(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*\\W).*$", "g");
    var mediumRegex = new RegExp("^(?=.{10,})(((?=.*[A-Z])(?=.*[a-z]))|((?=.*[A-Z])(?=.*[0-9]))|((?=.*[a-z])(?=.*[0-9]))).*$", "g");

    if(password.length===0)
    {
        document.querySelector(".safety").innerHTML = "Enter Password";
    }
    else
    {
        document.querySelector(".safety").innerHTML = '<span>Password Strength</span><span class="line" id="line1"></span><span class="line" id="line2"></span><span class="line" id="line3"></span>';
    }

    if (strongRegex.test(password)) 
    {
        document.querySelector("#line1").style.background = "green";
        document.querySelector("#line2").style.background = "green";
        document.querySelector("#line3").style.background = "green";
    } 
    else if (mediumRegex.test(password)) 
    {
        document.querySelector("#line1").style.background = "yellow";
        document.querySelector("#line2").style.background = "yellow";
    } 
    else 
    {
        document.querySelector("#line1").style.background = "red";
        
    }
})
    </script>
</body>
</html>