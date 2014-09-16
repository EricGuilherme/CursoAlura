package br.com.bluesoft.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {
	public static void main(String[] args) throws SQLException {
		
		
		Connection connection = new ConnectionPool().getConnection();
		connection.setAutoCommit(false);
		
		try{
			String sql = "insert into Produto (nome, descricao) values(?, ?)";
		
			PreparedStatement statement = connection.prepareStatement(sql, 				
					Statement.RETURN_GENERATED_KEYS);
		
			adiciona("Tv LCD", "60 Polegadas", statement);	
			connection.commit();
			adiciona("DVD", "Aparelho de DVD", statement);	
		
			statement.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
			connection.rollback();
		}
		connection.close();
	}

	private static void adiciona(String nome, String descricao,
			PreparedStatement statement) throws SQLException {
		statement.setString(1, nome);
		statement.setString(2, descricao);
		
		boolean resultado = statement.execute();
		System.out.println(resultado);
		
		ResultSet resultSet = statement.getGeneratedKeys();
		
		while(resultSet.next()){
			String id = resultSet.getString("id");
			System.out.println(id + " gerado");
		}
		
		resultSet.close();
	}

	
	
}
