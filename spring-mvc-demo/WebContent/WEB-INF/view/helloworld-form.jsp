<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello World - InputForm</title>
</head>
<body>
	<form action="processFormVersionTwo" method="GET">
	  <label for="fname">First name:</label><br>
	  <input type="text" id="fname" name="firstName" placeholder="Enter First Name"><br>
	  <label for="lname">Last name:</label><br>
	  <input type="text" id="lname" name="lastName" placeholder="Enter Last Name"><br><br>
	  <input type="submit" value="Submit">
</form> 

</body>
</html>