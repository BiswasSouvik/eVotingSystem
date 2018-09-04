<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADMIN LOGIN</title>
<style>
#container {
position: fixed;
width: 340px;
height: 280px;
top: 50%;
left: 50%;
margin-top: -140px;
margin-left: -170px;
}

form {
    margin: 0 auto;
    margin-top: 20px;
}
label {
    color: #2AC9A7;
    display: inline-block;
    margin-left: 18px;
    padding-top: 10px;
    font-size: 14px;
}
p a {
    font-size: 11px;
    color: #aaa;
    float: right;
    margin-top: -13px;
    margin-right: 20px;
}
p a:hover {
    color: #555;
}
input {
    font-family: "Helvetica Neue", Helvetica, sans-serif;
    font-size: 12px;
    outline: none;
}
input[type=text],
input[type=password] {
    color: #777;
    padding-left: 10px;
    margin: 10px;
    margin-top: 12px;
    margin-left: 18px;
    width: 290px;
    height: 35px;
}

#lower {
    background: #ecf2f5;
    width: 100%;
    height: 69px;
    margin-top: 20px;
}
input[type=checkbox] {
    margin-left: 20px;
    margin-top: 30px;
}
.check {
    margin-left: 3px;
}
input[type=submit] {
    float: right;
    margin-right: 20px;
    margin-top: 20px;
    width: 80px;
    height: 30px;
}
input[type=submit] {
    float: right;
    margin-right: 20px;
    margin-top: 20px;
    width: 80px;
    height: 30px;
    font-size: 14px;
    font-weight: bold;
    color: #fff;
    background-color: #acd6ef; /*IE fallback*/
    background-image: -webkit-gradient(linear, left top, left bottom, from(#acd6ef), to(#6ec2e8));
    background-image: -moz-linear-gradient(top left 90deg, #acd6ef 0%, #6ec2e8 100%);
    background-image: linear-gradient(top left 90deg, #acd6ef 0%, #6ec2e8 100%);
    border-radius: 30px;
    border: 1px solid #66add6;
    box-shadow: 0 1px 2px rgba(0, 0, 0, .3), inset 0 1px 0 rgba(255, 255, 255, .5);
    cursor: pointer;
}
 #navbar{height:80px;width:1000px;float:right;} 
#navbar ul{margin:0;padding:0;list-style-type:none;}
 #navbar ul li{width:150px;list-style:none;padding:10px;float:left;}
 #navbar ul li a{font-size:12px;color:B54A2A;line-height:80px;text-align:center;float:left;padding:0 0 0 20px;display:block;}
 li>a:hover, li>a:focus{background:skyblue;color:#333;} #logo{width:200px;height:80px;float:left;padding-left:40px;} 
}

</style>
</head>
<body>
<body background="Pharm/Adminlogin.jpg" height="2000px" width="1337px">
	
	
<div id="container">  

<form>
<label for="username">Email</label>
<input type="text" id="username" name="username"><br/>
<label for="password">Password </label>
<input type="password" id="Password" name="Password">
<div id="lower">
<input type="checkbox"><label for="checkbox">Keep me logged in</label>
<input type="submit" value="Login">
</div><!--/ lower-->
</form>
</div>
</body>
</html>