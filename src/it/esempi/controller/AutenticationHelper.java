package it.esempi.controller;

import it.esempi.dao.UserCredetial;
import it.esempi.dao.Utente;

public class AutenticationHelper {
	// passaggio inutile quindi lo tolgo e metto la seconda where condition in userdao
	
		  public static boolean isAllowed(UserCredetial uc, Utente utente) {
		    return uc.getUsername().contentEquals(utente.getUsername()) && uc.getPassword().contentEquals(utente.getPassword());
		  }
		

}
