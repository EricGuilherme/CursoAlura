package br.com.caelum.contas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaMundoController {
	
	@RequestMapping("/olaMundoSpring")
	public String executa(){
			
		System.out.println("Executando a l�gica com Spriung");
		
		return "ok";

	}
}
