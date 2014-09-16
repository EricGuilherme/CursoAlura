package br.com.bluesoft.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem{

	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionPool().getConnection();
		for (int i = 0; i < 100; i++) {
		
			
			Statement statement = (Statement) connection.createStatement();
			boolean resultado = statement.execute("select * from produto");
			ResultSet resultSet = statement.getResultSet();
			
			while(resultSet.next()){
			
				int id = resultSet.getInt("id");
				String nome = resultSet.getString("nome");
				String descricao = resultSet.getString("descricao");
				
				System.out.println(id);
				System.out.println(nome);
				System.out.println(descricao);
				
				System.out.println(resultado);
			}			
				resultSet.close();
				statement.close();
				connection.close();
		}
	}
}
	