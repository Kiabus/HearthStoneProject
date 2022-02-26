package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import connection.Connessione;

public class Heroes {
	
	//implemento la classe connessione
	private Connection conn = null;
	private Statement stmn = null;
	private ResultSet rs = null;
	
	public void presentaEroi() throws SQLException{
		
		String sql = "select * from eroi";
		
		try {
			//mi connetto al db e creo lo statement
			conn = Connessione.getConnessione();
			stmn = conn.createStatement();
			rs = stmn.executeQuery(sql);
			
			while(rs.next()){
				System.out.println(rs.getString("nome") + " " + rs.getString("cognome") + " della specie " + rs.getString("specie"));
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		}
		finally 
		{
			//chiudere connessione
			conn = Connessione.closeConnessione();
		}
			
	}
	
}




