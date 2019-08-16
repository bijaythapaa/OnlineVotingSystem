<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Registration Form</title>

</head>
<body>
	<div align="center" class="container">
		<div class="row">
			<fieldset>
				<legend>Admin Registration Form </legend>
				<form action="AdminController" method="post" class="form-horizontal">
					<span> <input type="hidden" name="id" value="${admin.id}"></span>
					<div class="form-group">
						<label>Admin Name:</label><input type="text" name="aname"
							value="${admin.adminName}" class="form-control">
					</div>
					<br>
					<div class="form-group">
						<label>Admin Password:</label><input type="password" name="pass"
							value="${admin.password}" class="form-control">
					</div>
					<br>
					<div class="form-group">
						<input type="submit" value="submit" class="btn btn-success">
					</div>
				</form>
			</fieldset>
		</div>
	</div>
</body>
</html>