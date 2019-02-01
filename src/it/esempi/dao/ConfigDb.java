package it.esempi.dao;

public class ConfigDb {
	
	private String mySqlDriver ;
	private String databaseUrl ;
	private String databaseUsername ;
	private String databasePassword ;
	
	
	
	public ConfigDb(String mySqlDriver, String databaseUrl, String databaseUsername, String databasePassword) {
		super();
		this.mySqlDriver = mySqlDriver;
		this.databaseUrl = databaseUrl;
		this.databaseUsername = databaseUsername;
		this.databasePassword = databasePassword;
	}
	public String getMySqlDriver() {
		return mySqlDriver;
	}
	public void setMySqlDriver(String mySqlDriver) {
		this.mySqlDriver = mySqlDriver;
	}
	public String getDatabaseUrl() {
		return databaseUrl;
	}
	public void setDatabaseUrl(String databaseUrl) {
		this.databaseUrl = databaseUrl;
	}
	public String getDatabaseUsername() {
		return databaseUsername;
	}
	public void setDatabaseUsername(String databaseUsername) {
		this.databaseUsername = databaseUsername;
	}
	public String getDatabasePassword() {
		return databasePassword;
	}
	public void setDatabasePassword(String databasePassword) {
		this.databasePassword = databasePassword;
	}
	
	
	
	

}
