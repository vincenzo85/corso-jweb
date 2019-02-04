<%@page import="it.esempi.dao.Utente"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">

		<LINK REL="StyleSheet" HREF="style/css/style.css" TYPE="text/css"> 
		
		<LINK REL="StyleSheet" HREF="style/css/bootstrap.min.css" TYPE="text/css"> 
		<script src="style/js/bootstrap.min.js" ></script>
		<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


<title>Lista utenti</title>
</head>
<body>

<%
		List<Utente> userList = (List<Utente>)request.getAttribute("userList");
 
	if( userList != null){ 
	
%>

	<table>
	<!--  se ho utenti stampo i dati della lista -->
	<tr>
		
		<th> ID </th>
		<th> Nome </th>
		<th> Cognome </th>
		
	
	</tr>
	
	
			<%  for(Utente u: userList) { %>
	<tr>
	
				<td> <%=u.getId() %> </td>
				<td> <%=u.getUsername() %> </td>
				<td> <%=u.getPassword() %></td>
	
	</tr>
			<%	} %>
	
	</table>





<%
	} else {
%>
			<p> nessun utente trovato </p>
<%
	}
%>

</body>
</html>