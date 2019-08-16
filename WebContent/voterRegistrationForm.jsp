<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Voter Registration Form</title>
</head>
<body>
	<div align="center" class="container">
		<div class="row">
			<fieldset>
			<legend>Voter Registration Form	</legend>
				<form action="VoterController" method="post"
					enctype="multipart/form-data" class="form-horizontal">
					<div class="form-group">
						<label>Voter Name:</label><input type="text" name="vname"
							class="form-control">
					</div>
					<br>
					<div class="form-group">
						<label>Voter Password:</label><input type="password" name="pass"
							class="form-control">
					</div>
					<br>
					<div class="form-group">
						<label>State No.:</label><input type="number" name="stno"
							class="form-control">
					</div>
					<br>
					<div class="form-group">
						<label>District:</label><input type="text" name="disname"
							class="form-control">
					</div>
					<br>
					<div class="form-group">
						<label>Email:</label><input type="email" name="email"
							class="form-control">
					</div>
					<br>
					<div class="form-group">
						<label>Date Of Birth:</label><input type="date" name="dob"
							class="form-control">
					</div>
					<br>
					<div class="form-group">
						<label>Gender:</label> <input type="radio" name="gender"
							value="Male" class="form-control">Male <input
							type="radio" name="gender" value="Female" class="form-control">Female
					</div>
					<br>
					<div class="form-group">
						<label>Upload</label> <input type="file" name="photo"
							class="form-control">
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