/**
 * Application.java
 *
 * robgion
 * www.2clever.it
 * 
 * 06 giu 2017
 * For further information please write to info@2clever.it
 */
 //prova
package it.generici.appl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import it.generici.impl.UserDaoImpl;
import it.generici.interfacce.UserDao;



/**
 * @author robgion
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		UserDao ud = new UserDaoImpl();
		
		ud.findUserByUsernameandPassword("test", "test");
		// cosi non ho save ...  della crud quindi devo estendere quella generica della classe
		ud.save();
	}

}
