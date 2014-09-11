package br.com.primeirospassos.eric;

public class BalancoTrimestral {

	public static void main(String[] args) {

		int gastosJaneiro = 15000; 
		int gastoFeveiro = 23000;
		int gastoMarco = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastoFeveiro + gastoMarco;
		double mediaMensal = gastosTrimestre/3;
		
		System.out.println("Valor da media mensal = " + mediaMensal);
		
	}	

}
