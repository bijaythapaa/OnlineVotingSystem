<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin List</title>
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
<script type="text/javascript"
	src="resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/js/jquery-3.4.1.min.js"></script>
</head>
<body>
	<br>
	<div align="left">
		<!-- <a href="AdminController?actions=admin_list"></a> -->
		<a href=AdminController?actions=admin_new style="color: black">RegisterAdmin</a>
		<a href=AdminController?actions=voter_list style="color: blue">Voter
			Info</a> <a href=AdminController?actions=ballot_list
			style="color: purple">Ballot</a> <a href="aLoginController"
			style="color: red">Logout</a>
	</div>
	<br>
	<h3 style="color: blue">Welcome ${username} to the Admin Panel !!!</h3>
	<br>
	<h3>Admin List</h3>
	<c:if test="${!empty admins}">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>SN</th>
					<th>Id</th>
					<th>Admin Name</th>
					<th>Password</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${admins}" var="s" varStatus="d">
					<tr>
						<td><c:out value="${d.count}" /></td>
						<td><c:out value="${s.id}" /></td>
						<td><c:out value="${s.adminName}" /></td>
						<td><c:out value="${s.password}" /></td>

						<td><a href=AdminController?actions=admin_edit&id=${s.id}
							style="color: blue">Edit</a> || <a
							href=AdminController?actions=admin_delete&id=${s.id}
							style="color: red">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>
</body>
</html>