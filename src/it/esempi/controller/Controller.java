package it.esempi.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.esempi.dao.UserDao;
import it.esempi.dao.Utente;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String forwardPath =null;
		UserDao Udao = new UserDao();
		Utente loggedUser  = Udao.findByUsernamePassword(username, password);
		
		if (loggedUser != null) {
			
				//response.sendRedirect("logged.jsp");
			// TODO: vado verso la dashboard
			forwardPath ="WEB-INF/pages/dashboard.jsp";
		} else {
			// TODO: vado verso la login con testo di errore
			forwardPath ="WEB-INF/pages/login.jsp";
			String errorMessage = "Ritenta...";
			request.setAttribute("errorMsg", errorMessage );
			
		}
		/*
		ServletContext sc = getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher(forwardPath);
		rd.forward(request, response);
		
		forma non controtta di quella di sotto,
		server context ha un ciclo di vita collegata al contensto;
		*/ 
		
		
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
