package br.com.bluesoft.designpatterns.exercicio;

import br.com.bluesoft.designpatterns.exercicio.Conta;

public class Requisicao {
		
	private Formato formato;
	private Conta conta;	

	public Requisicao(Formato formato){
		this.formato = formato;
	}
	
	public void adicionaConta(Conta conta){
		this.conta = conta;
	}
	
	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

}
