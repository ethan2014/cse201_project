<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN"
	  "http://www.w3.org/TR/html4/strict.dtd">
<html>
    <head>
	<title>Login</title>
	<link rel="stylesheet" type="text/css" href="include/css/style.css">
	<link rel="stylesheet" type="text/css" href="include/bootstrap/css/bootstrap.css">
	<script src="bootstrap/js/bootstrap.js"></script>
    </head>
    <body>
	<div id="wrapper">
	    <div id="header">
		<h2 id="headerTitle"><a href="index.jsp">AppWorld</a></h2>
		<ul id="headerButtons">
		    <li>
			<a href="login.jsp" id="loginButton" class="btn btn-default btn-block btn-xs">Login</a>
		    </li>
		    <li>
			<a href="signup.jsp" class="btn btn-default btn-block btn-xs">Sign Up</a>
		    </li>
		</ul>
	    </div>
	    <div id="body">
		<form id="loginForm" role="form" action="LoginServlet" method="post">
		    <div class="form-group">
				<label for="username">Username</label>
				<input type="username" class="form-control" id="username" name="username" placeholder="Enter Username">
		    </div>
		    <div class="form-group">
				<label for="password">Password</label>
				<input type="password" class="form-control" id="password" name="password" placeholder="Password">
		    </div>
		    ${loginMessage}
		    <button type="submit" class="btn btn-default center-block">Login</button>
		</form>
	    </div>
	    <div id="footer">
		<p>&copy; 2014 WIP Inc.</p>
	    </div>
	</div>
    </body>
</html>
