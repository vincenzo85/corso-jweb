package it.esempi.servlet.list;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.esempi.dao.Autore;

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
		
		ArrayList<Autore> listaAutori = new ArrayList<Autore>();
		Autore au1 =new Autore();
		Autore au2 =new Autore();
		Autore au3 =new Autore();
		au1.setAutore(1, "Massimo", "Boldi", "Comico");
		au2.setAutore(2, "Gabriele", "Cirilli", "Comico");
		au3.setAutore(3, "Cluadio", "Bisio", "Comico");
		listaAutori.add(au1);
		listaAutori.add(au2);
		listaAutori.add(au3);
		
		
		
		
		
		
		String forwardPath ="/WEB-INF/pages/list.jsp";
		
		request.setAttribute("listaAutori", listaAutori );
		getServletContext().getRequestDispatcher(forwardPath).forward(request, response);
		
	}

}
