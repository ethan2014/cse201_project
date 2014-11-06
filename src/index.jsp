<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN"
	  "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<title>AppWorld Home</title>
<link rel="stylesheet" type="text/css" href="include/css/style.css">
<link rel="stylesheet" type="text/css"
	href="include/bootstrap/css/bootstrap.css">
<script src="bootstrap/js/bootstrap.js"></script>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2 id="headerTitle">
				<a href="./index.html">AppWorld</a>
			</h2>
			<ul id="headerButtons">
				<li><a href="login.jsp" id="loginButton"
					class="btn btn-default btn-block btn-xs">Login</a></li>
				<li><a href="signup.jsp"
					class="btn btn-default btn-block btn-xs">Sign Up</a></li>
			</ul>
		</div>
		<div id="body">
			<form id="loginForm" role="form">
				<div class="row">
					<div class="col-md-10 col-md-offset-1">
						<div class="input-group">
							<input type="text" class="form-control"
								placeholder="Platform, Name, Genre"></input> <span
								class="input-group-btn">
								<button class="btn btn-info" type="button">Search</button>
							</span>
						</div>
						<!-- /input-group -->
					</div>
					<!-- /.col-lg-6 -->
				</div>
				<!-- /.row -->


			</form>
		</div>
		<div id="footer">
			<p>&copy; 2014 WIP Inc.</p>
		</div>
	</div>
</body>
</html>
