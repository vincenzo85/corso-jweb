<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
	<html>
		<LINK REL="StyleSheet" HREF="style/css/bootstrap.min.css" TYPE="text/css"> 
		<script src="style/js/bootstrap.min.js" ></script>
	<head>
		<meta charset="ISO-8859-1">
		<title>Form Login</title>
	</head>

	<body>
	
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarColor01">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
          <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Features</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Pricing</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">About</a>
        </li>
      </ul>
      <form class="form-inline" method="POST">
      		<input name="username" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    		<input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
			<button class="btn btn-outline-info my-2 my-sm-0" type="submit" disabled >Logged</button>
      </form>
    </div>
  </nav>
	
	
	</body>
</html>