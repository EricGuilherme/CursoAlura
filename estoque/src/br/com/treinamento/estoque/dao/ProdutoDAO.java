package br.com.treinamento.estoque.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.treinamento.estoque.ConnectionFactory;
import br.com.treinamento.estoque.modelo.Produto;

public class ProdutoDAO {
	private Connection connection;

	public ProdutoDAO() {
		try {
			this.connection = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void adiciona(Produto produto) {
		String sql = "insert into produto (descricao, valor, quantidade, dataEntrada) values (?,?,?,?)";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getDescricao());
			stmt.setDouble(2, produto.getValor());
			stmt.setInt(3, produto.getQuantidade());
			stmt.setDate(4, new Date(Calendar.getInstance().getTimeInMillis()));
			stmt.execute();
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Produto produto) {

		if (produto.getId() == null) {
			throw new IllegalStateException("Id do produto naoo deve ser nula.");
		}

		String sql = "delete from produto where id = ?";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setLong(1, produto.getId());
			stmt.execute();
			
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Produto produto) {
		String sql = "update produto set descricao = ?, valor = ?, quantidade = ?, dataEntrada = ? where id = ?";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getDescricao());
			stmt.setDouble(2, produto.getValor());
			stmt.setInt(3, produto.getQuantidade());
			stmt.setDate(4, new Date(Calendar.getInstance().getTimeInMillis()));
		
			stmt.execute();
			
			connection.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Produto> lista() {
		try {
			List<Produto> produtos = new ArrayList<Produto>();
			PreparedStatement stmt = this.connection
					.prepareStatement("select * from produtos");

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// adiciona o produto na lista
				produtos.add(populaProduto(rs));
			}

			rs.close();
			stmt.close();
			connection.close();

			return produtos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Produto buscaPorId(Long id) {

		
		if (id == null) {
			throw new IllegalStateException("Id do produtos nao deve ser nulo.");
		}

		try {
			PreparedStatement stmt = this.connection
					.prepareStatement("select * from produtos where id = ?");
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				connection.close();
				return populaProduto(rs);
			}

			rs.close();
			stmt.close();
			

			connection.close();
			return null;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private Produto populaProduto(ResultSet rs) throws SQLException {
		Produto produto = new Produto();

		produto.setId(rs.getLong("id"));
		produto.setDescricao(rs.getString("descricao"));
		produto.setValor(rs.getDouble("valor"));
			
		return produto;
	}
}
