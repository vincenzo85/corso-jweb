package it.generici.interfacce;

import it.esempi.model.Utente;

public interface UserDao  extends InterfacciaGenerica {
	
	public Utente findUserByUsernameandPassword(String username, String Password);

}
