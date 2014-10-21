package br.com.bluesoft.designpatterns.exercicio;

import br.com.bluesoft.designpatterns.exercicio.Conta;

public class TestaFormato {
		public static void main(String[] args) {
			
			VerificaFormato verifica = new VerificaFormato();
	
			Conta conta = new Conta ("Joao", 200.0);
			Requisicao requisicao = new Requisicao(Formato.PORCENTO);
			requisicao.adicionaConta(conta);
						 
			System.out.println("O fomato escolhido pela conta do: " + conta.getTitular() + " no valor de " + conta.getSaldo() + " Ž: " + verifica.verifica(requisicao));
			
		}

}
