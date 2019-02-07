package it.test.db;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;





public class DatabaseUtils {
	
	/* ho una variabile statica in memoria al primo avvio del db */
	
	//private static ConfigPropertyLoader cfg =null;
	private static DatabaseUtils _instance = null;
	
//	private ConfigDb cfb=null;
	
	//se utilizziamo quella classe per contenere dei dati particolari 
	
	/*
	 * Se devo fare l'inizializzazione del driver una volta sola non possiamo fare n volte l'instanza della classe
	 * 
	 * in jpa c'è un momento che prevede l'avvio del framework 
	 * 
	 * in cui accende un motore interno
	 * 
	 * vengono create delle classe per fornire connessioni all'applicazione
	 * 
	 * se noi esponiamo quella classe a un dao e la chiudiamo quella automaticamente sega tutte le connessioni vero il dv
	 * 
	 * costruttore privato .... che crea la classe e la tiene in caldo.
	 * 
	 * essendo una variabile privata e accessibile ? no
	 * 
	 * espongo solo i piccoli metodi a tutti i dai.
	 * 
	 * se lo instanzio n volte ... resetto le connessioni, quindi  lo faccio una volta sola....
	 * 
	 * 
	 * 
	 * */
	
	private EntityManagerFactory em = null;
	
	
	
	
	private DatabaseUtils() {
		
		em = Persistence.createEntityManagerFactory("jpaTest");
	}
	
	public static DatabaseUtils getInstance() {
		if(_instance == null) {
			_instance = new DatabaseUtils();
		}
		return _instance;
	}
	
	public EntityManager getEntityManager() {
		return em.createEntityManager();
	}
	
	
		

}
