package it.esempi.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class BaseAbstratcServlet extends HttpServlet {

	/**
	 *  questo sistema potrebbe essereutile per fare in modo di fargli fare quello che voglio io nelle servlet
	 *  invece faccio un altra cosa un filtro.
	 *  
	 *  il giro è questo se estendo un altra classe con base abstract sono obbligato a implementare processRequest e fargli fare cose (tipo il controllo della 
	 *  connessione dell'utente ... in pratica qui potrei gestire le session,  ma non sono metodi ottimizzati infatti prenderemo un altra strada
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
		processRequest(req, resp);
		
	}
	
	public abstract void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  ;
	
	

}
