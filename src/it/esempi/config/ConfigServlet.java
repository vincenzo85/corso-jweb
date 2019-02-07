package it.esempi.config;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import it.esempi.dao.ConfigDb;
import it.test.db.DatabaseUtils;

public class ConfigServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	

	/*
	 * stiamo facendo una configurazione 
	 * 
	 * 
	 * 
	 * */
	
	@Override
	public void init( ) throws ServletException {
		
		super.init();
		
	/*	String mySqlDriver = getInitParameter("MYSQL_DRIVER");
		String databaseUrl = getInitParameter("DATABASE.URL");
		String databaseUsername = getInitParameter("DATABASE.USERNAME");
		String databasePassword = getInitParameter("DATABASE.PASSWORD");
		
		ConfigDb cdb = new ConfigDb(mySqlDriver, databaseUrl, databaseUsername, databasePassword);
		
		DatabaseUtils.getInstance().configDb(cdb);
	*/
		
		DatabaseUtils.getInstance();
		
//		/*sto inizializzando la mia servlet*/
//		  <init-param>
//		  	<description>Parametro di inizzializzazione del driver di Mysql</description>
//		  	<param-name>MYSQL_DRIVER</param-name>
//		  	<param-value>com.mysql.jdbc.Driver</param-value>
//		  </init-param>
//
//		   <init-param>
//		  	<description>Parametro di inizzializzazione del DATABASE Mysql</description>
//		  	<param-name>DATABASE.URL</param-name>
//		  	<param-value>jdbc:mysql://localhost:3306/corso_java?useSSL=false</param-value>
//		  </init-param>
//			<init-param>
//		  	<description>Parametro di inizzializzazione del DATABASE USERNAME</description>
//		  	<param-name>DATABASE.USERNAME</param-name>
//		  	<param-value>jdbc:mysql://localhost:3306/corso_java?useSSL=false</param-value>
//		  </init-param>
//		   <init-param>
//		  	<description>Parametro di inizzializzazione del DATABASE Mysql</description>
//		  	<param-name>DATABASE.PASSWORD</param-name>
//		  	<param-value>jdbc:mysql://localhost:3306/corso_java?useSSL=false</param-value>
//		  </init-param>
//		
		
		
		
	}
	
	
	

}
