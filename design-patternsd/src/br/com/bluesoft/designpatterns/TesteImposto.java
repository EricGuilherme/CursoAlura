package br.com.bluesoft.designpatterns;

public class TesteImposto {
	
	public static void main(String[] args) {
		
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		Imposto iccc = new ICCC();
		
		Orcamento orcamento = new Orcamento(500);
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		
		calculador.calcula(orcamento, iss);
		calculador.calcula(orcamento, icms);
		calculador.calcula(orcamento, iccc);
	}
}
