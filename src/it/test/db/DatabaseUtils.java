package it.test.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import it.esempi.db.gui.ConfigPropertyLoader;

public class DatabaseUtils {
	
	/* ho una variabile statica in memoria al primo avvio del db */
	
	private static ConfigPropertyLoader cfg =null;
	private static DatabaseUtils _instance = null;
	
	private DatabaseUtils() {};
	public static DatabaseUtils getInstance() {
		if(_instance == null) {
			_instance = new DatabaseUtils();
		}
		return _instance;
	}
	
	static {
		try {
			
			cfg = new ConfigPropertyLoader();
//			System.out.println(cfg.readProperty(cfg.DRIVER));
			Class.forName(cfg.readProperty(cfg.DRIVER));
			
			
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			/* nelle applicazioni desktop si, in quelle web mai metterlo */
			System.exit(0);
			
		}
		
	}
	
	public static Connection openMySqlConnection () throws SQLException {
		
		// sono a basso livello quindi faccio il throws
		System.out.println(cfg.readProperty(cfg.URL));
		System.out.println(cfg.readProperty(cfg.USERNAME));
		System.out.println(cfg.readProperty(cfg.PASSWORD));
		
		return DriverManager.getConnection(cfg.readProperty(cfg.URL), cfg.readProperty(cfg.USERNAME), cfg.readProperty(cfg.PASSWORD));
		
		
	};
	

}
