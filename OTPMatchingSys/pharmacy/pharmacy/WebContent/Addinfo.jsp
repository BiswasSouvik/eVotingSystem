<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Information</title>
<style>
	h1{
			background-color:lightblue;
	  }
	div
	{
		background-color:#708EB3;
	}
	.center
	{
		position:absolute;
		left:400px;
		top:25%;
		width:100%;
		text-align:center;
	}
</style>
</head>
<body>
		<center>
			<div style="width:500px;height:310px;border:1px solid #000" class="center">
				<h1><b>Inormation Section</b></h1>
				<form action="Dist1.jsp">
					<input type="submit" name="submit" value="Distributor1" style ="height:30px; width:180px"><br><br>
				</form>
				<form action="Dist2.jsp">
					<input type="submit" name="submit" value="Distributor2" style ="height:30px; width:180px"><br><br>
				</form>
				<form action="Dist.jsp">
					<input type="submit" name="submit" value="Distributor3" style ="height:30px; width:180px"><br><br>
				</form>
				<input type="submit" name="submit" value="Customer Details" style ="height:30px; width:180px"><br>
			</div>
		</center>
</body>
</html>