<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
<script type="text/javascript"
	src="resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/js/jquery-3.4.1.min.js"></script>

</head>
<body>
<body>
	<div align="center">
		<a href="home.jsp" style="color: green">Home</a>
	</div>
	<%
		Cookie[] cookies = request.getCookies();
		for (Cookie c : cookies) {
			if (c.getName().equals("uname")) {
				request.setAttribute("username", c.getValue());
			} else if (c.getName().equals("pass")) {
				request.setAttribute("password", c.getValue());
			}
		}
	%>

	<div align="center">
		<label style="color: blue">Welcome to Online Voting System !!</label>
		<br>
		<h2>Admin LogIn Page</h2>
	</div>

	<%-- <%
		response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); //HTTP 1.1
		response.setHeader("Pragma", "no-cache");//HTTP 1.0
		response.setHeader("Expires", "0"); // Proxy server
	%> --%>

	<div id="container">
		<div class="row col-md-12">
			<div class="col-md-4"></div>
			<div class="col-md-4 jumbotron">
				<form action="aLoginController" method="post"
					class="form-horizontal">
					<span style="color: red">${registrationSuccessMsg}</span> <span
						style="color: red">${loggedOutMsg}</span>
					<div class="form-group">
						<label>Admin name</label> <input type="text" name="aname"
							value="${username}" class="form-control">
					</div>
					<div class="form-group">
						<label>Password</label> <input type="password" name="pass"
							value="${password}" class="form-control">
					</div>
					<br>
					<div class="form-group">
						<input type="checkbox" name="remember-me" class="form-control">RememberMe
					</div>
					<div class="form-group">
						<input type="submit" value="Login" class="btn btn-success">
					</div>
					<span style="color: red">${loginFailMsg}</span>
				</form>
			</div>
			<div class="col-md-4"></div>
		</div>
	</div>
</body>
</html>