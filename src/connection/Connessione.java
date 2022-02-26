package connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Connessione {
	
	private final static String URL = "jdbc:sqlite:HearthStone.db";
	private final static String DRIVER = "org.sqlite.JDBC";
	
	private static Connection conn = null;
	
	public static Connection getConnessione() {
		
		try {
			//caricamento del driver
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection(URL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
			
	}
	
	public static Connection closeConnessione() throws SQLException{
		
			if(conn != null) {
				conn.close();
			}
			
			return conn;

	}

}
