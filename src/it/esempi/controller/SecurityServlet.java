package it.esempi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.esempi.dao.UserDao;
import it.esempi.dao.Utente;

/**
 * Servlet implementation class SecurityServlet
 */
@WebServlet("/SecurityServlet")
public class SecurityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String forwardPath =null;
		UserDao Udao = new UserDao();
		Utente loggedUser  = Udao.findByUsernamePassword(username, password);
		
	
		
		
		if (loggedUser != null) {
			
				//response.sendRedirect("logged.jsp");
			// TODO: vado verso la dashboard
			forwardPath ="/WEB-INF/pages/dashboard.jsp";
			Utente ut = new Utente();
			ut.setUsername("Vincenzo");
			request.setAttribute("User", ut.getUsername() );
						
			// txt jsession id ..... cookie ... per ogni richiesta mi invia un jsesssion id 
			
		} else {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
