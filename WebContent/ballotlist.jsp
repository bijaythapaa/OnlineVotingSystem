<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ballot List</title>
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
<script type="text/javascript"
	src="resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/js/jquery-3.4.1.min.js"></script>
</head>
<body>
	<div align="left">
		<a href="aLoginController" style="color: red">LogOut</a>
	</div>
	<br>
	<h3>Ballot List</h3>
	<c:if test="${!empty ballots}">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>SN</th>
					<th>Id</th>
					<th>Voter Id</th>
					<th>Vote</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ballots}" var="s" varStatus="d">
					<tr>
						<td><c:out value="${d.count}" /></td>
						<td><c:out value="${s.id}" /></td>
						<td><c:out value="${s.voterId}" /></td>
						<td><c:out value="${s.partyName}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>
</body>
</html>