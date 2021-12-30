package connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

	public static void main(String[] args) {
		//url connessione
		String connectionString = "jdbc:sqlite:HearthStone.db";
		
		java.sql.Connection connection = null;
		try 
		{
			//caricamento del driver
			Class.forName("org.sqlite.JDBC");
			
			//creazione della connessione
			connection = DriverManager.getConnection(connectionString);
			System.out.println("Connessione stabilita!");
			
			//creazione statement
			Statement stm = connection.createStatement();
			
			//esecuzione del comando
			ResultSet rs = stm.executeQuery("select * from eroi");
			
			//stampa dei risultati
			while(rs.next())
			{
				System.out.println(rs.getString("nome") + " " + rs.getString("cognome") + " della specie " + rs.getString("specie"));
			}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			try {
				if(connection!=null)
					connection.close();
			}
			catch(SQLException e)
			{
				//gestione eccezione
			}
		}
	}

}
