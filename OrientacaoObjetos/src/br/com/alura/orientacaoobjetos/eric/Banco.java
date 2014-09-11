package br.com.alura.orientacaoobjetos.eric;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	
	private List<Conta> contas = new ArrayList<Conta>();  	
	private Map<String, Conta> idenxadoPorNome = new HashMap<String, Conta>();	
	
	void adiciona(Conta conta){
		contas.add(conta);
		idenxadoPorNome.put(conta.getNome(), conta);
	}
	
	public Conta buscaPorNome (String nome){
		return idenxadoPorNome.get(nome);
	}
	
	
	public Conta resgataConta(int posicao){
		return contas.get(posicao);
	}
	
	public int getQuantidadeConntas(int quantidade){
		return contas.size(); 
	}
	
	
	
}
