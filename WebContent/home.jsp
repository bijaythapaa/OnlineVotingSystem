<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>

</head>
<body>

	<div align="center">
		<a href="voterlogin.jsp" style="color: red">Voter</a> <a
			href="adminlogin.jsp" style="color: green">Admin</a>
	</div>


	<!--to display logged-in user name, using the session in controller.
	also called EL (Expression Language)  -->
	<div align="center">
		<h1>Online Voting System</h1>
		<br> <br>
		<h3 style="color: red">${votingSuccessMsg}</h3>
	</div>
</body>
</html>