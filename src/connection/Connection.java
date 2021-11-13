package connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String connectionString = "jdbc:sqlite:HearthStone.db";
		
		java.sql.Connection connection = null;
		try 
		{
			//caricamento del driver
			Class.forName("org.sqlite.JDBC");
			
			//creazione della connessione
			connection = DriverManager.getConnection(connectionString);
			System.out.println("Connessione stabilita!");
			
			connection.close();	
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
