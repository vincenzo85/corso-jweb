package it.esempi.controller;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.esempi.dao.UserCredetial;
import it.esempi.dao.UserDao;
import it.esempi.dao.Utente;

/**
 * Servlet implementation class SecurityServlet
 */
//@WebServlet("/SecurityServlet")
public class SecurityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       // le variabili di instanza qui servono per tutte quelle informazioni che fanno parte di tutti gli utenti (globali) come ad esempio un contantore
	   // mai mettere qui variabili del singolo utenti ci potrebbero essere problemi di autenticazione
	
	// allo startup di questa applicazione ... tomcat chiama sempre il metodo service (in questo caso quello della classe padre)
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecurityServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserCredetial uc = new UserCredetial();
		uc.setUsername(request.getParameter("username"));
		uc.setPassword(request.getParameter("password")); 
		
		String forwardPath =null;
		UserDao Udao = new UserDao();
		Utente User  = Udao.findByUsernamePassword(uc);
	
		
		
//		if (User != null && AutenticationHelper.isAllowed(uc, User)) {
		if (User != null ) {
			
				//response.sendRedirect("logged.jsp");
			// TODO: vado verso la dashboard
			forwardPath ="/WEB-INF/pages/dashboard.jsp";
			
			request.setAttribute("user", User.getUsername() );
						
			// txt jsession id ..... cookie ... per ogni richiesta mi invia un jsesssion id 
			
			
		}else {
			// TODO: vado verso la login con testo di errore
			forwardPath ="/WEB-INF/pages/login.jsp";
			String errorMessage = "Ritenta...";
			request.setAttribute("errorMsg", errorMessage );
			
		}
		
		
		getServletContext().getRequestDispatcher(forwardPath).forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// qui metterò l'implementazione del log out
	}

}
