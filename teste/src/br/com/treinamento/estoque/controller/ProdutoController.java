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
		
		return "conta/formulario";
		
	}
	
	@RequestMapping("/adicionaProduto")
	public String adiciona(@Valid Produto conta, BindingResult result){
		
		if(result.hasErrors()){
			return "conta/formulario";
		}
	
		System.out.println("Conta adicionada foi:" + conta.getDescricao());
		ProdutoDAO dao = new ProdutoDAO();
		dao.adiciona(conta);
		
		return "redirect:/listaContas";		
	}
	
	@RequestMapping("/removeConta")
	public String remove(Produto conta){
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.remove(conta);
		
		return "redirect:/listaContas";
	}
	
	@RequestMapping("/pagaConta")
	public void paga(Produto conta, HttpServletResponse response){

		ProdutoDAO dao = new ProdutoDAO();
		dao.paga(conta.getId());
		
		response.setStatus(200);
		
	}
	
	@RequestMapping("/mostraConta")
	public String mostra(Long id, Model model) {
	  ProdutoDAO dao = new ProdutoDAO();
	  model.addAttribute("conta", dao.buscaPorId(id));
	  return "conta/mostra";
	}
	
	@RequestMapping("/alteraConta")
	public String altera(Produto conta) {
	  ProdutoDAO dao = new ProdutoDAO();
	  dao.altera(conta);
	  return "redirect:listaContas";
	}
		
	@RequestMapping ("/listaContas")
	public ModelAndView lista(){
		
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> contas = (List<Produto>) dao.lista();
		
		ModelAndView mv = new ModelAndView("conta/lista");
		mv.addObject("contas", contas);			
		
		return mv;
	
	}
}	
