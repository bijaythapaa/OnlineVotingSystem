<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Voting Ballot</title>
</head>
<body>
	<div align="center">
		<a href="vLoginController" style="color: red">Logout</a>
	</div>
	<br>
	<h3 style="color: blue" align="center">Welcome ${username} to the
		Ballot !!!</h3>
	<br>
	<div align="center" class="container">
		<div class="row">
			<fieldset>
				<legend>Cast Your Voter</legend>
				<form action="BallotController" method="post"
					class="form-horizontal">
					<div class="form-group">
						<label>Voter Id:</label><input type="number" name="voterid"
							class="form-control">
					</div>
					<br>
					<div class="form-group">
						<label>Party Name:</label> <select name="party">
							<option>--select--</option>
							<option value="ncp">Nepal Communist Party</option>
							<option value="nc">Nepali Congress</option>
							<option value="rpp">RaPraPa Nepal</option>
							<option value="ns">Naya Shakti</option>
						</select>
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