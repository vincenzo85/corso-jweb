<%@page import="it.esempi.model.UserSearch"%>
<%@page import="it.esempi.controller.UserDetail"%>
<%@page import="it.esempi.model.Utente"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">

		<LINK REL="StyleSheet" HREF="style/css/style.css" TYPE="text/css"> 
		
		<LINK REL="StyleSheet" HREF="style/css/bootstrap.min.css" TYPE="text/css"> 
		<script src="style/js/jquery.min.js"></script>
		<script src="style/js/bootstrap.min.js" ></script>


<title>Lista utenti</title>
</head>
<body>
<!------ Include the above in your HEAD tag ---------->

<div class="container container-filter">
	<div class="row">
        <div id="filter-panel" class="collapse filter-panel">
            <div class="panel panel-default">
                <div class="panel-body">
                    <form action="lista-utenti" method="post" class="form-inline" role="form">
                        <div class="form-group">
                            <label class="filter-col" style="margin-right:0;" for="pref-perpage">Rows per page:</label>
                            <select id="pref-perpage" class="form-control">
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                                <option value="5">5</option>
                                <option value="6">6</option>
                                <option value="7">7</option>
                                <option value="8">8</option>
                                <option value="9">9</option>
                                <option selected="selected" value="10">10</option>
                                <option value="15">15</option>
                                <option value="20">20</option>
                                <option value="30">30</option>
                                <option value="40">40</option>
                                <option value="50">50</option>
                                <option value="100">100</option>
                                <option value="200">200</option>
                                <option value="300">300</option>
                                <option value="400">400</option>
                                <option value="500">500</option>
                                <option value="1000">1000</option>
                            </select>                                
                        </div> <!-- form group [rows] -->
                        <div class="form-group">
                            <label class="filter-col" style="margin-right:0;" for="pref-search">Search:</label>
                            <input type="text" name="search" class="form-control input-sm" id="pref-search" <% UserSearch ud =  (UserSearch)request.getAttribute("userSearch");
                            	if (ud != null){
                            %>
                            
                           	value="<%=ud.getSearch() %>"
                            
                            
                            <%	
                            	}
                            
                            %>>
                        </div><!-- form group [search] -->
                        <div class="form-group">
                            <label class="filter-col" style="margin-right:0;" for="pref-orderby">Order by:</label>
                            <select id="pref-orderby" class="form-control">
                                <option>Descendent</option>
                            </select>                                
                        </div> <!-- form group [order by] --> 
                        <div class="form-group">    
                            <div class="checkbox" style="margin-left:10px; margin-right:10px;">
                                <label><input type="checkbox"> Remember parameters</label>
                            </div>
                            <button type="submit" class="btn btn-default filter-col">
                                <span class="glyphicon glyphicon-record"></span> Save Settings
                            </button>  
                        </div>
                    </form>
                </div>
            </div>
        </div>    
        <button type="button" class="btn btn-primary" data-toggle="collapse" data-target="#filter-panel">
            <span class="glyphicon glyphicon-cog"></span> Advanced Search
        </button>
	</div>
</div>
<%
		List<Utente> userList = (List<Utente>)request.getAttribute("userList");
 
	if( userList != null){ 
	
%>
<!--  esempio tabella  -->
<div class="container">
<div class="row justify-content-md-center">
<div class="col col-md-8">
	<table class="table table-striped table-dark">


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

</div>
</div>
</div>



<%
	} else {
%>
			<p> nessun utente trovato </p>
<%
	}
%>

</body>
</html>