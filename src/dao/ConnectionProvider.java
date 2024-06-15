package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	
	// Configuração de conexão com o banco de dados
	public static Connection getCon() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Inventory?useSSL=false", "developer", "root");
			
			return con;
		}
		
		catch (Exception e) {
			System.out.println(e);
			
			return null;
		}
	};
	
}
