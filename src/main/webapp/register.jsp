<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Form</title>
</head>
<body>
	<h2>User Registration Form</h2>
	<br>
	<form action='register' method='POST'>
	<label> Enter your Firstname:  <input type='text' name='firstName'></input></label>
	<br>
	<br>
	<label> Enter your Lastname :  <input type='text' name='lastName'></input></label>
	<br>
	<br>
	<label> Enter your Username: <input type='text' name='username'></input></label>
	<br>
	<br>
	<label> Enter your Password: <input type='text' name='password'></input></label>
	<br>
	<br>
	<input type='submit' value = 'Register'>
	<a href="login.jsp">Click Here to Login</a>.
	</form>
</body>
</html>