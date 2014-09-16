package br.com.bluesoft.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.bluesoft.jdbc.dao.CategoriaDAO;
import br.com.bluesoft.jdbc.modelo.Categoria;
import br.com.bluesoft.jdbc.modelo.Produto;

public class TestaCategoria {

	public static void main(String[] args) throws SQLException {
		
		try(Connection connection = new ConnectionPool().getConnection()){
			List<Categoria> categorias = new CategoriaDAO(connection).listaComProduto();
			for(Categoria categoria : categorias){
				System.out.println(categoria.getNome());
				
				for (Produto produto : categoria.getProdutos()){
					System.out.println(categoria.getNome() + " - " + produto.getNome());					
				}
			}
		}
	}
}
