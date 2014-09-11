package br.com.alura.orientacaoobjetos.eric;


public class ContaPoupanca extends Conta {
	
	
	void adicionaTaxaPercentual(double percentual){
		saldo *= percentual * 3;
	}
	/*
	 * (non-Javadoc)
	 * @see br.com.alura.orientacaoobjetos.eric.Conta#depositaValor(double)
	 */


	void depositaValor(double quantidade) {
		if(quantidade > 0){
			this.saldo += quantidade;
			System.out.println("Foi feito o deposito de : " + quantidade + " Seu saldo atual Ž: " + this.saldo);
		}
		else{
			try {
				throw new ValorInvalidoException(quantidade);
			} catch (ValorInvalidoException e) {

			}
		}	
	}

}
