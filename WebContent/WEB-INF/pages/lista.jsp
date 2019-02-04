<%@ page import=" java.util.ArrayList, it.esempi.dao.Autore" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
	<html>
		<LINK REL="StyleSheet" HREF="style/css/style.css" TYPE="text/css"> 
		
		<LINK REL="StyleSheet" HREF="style/css/bootstrap.min.css" TYPE="text/css"> 
		<script src="style/js/bootstrap.min.js" ></script>
		<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
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
          <a class="nav-link" href="#"> Utenti <span class="sr-only">(current)</span></a>
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
      <!--  
      <form class="form-inline" action="controller" method="POST">
      		<input name="username" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    		<input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
			<button class="btn btn-outline-info my-2 my-sm-0" type="submit">Log In</button>
      </form> -->
    </div>
  </nav>
  
  
  <!------ Include the above in your HEAD tag ---------->

<ul>

<% 
for (int i = 0; i < 10; i++) { 
%>
	
<li>   <%=i %> </li>
	
	
<%
}
%>


</ul>
	

<!--  esempio tabella  -->
<div class="container">
 <div class="row justify-content-md-center">
    <div class="col col-md-8">
<table class="table table-striped table-dark">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Titolo</th>
      <th scope="col">Nome</th>
      <th scope="col">Cognome</th>
    </tr>
  </thead>
  <tbody>

<% 



ArrayList<Autore> list = (ArrayList<Autore>) request.getAttribute("listaAutori");

for (Autore au: list) { 
%>

    <tr>
      <th scope="row"><%=au.getId() %></th>
      <td><%=au.getTitolo() %></td>
      <td><%=au.getNome() %></td>
      <td><%=au.getCognome() %></td>
    </tr>
<%
}
%>




  </tbody>
</table>


</div>
</div>
</div>



	
	</body>
</html>