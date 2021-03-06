package br.com.bluesoft.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.bluesoft.jdbc.modelo.Categoria;
import br.com.bluesoft.jdbc.modelo.Produto;

public class CategoriaDAO {

	private Connection connection;

	public CategoriaDAO(Connection connection) {
		this.connection = connection;

	}

	public List<Categoria> lista() throws SQLException {
		List<Categoria> categorias = new ArrayList<>();
		Categoria ultima = null;

		String sql = "select * from Categoria";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet resultado = stmt.getResultSet()) {
				while (resultado.next()) {
					int id = resultado.getInt("id");

					String nome = resultado.getString("nome");
					if (ultima == null || !ultima.getNome().equals(nome)) {
						Categoria categoria = new Categoria(id, nome);
						categorias.add(categoria);
						ultima = categoria;
					}
					int idDoProduto = resultado.getInt("id");
					String nomeDoProduto = resultado.getString("nome");
					String descricaoDoProduto = resultado.getString("descricao");
									
					Produto p = new Produto(nomeDoProduto, descricaoDoProduto);
					p.setId(idDoProduto);
					ultima.adiciona(p);
				}
			}
		}
		return categorias;
	}

	public List<Categoria> listaComProduto() throws SQLException {
		List<Categoria> categorias = new ArrayList<>();

		String sql = "select * from Categoria as c join Produto as p on p.categoria_id = c.id";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet resultado = stmt.getResultSet()) {
				while (resultado.next()) {
					int id = resultado.getInt("id");
					String nome = resultado.getString("nome");
					Categoria categoria = new Categoria(id, nome);
					categorias.add(categoria);
				}
			}
		}
		return categorias;
	}

}
