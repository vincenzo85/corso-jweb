package it.esempi.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import it.esempi.model.Utente;
import it.test.db.DatabaseUtils;

public class UserDao {
	
	public List<Utente> findAll(){
		
		EntityManager em = null;
		
		List<Utente> lu = null;
		
		try {
			DatabaseUtils dbu = DatabaseUtils.getInstance();
			em = dbu.getEntityManager();
			lu = new ArrayList<Utente>();
			Query q = em.createQuery("select u from Utente u");
			// query ottimizzata ... per non fare due query....
	//	Query q2 = em.createQuery("select o from Order o join o.cliente c where o.quantita = :quant and c.piva = :piva");

	//	q.setParameter("quant", quantity);
	//	q.setParameter("piva", piva);
			
		lu = q.getResultList();

			
		} finally {
			em.close();
		}
		
		
		return lu;
		
	}
	
	

//	public Utente findByUsernamePassword(UserCredetial uc) {
//		
//			
//			Utente u = null;
//			
//				Connection connection = null;
//				
//				// 2 apro la connessione;
//				
////				Crearsi la tabella utenti
////				CREATE TABLE `corso_java`.`utenti` (
////				
////						  `id` INT NOT NULL AUTO_INCREMENT,
////						  `username` VARCHAR(45) NULL,
////						  `password` VARCHAR(45) NULL,
////						  PRIMARY KEY (`id`),
////						  UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE);
//				
//				try {
//					connection = DatabaseUtils.getInstance().openMySqlConnection();     
//					
//					String sql = "select id, username, password from utenti where username = ? and where password = ?";
//					PreparedStatement stmt = connection.prepareStatement(sql);
//					stmt.setString(1, uc.getUsername());
//					stmt.setString(2, uc.getPassword());
//					ResultSet rs = stmt.executeQuery();
//					
//					// while è inutile if è meglio ... c'è ne solo uno
//					
//					if(rs.next()) {
//						u = new Utente();
//						
//						
//						u.setId(rs.getLong("id"));
//						u.setUsername(rs.getString("username"));
//						//u.setPassword(rs.getString("password"));
//						//la password mi serviva quando facevo l'auth helper ora non mi serve e non la mando in sessione
//						
//						
//					}
//				
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				return u;
//			}
//		
//		/*
//		 *  sto inserendo su workbench due utenti in più tanto per nn avere una lista vuota 
//		 * INSERT INTO `corso_java`.`utenti` (`username`, `password`) VALUES ('test@test.it', '123456');
//		 * INSERT INTO `corso_java`.`utenti` (`username`, `password`) VALUES ('pro@pro.it', '123456');
//		 * 
//		 * */
//	
//	public List<Utente> findAll(){
//		
//		Utente u = null;
//		List<Utente> lu = null;
//		Connection connection = null;
//		
//		try {
//			connection = DatabaseUtils.getInstance().openMySqlConnection();     
//			
//			String sql = "select id, username, password from utenti";
//			PreparedStatement stmt = connection.prepareStatement(sql);
//			ResultSet rs = stmt.executeQuery();
//			
//			// while è inutile if è meglio ... c'è ne solo uno
//			lu = new ArrayList<Utente>();
//			while(rs.next()) {
//				u = new Utente();
//				
//				
//				u.setId(rs.getLong("id"));
//				u.setUsername(rs.getString("username"));
//				u.setPassword(rs.getString("password"));
//				//la password in teoria non dovrei inviarla cmq è solo un esempio
//				lu.add(u);
//				}
//		
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	     return lu;
//	
//		
//		
//	
//		
//	}
//	
//	public List<Utente> searchByUsernamePassword(UserSearch uc){
//		
//		Utente u = null;
//		List<Utente> lu = null;
//		Connection connection = null;
//		
//		try {
//			connection = DatabaseUtils.getInstance().openMySqlConnection();     
//			
//			String sql = "select id, username, password from utenti where username like ?"; 
//	// or password like '%?%'";
//			PreparedStatement stmt = connection.prepareStatement(sql);
//			
//			stmt.setString(1, "%"+uc.getSearch()+"%");
//		//	stmt.setString(2, uc.getSearch());
//			
//			ResultSet rs = stmt.executeQuery();
//			
//			// while è inutile if è meglio ... c'è ne solo uno
//			lu = new ArrayList<Utente>();
//			while(rs.next()) {
//				u = new Utente();
//				
//				
//				u.setId(rs.getLong("id"));
//				u.setUsername(rs.getString("username"));
//				u.setPassword(rs.getString("password"));
//				//la password in teoria non dovrei inviarla cmq è solo un esempio
//				lu.add(u);
//				}
//		
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return lu;
//	}
//	

}
