package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Tables {

	public static void main(String[] args) {

		Connection con = null; // Variável de conexão com o banco
		Statement st = null; // Onde serão escritos os comandos SQL
		
		try {
			con = ConnectionProvider.getCon();
			st = con.createStatement();
			
			// Criando as tabelas
			st.executeUpdate("CREATE TABLE appuser(appuser_pk INT AUTO_INCREMENT PRIMARY KEY, userRole VARCHAR(50), name VARCHAR(200), mobileNumber VARCHAR (50), email VARCHAR(200), password VARCHAR(50), adress VARCHAR(200), status VARCHAR(50))");
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		finally { // Encerra as variáveis de conexão com o banco
			try {
				con.close();
				st.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
