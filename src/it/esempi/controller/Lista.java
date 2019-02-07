package it.esempi.controller;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.esempi.dao.Autore;
import it.esempi.dao.UserCredetial;
import it.esempi.dao.UserDao;

import it.esempi.model.UserSearch;

/**
 * Servlet implementation class List
 */
@WebServlet({ "/list", "/list2" })
public class Lista extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//creo una lista fittizia di autori
		
		ArrayList<Autore> listaAutori = new ArrayList<Autore>();
		
		
	 
	
	UserDao udall = new UserDao();
	
		//listaAutori = udall.findAll();
		
		
		
		
		
		
		String forwardPath ="/WEB-INF/pages/list.jsp";
		
		request.setAttribute("listaAutori", listaAutori );
		getServletContext().getRequestDispatcher(forwardPath).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
