package br.com.bluesoft.designpatterns;

public class TesteDescontos {

	public static void main(String[] args) {
		
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();
	
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adiciona(new Item("LIVRO", 250.0));
		orcamento.adiciona(new Item("COMPUTADOR", 250.0));
		
		double descontoFinal = descontos.calcula(orcamento);
		
		System.out.println(descontoFinal);
	}
}
