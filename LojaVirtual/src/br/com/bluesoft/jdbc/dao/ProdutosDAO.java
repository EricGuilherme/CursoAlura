package br.com.bluesoft.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.bluesoft.jdbc.modelo.Categoria;
import br.com.bluesoft.jdbc.modelo.Produto;

public class ProdutosDAO {

	private final Connection connection;

	public ProdutosDAO(Connection connection) {
		this.connection = connection;

	}

	public void salva(Produto mesa) throws SQLException {
		String sql = "insert into Produto (nome, descricao) values (?, ?)";
		try (PreparedStatement stmt = connection.prepareStatement(sql,
				Statement.RETURN_GENERATED_KEYS)) {

			stmt.setString(1, mesa.getNome());
			stmt.setString(2, mesa.getDescricao());
			stmt.execute();

			try (ResultSet resultado = stmt.getGeneratedKeys()) {
				if (resultado.next()) {
					int id = resultado.getInt("id");
					mesa.setId(id);
				}
			}
		}
	}

	public List<Produto> lista() throws SQLException {
		List<Produto> produtos = new ArrayList<>();
		String sql = "select * from Produto";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.execute();

			transformaResultadoEmProdutos(stmt, produtos);
		}

		return produtos;
	}

	private void transformaResultadoEmProdutos(PreparedStatement stmt, List<Produto> produtos)
			throws SQLException {
		try (ResultSet resultado = stmt.getResultSet()) {
			while (resultado.next()) {
				int id = resultado.getInt("id");
				String nome = resultado.getString("nome");
				String descricao = resultado.getString("descricao");
				Produto produto = new Produto(nome, descricao);
				produto.setId(id);
				produtos.add(produto);

			}
		}
	}

	public List<Produto> busca(Categoria categoria) throws SQLException {
		List<Produto> produtos = new ArrayList<>();
		String sql = "select * from Produto where categoria_id = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setInt(1,categoria.getId());
			stmt.execute();

			transformaResultadoEmProdutos(stmt, produtos);
		}

		return produtos;
	}

}
