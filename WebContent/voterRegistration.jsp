<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Voter Registration Form</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width" initial-scale=1>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="resources/css/style.css">
</head>
<body class="bd">
	<br>
	<div align="center">
		<a href="home.jsp" type="button" class="btn btn-danger">Logout</a>
	</div>
		
			<form name="Registration_Form" action="VoterController" method="post"
				class="Form_group">
				<div class="row">
					<div class="col-md-4">
						<p>
							<img src="resources/Images/pariwartan_logo.png" width="100"
								height="100">
						</p>
					</div>
					<div class="col-md-4">
						<h3>Online Voting System</h3>
						<h4>Pariwartan Team, Nepal</h4>
						<h5>Gongabu, Kathmandu 44600, Nepal</h5>
					</div>
					<div class="col-md-4">
						<p>
							<img src="resources/Images/flag.png" width="100" height="100">
						</p>
					</div>
				</div>

				<h2 class="text-white" style="background-color: DodgerBlue;">
					<center>
						<i>Voter Registration<i>
					</center>
				</h2>
				<p>Fields marked with * are mandatory.</p>
				<div class="row">
					<div class="col-md-4">
						<label for="inputname">*Full Name:</label> <input type="text"
							name="vname" class="form_control"
							placeholder="Enter Your Full Name" required="required">
					</div>
					<div class="col-md-4">
						<label for="inputname">*Password:</label> <input type="password"
							name="pass" class="form_control" required="required">
					</div>
					<div class="col-md-4">
						<label for="inputname">*Date Of Birth:</label> <input type="Date"
							name="dob" class="form_control" required="required">
					</div>
					<div class="col-md-4">
						<label for="inputname">Gender:</label> <input type="radio"
							name="gender" value="Male" required="required">Male <input
							type="radio" name="gender" value="Female">Female<br>
					</div>
					<div class="col-md-4">
						<label for="inputname">*Email:</label> <input type="email"
							name="email" class="form_control" placeholder="Enter Your Email"
							required="required">
					</div>
					<div class="col-md-4"></div>
					<div class="col-md-4"></div>
					<div class="col-md-4"></div>
					<div class="col-md-4"></div>
					<div class="col-md-4"></div>
					<div class="col-md-4">
						<!-- <label for="inputname">Photo:</label> <input type="file"
						name="filename" accept="image/gif, image/jpeg, image/png" required="required"> -->
					</div>
				</div>
				<h2 class="text-white" style="background-color: DodgerBlue;">
					<center>Address Details</center>
				</h2>
				<h5>
					<i><center>*Address</i>
	</center>
	</h5>
	<div class="row">
		<div class="col-md-4">
			<label for="inputname">*State:</label> <select name="stno"
				required="required">
				<option>--State No.--</option>
				<option value="1">01</option>
				<option value="2">02</option>
				<option value="3">03</option>
				<option value="4">04</option>
				<option value="5">05</option>
				<option value="6">06</option>
				<option value="7">07</option>
			</select>
		</div>
		<div class="col-md-4">
			<label for="inputname">*Zone:</label> <input type="text" name="zone"
				class="form_control" placeholder="" required="required">
		</div>
		<div class="col-md-4">
			<label for="inputname">*District:</label> <input type="text"
				name="disname" class="form_control" placeholder=""
				required="required">
		</div>
		<div class="col-md-4"></div>
		<div class="col-md-4"></div>
	</div>
	<br>
	<div class="reg" align="center"">
		<input type="submit" value="Register" class="btn btn-success">
	</div>
	</form>
	<h2 class="text-white" style="background-color: DodgerBlue;">
		<div class="container";>
			<div class="row">
				<div class="col-md-4">
					<p>
						<img src="resources/Images/pariwartan_logo.png" width="30"
							height="30">
					</p>
				</div>
				<div class="col-md-4">
					<p>
						<font size="4">&#9400; Pariwartan Team</font>
					</p>
				</div>
				<div class="col-md-4">
					<p>
						<img src="resources/Images/flag.png" width="30" height="30">
					</p>
				</div>
			</div>
		</div>
	</h2>
	</div>
	</center>
</body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
</html>