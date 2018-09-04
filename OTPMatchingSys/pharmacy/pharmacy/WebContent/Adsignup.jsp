<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADMIN SIGNUP</title>
<style>
#container {
position: fixed;
width: 340px;
height: 280px;
top: 40%;
left: 80%;
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
    font-size: 18px;
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
    margin-left: 2px;
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
}

</style>
</head>
<body background="Pharm/Admin.jpg" height="2000px" width="1337px">
	
<div id="l1">
<form>
<Input type="submit" name="submit" id="submit" size="20" value="LOGIN">
</form>
</div>
<div id="container">       
<form class="form" action="<%=request.getContextPath() %>/Admin?param=1"method="post">
Name:<input type="text" id="textName" name="textName" maxlength="30"><br/>
Email:<input type="email" id="email" name="email" maxlength="30"><br/>
Password:<input type="password" id="Password" name="Password" maxlength="30"><br/>

<div id="lower">
<input type="checkbox"><label for="checkbox">Register </label>
<input type="submit" value="Submit">
</div><!--/ lower-->
</form>

</div>
</body>
</html>