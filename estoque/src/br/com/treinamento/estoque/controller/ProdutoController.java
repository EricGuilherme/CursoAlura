package br.com.treinamento.estoque.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.treinamento.estoque.dao.ProdutoDAO;
import br.com.treinamento.estoque.modelo.Produto;



@Controller
public class ProdutoController {
	@RequestMapping(value="/formulario")
	public String formulario(){
		
		return "produto/formulario";
		
	}
	
	@RequestMapping("/adicionaConta")
	public String adiciona(@Valid Produto produto, BindingResult result){
		
		if(result.hasErrors()){
			return "produto/formulario";
		}
	
		System.out.println("Produto adicionada foi:" + produto.getDescricao());
		ProdutoDAO dao = new ProdutoDAO();
		dao.adiciona(produto);
		
		return "redirect:/listaContas";		
	}
	
	@RequestMapping("/removeConta")
	public String remove(Produto produto){
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.remove(produto);
		
		return "redirect:/listaContas";
	}
	
	
	@RequestMapping("/mostraConta")
	public String mostra(Long id, Model model) {
	  ProdutoDAO dao = new ProdutoDAO();
	  model.addAttribute("produto", dao.buscaPorId(id));
	  return "produto/mostra";
	}
	
	@RequestMapping("/alteraConta")
	public String altera(Produto produto) {
	  ProdutoDAO dao = new ProdutoDAO();
	  dao.altera(produto);
	  return "redirect:listaProdutos";
	}
		
	@RequestMapping ("/listaProdutos")
	public ModelAndView lista(){
		
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = (List<Produto>) dao.lista();
		
		ModelAndView mv = new ModelAndView("produto/lista");
		mv.addObject("produtos", produtos);			
		
		return mv;
	
	}
}	
