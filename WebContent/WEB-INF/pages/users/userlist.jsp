<%@page import="it.esempi.dao.Utente"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
		<th> COgnome </th>
		
	
	</tr>
	
	
			<%  for(Utente u: userList) { %>
	
				<td> <%=u.getId() %> </td>
				<td> <%=u.getUsername() %> </td>
				<td> <%=u.getPassword() %></td>
	
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