package br.com.bluesoft.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.bluesoft.jdbc.modelo.Produto;

public class TestaInsercaoDeProduto {

		public static void main(String[] args) throws SQLException{
			Produto mesa = new Produto("Mesa Azul", "Mesa com 4 pés");
			try(Connection connection = new ConnectionPool().getConnection()){
				String sql = "insert into Produto (nome, descricao) values (?, ?)";
				try(PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
					
					stmt.setString(1, mesa.getNome());
					stmt.setString(2, mesa.getDescricao());
					stmt.execute();
					
					try(Resulst )
				
				}
			}
			
		}
}
