<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Google Chart</title>
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">

<link rel="stylesheet" type="text/css" href="resources/css/style.css">
<!-- <script type="text/javascript" src="resources/js/jsapi.js"> </script> -->

<script type="text/javascript" src="https://www.google.com/jsapi"></script>
<script type="text/javascript">
	/* Load the Visualization API and the piechart package. */
	google.load('visualization', '1.0', {
		'packages' : [ 'corechart' ]
	});

	// Set a callback to run when the Google Visualization API is loaded.
	google.setOnLoadCallback(drawChart);

	// Callback that creates and populates a data table,
	// instantiates the pie chart, passes in the data and
	// draws it.
	function drawChart() {

		// Create the data table.
		var data = new google.visualization.DataTable();
		data.addColumn('string', 'Topping');
		data.addColumn('number', 'Slices');
		data.addRows([
		<c:forEach items="${pieDataList}" var="entry">
		[ '${entry.key}', ${entry.value} ],
		</c:forEach>
		]);

		// Set chart options
		var options = {
			//'title' : 'Voting Result: ', //title which will be shown right above the Google Pie Chart
			is3D : true, //render Google Pie Chart as 3D
			pieSliceText : 'label', //on mouse hover show label or name of the Country
			tooltip : {
				showColorCode : true
			}, // whether to display color code for a Country on mouse hover
			'width' : 865, //width of the Google Pie Chart
			'height' : 500
		//height of the Google Pie Chart
		};

		// Instantiate and draw our chart, passing in some options.
		var chart = new google.visualization.PieChart(document
				.getElementById('chart_div'));
		chart.draw(data, options);
	};
</script>
</head>
<body class="bd">
	<br>
	<div align="center">
		<a href="home.jsp" type="button" class="btn btn-secondary">Home</a>
	</div>
	<center>
		<div class="container">
			<form action="PieChartServlet" method="get" class="form-horizontal">

				<div class="row">
					<div class="col-md-4">
						<p>
							<img src="resources/Images/pariwartan_logo.png" width="100"
								height="100">
						</p>
					</div>
					<div class="col-md-4">
						<h3>Online Voting System</h3>
						<h4>Pariwartan Team</h4>
						<h5>Gongabu, Kathmandu 44600, Nepal</h5>
					</div>
					<div class="col-md-4">
						<p>
							<img src="resources/Images/flag.png" width="100" height="100">
						</p>
					</div>
				</div>
				<h3 class="text-white" style="background-color: grey">
					<center>
						<marquee>
							<i>Result In PieChart !!</i>
						</marquee>
					</center>
				</h3>

				<div style="width: 600px;">
					<div id="chart_div"></div>
					<%-- <p>Printing data</p>
		<c:forEach items="${pieDataList}" var="entry">
			<p>${entry.key},${entry.value}</p>
		</c:forEach> --%>
				</div>

			</form>

			<h2 class="text-white" style="background-color: grey;">
				<div class="container">
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
</html>