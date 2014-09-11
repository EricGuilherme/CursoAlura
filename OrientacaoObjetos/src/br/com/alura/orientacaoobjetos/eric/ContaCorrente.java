package br.com.alura.orientacaoobjetos.eric;

public class ContaCorrente extends Conta implements Comparable<ContaCorrente>{
	
	public ContaCorrente(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
		
	}

	void adicionaTaxaPercentual(double percentual){
		saldo *= percentual * 2;
	}
	
	void depositaValor (double quantidade){
	
		try{
			if(quantidade > 0){
				this.saldo += quantidade;
				System.out.println("Foi feito o deposito de : " + quantidade + " Seu saldo atual Ž: " + this.saldo);
			}
		}
		catch(IllegalArgumentException e){
			System.out.println( "Valor Invalido");
		}
	}
	
	@Override
	public int compareTo(ContaCorrente contaCorrente) {
		return this.nome.compareTo(contaCorrente.nome);
	}
	
	
//	@Override
//	public int compareTo(ContaCorrente contaCorrente) {
//		
//		if(this.numero < contaCorrente.numero) return -1;
//		if (this.numero > contaCorrente.numero) return 1;	
//		
//		return 0;
//	}
	
} 
	