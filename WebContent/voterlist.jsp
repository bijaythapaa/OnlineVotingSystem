<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Voter List</title>
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
<script type="text/javascript"
	src="resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/js/jquery-3.4.1.min.js"></script>
</head>
<body>
	<div align="left">
		<a href="aLoginController" style="color: red">Logout</a>
	</div>

	<h3>Voter List</h3>
	<c:if test="${!empty voters}">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>SN</th>
					<th>Id</th>
					<th>Voter Name</th>
					<th>Password</th>
					<th>State No.</th>
					<th>District Name</th>
					<th>Gender</th>
					<th>Image</th>
					<th>Email</th>
					<th>DOB</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${voters}" var="v" varStatus="s">
					<tr>
						<td><c:out value="${s.count}" /></td>
						<td><c:out value="${v.id}" /></td>
						<td><c:out value="${v.voterName}" /></td>
						<td><c:out value="${v.password}" /></td>
						<td><c:out value="${v.stateNo}" /></td>
						<td><c:out value="${v.districtName}" /></td>
						<td><c:out value="${v.gender}" /></td>
						<td><c:out value="${v.imgUrl}" /></td>
						<td><c:out value="${v.email}" /></td>
						<td><c:out value="${v.dob}" /></td>
						<td><a href=AdminController?actions=voter_delete&id=${v.id}
							style="color: red">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>
</body>
</html>