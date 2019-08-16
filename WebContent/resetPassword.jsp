<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reset Password</title>
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
<script type="text/javascript"
	src="resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/js/jquery-3.4.1.min.js"></script>
<link rel="stylesheet" href="resources/css/login.css">
</head>
<body>
	<div>
		<a href="home.jsp" style="color: red">Home</a>
	</div>
	<br>
	<div align="center">
		<label style="color: blue">Welcome to Online Voting System !!</label>
		<br>
		<h2 style="color: red">Password Reset Page</h2>
	</div>
	<div id="container">
		<div class="row col-md-12">
			<div class="col-md-4"></div>
			<div class="col-md-4 jumbotron">
				<form action="VoterController" method="post" class="form-horizontal">
					<div class="form-group">
						<label>New Password</label> <input type="password" name="pass"
							class="form-control">
					</div>
					<br>
					<div class="form-group">
						<label>Re-Type Password</label> <input type="password"
							name="repass" class="form-control">
					</div>
					<br>
					<div class="form-group">
						<input type="submit" value="Login" class="btn btn-success">
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>