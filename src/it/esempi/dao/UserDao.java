package it.esempi.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.test.db.DatabaseUtils;



public class UserDao {
	
	
	public Utente findByUsernamePassword(String username, String password) {
		
			
			List<Utente> retList = null;
			
				Connection connection = null;
				
				// 2 apro la connessione;
				
				try {
					connection = DatabaseUtils.getInstance().openMySqlConnection();     
					Statement stmt = connection.createStatement();	
					String sql = "select id, nome, cognome, version from autore";
					ResultSet rs = stmt.executeQuery(sql);
					retList = new ArrayList<>();
				
				while(rs.next()) {
					System.out.println(rs);
					Autore au = new Autore();
					au.setId(rs.getInt("id"));
					au.setNome(rs.getString("nome"));
					au.setCognome(rs.getString("cognome"));
					retList.add(au);
							
				}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return retList;
			}
		
		
	

}
