package database;

import java.security.KeyStore.PrivateKeyEntry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbConnection {
	private Connection connection;
	private static String projectLocation = System.getenv("PROJECT_LOC");
	private static String dbName = "CatalogoSpadeCompleto.db";
	
	private Connection connect() {
		try {
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:" + projectLocation + "/" + dbName);
			System.out.println("Connessione avvenuta con successo.");
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return connection;
	}
	
	public void close() {
		try {
			this.connection.close();
			System.out.println("Disconnessione avvenuta con successo.");
		}
		
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//TODO: Da completare insert
	public void insert() {
		Connection c = this.connect();
	}
}
