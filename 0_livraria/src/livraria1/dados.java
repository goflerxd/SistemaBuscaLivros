/// Area de conexão banco de dados e aplicação 

package livraria1;

import java.sql.ResultSet;

import java.util.Vector;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class dados extends conexao {
	public dados() throws Exception{
		
	}
	public <livros> Vector Pesquisar(String pesq) throws Exception{
		
		Vector tb = new Vector();
		String url = " select from projeto.livros where Nome like " + pesq + "%'";
		PreparedStatement ps = ((Connection) getConexao()).prepareStatement(url);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) 
		{
			Vector nl = new Vector();
			nl.add(rs.getString("nome"));
			nl.add(rs.getString("autor"));
			nl.add(rs.getString("lancamento"));
			nl.add(rs.getString("capa"));
			nl.add(rs.getInt("status"));
			tb.add(nl);
			
		}
		return tb;
			
	}
	private Object getConexao() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
