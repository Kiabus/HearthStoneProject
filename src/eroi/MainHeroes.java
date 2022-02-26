package eroi;

/**
 * 
 * @author Chiara
 * gli eroi si presentano
 * i dati arrivano dalla connessione al db!
 */

import java.sql.SQLException;

import dao.Heroes;

public class MainHeroes {

	public static void main(String[] args) throws SQLException {
		
		Heroes heroes = new Heroes();
		heroes.presentaEroi();

	}

}
