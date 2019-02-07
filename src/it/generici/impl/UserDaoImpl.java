package it.generici.impl;

import it.esempi.model.Utente;
import it.generici.interfacce.UserDao;

public class UserDaoImpl extends ClasseGenericaImpl implements UserDao {

	@Override
	public Utente findUserByUsernameandPassword(String username, String Password) {
		// TODO Auto-generated method stub
		Utente u = new Utente();
		
		
		return u;
	}



	
	
	// classe generica ha le crud....

}
