package br.com.primeirospassos.eric;

public class Conta {
	
	int numero;
	String nome;
	double valor;
	
	void adicionaValor (double dinheiro){
		this.valor = dinheiro;
		System.out.println("O valor da conta Ž: " + this.valor);
	}
	
	void depositaValor (double quantidade){
		this.valor += quantidade;
		
		System.out.println("Foi feito o deposito de : " + quantidade + " Seu saldo atual Ž: " + this.valor);
	}
	
	void sacarValor(double quantidade){
		
		if(this.valor < quantidade){
			System.out.println("Valor maior que saldo disponivel. Saldo disponivel para saque: " + this.valor);
		}
		else{
			this.valor -= quantidade;	
			System.out.println("Voce sacou : " + quantidade +  " Seu novo saldo Ž: " + this.valor);
		}
	}
	
}		

