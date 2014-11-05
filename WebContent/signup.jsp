<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN"
	  "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<title>Signup</title>
<link rel="stylesheet" type="text/css" href="include/css/style.css">
<link rel="stylesheet" type="text/css"
	href="include/bootstrap/css/bootstrap.css">
<script src="bootstrap/js/bootstrap.js"></script>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2 id="headerTitle">
				<a href="index.jsp">AppWorld</a>
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
				<div class="form-group">
					<label for="email">Email address</label> <input type="email"
						class="form-control" id="email" placeholder="Enter email">
				</div>
				<div class="form-group">
					<label for="password">Password</label> <input type="password"
						class="form-control" id="password" placeholder="Password">
				</div>
				<div class="form-group">
					<label for="passwordConfirm">Confirm Password</label> <input
						type="password" class="form-control" id="passwordConfirm"
						placeholder="Password">
				</div>
				<button type="submit" class="btn btn-default center-block">Sign
					Up</button>
			</form>
		</div>
		<div id="footer">
			<p>&copy; 2014 WIP Inc.</p>
		</div>
	</div>
</body>
</html>
