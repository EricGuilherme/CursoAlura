package br.com.caelum.produtos.controller;


import java.util.List;

import org.springframework.stereotype.Controller;

import br.com.caelum.produtos.dao.ProdutoDao;
import br.com.caelum.produtos.modelo.Produto;
import br.com.caelum.vraptor.Result;

@Controller
public class ProdutoController {

	private Result result;
	private ProdutoDao dao;

	public ProdutoController(Result result, ProdutoDao produtoDao) {
		this.result = result;
		this.dao = produtoDao;
	}

	public List<Produto> lista() {
		result.include("lista", dao.lista());
		return dao.lista();
	}

	public void adiciona(Produto produto) {
		dao.adiciona(produto);
		result.redirectTo(ProdutoController.class).lista();
	}

	public void formulario() {
	}

	public void remove(Produto produto) {
		dao.remove(produto);
		//removendo para utilizar AJAX na página
		//result.redirectTo(ProdutoController.class).lista();
	}
}
