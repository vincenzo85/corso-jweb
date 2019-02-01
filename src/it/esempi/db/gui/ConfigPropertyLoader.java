/**
 * ConfigPropertyLoader.java
 *
 * robgion
 * www.2clever.it
 * 
 * 21 giu 2017
 * For further information please write to info@2clever.it
 */
package it.esempi.db.gui;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.http.HttpServlet;

/**
 * @author robgion
 *
 * Classe per il caricamento di risorse esterne tramite file *.properties.
 */
public class ConfigPropertyLoader  extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final String DRIVER ="database.driver";
	public final String URL = "database.url";
	public final String USERNAME="database.username";
	public final String PASSWORD="database.password";
	public final boolean DEV_MODE=false;
	

	private Properties prop = new Properties();
	
	public ConfigPropertyLoader() throws Exception {
		
		loadConfigFile();
	}
	
	private void loadConfigFile() throws Exception {
	
		FileInputStream fis = null;
		try {
			
			InputStream input =  getServletContext().getResourceAsStream("/WEB-INF/configs.properties");
			prop.load(input);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(fis != null) {
				fis.close();
			}
		}
	}
	
	public String readProperty(String key) {
		return prop.getProperty(key);
	}
	
	
	
	

	
}
