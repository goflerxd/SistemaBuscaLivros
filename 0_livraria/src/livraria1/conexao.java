/// Área de conexões entre banco de dados e aplicação

package livraria1;

import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;



public class conexao {
	public Connection conexao() {
		Connection conn = null;
		
		try {
			String url = "jdbc:mysql://localhost:3306/projeto?user=root&password=12345";
			conn = (Connection) DriverManager.getConnection(url);
			
			
		}catch(SQLException erro) {
			JOptionPane.showMessageDialog(null,"conexao" + erro.getMessage());
		}
		return conn;
	}
}


