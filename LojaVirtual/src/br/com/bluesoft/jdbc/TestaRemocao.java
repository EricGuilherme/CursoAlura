package br.com.bluesoft.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionPool().getConnection();
		
		Statement statement = connection.createStatement();
		
		statement.execute("delete from produto where id > 3");
		int count = statement.getUpdateCount();
		System.out.println(count + " Linhas atualizadas");
				
		connection.close();
		
	}
}
