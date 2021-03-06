package it.esempi.servlet.list;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import it.esempi.dao.UserDao;

import it.esempi.model.UserSearch;

/**
 * Servlet implementation class UserListServlet
 */
@WebServlet("/lista-utenti")
public class UserListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserDao ud = new UserDao();
		List<it.esempi.model.Utente> userList = ud.findAll();
		if(userList != null) {
		request.setAttribute("userList", userList);
		getServletContext().getRequestDispatcher("/WEB-INF/pages/users/userlist.jsp").forward(request, response);
		
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	/*	UserSearch us = new UserSearch();
		us.setSearch(request.getParameter("search"));
	
		
		
		List<it.esempi.model.Utente> ul = new ArrayList<it.esempi.model.Utente>();
		UserDao Udao = new UserDao();
		ul  = 
		
		request.setAttribute("userSearch", us);
		if(ul != null) {
			request.setAttribute("userList", ul);
			
			getServletContext().getRequestDispatcher("/WEB-INF/pages/users/userlist.jsp").forward(request, response);
			
			}*/
		
	}

}
