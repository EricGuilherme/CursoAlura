package br.com.primeirospassos.eric;


public class TestaMetodos {

	public static void main(String[] args) {
		
		Conta conta = new Conta();

		conta.nome = "Guilherme";

		conta.adicionaValor(88);
		conta.depositaValor(40);
		conta.sacarValor(90);

	}
}
