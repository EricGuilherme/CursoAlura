package br.com.bluesoft.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.bluesoft.jdbc.dao.ProdutosDAO;
import br.com.bluesoft.jdbc.modelo.Produto;

public class TestaProduto {

	public static void main(String[] args) throws SQLException {
		Produto produto = new Produto("Mesa Vermelha", "Mesa com 4 p�s");
		try (Connection connection = new ConnectionPool().getConnection()) {
			ProdutosDAO dao = new ProdutosDAO(connection);
			dao.salva(produto);
			
			List<Produto> produtos = dao.lista();
			
			for (Produto produto2 : produtos) {
				System.out.println("Existe o produto: " + produto2);
			} 
 		}
	}
}
