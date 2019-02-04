package it.esempi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import it.test.db.DatabaseUtils;



public class UserDao {
	
	
	public Utente findByUsernamePassword(UserCredetial uc) {
		
			
			Utente u = null;
			
				Connection connection = null;
				
				// 2 apro la connessione;
				
//				Crearsi la tabella utenti
//				CREATE TABLE `corso_java`.`utenti` (
//				
//						  `id` INT NOT NULL AUTO_INCREMENT,
//						  `username` VARCHAR(45) NULL,
//						  `password` VARCHAR(45) NULL,
//						  PRIMARY KEY (`id`),
//						  UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE);
				
				try {
					connection = DatabaseUtils.getInstance().openMySqlConnection();     
					
					String sql = "select id, username, password from utenti where username = ? and where password = ?";
					PreparedStatement stmt = connection.prepareStatement(sql);
					stmt.setString(1, uc.getUsername());
					stmt.setString(2, uc.getPassword());
					ResultSet rs = stmt.executeQuery();
					
					// while è inutile if è meglio ... c'è ne solo uno
					
					if(rs.next()) {
						u = new Utente();
						
						
						u.setId(rs.getLong("id"));
						u.setUsername(rs.getString("username"));
						u.setPassword(rs.getString("password"));
						
						
						
					}
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return u;
			}
		
		
	

}
