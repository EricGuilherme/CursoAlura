package br.com.bluesoft.designpatterns;

public class TesteDeImpostosComplexos {
	public static void main(String[] args) {
		
		Imposto iss = new ISS(new ICMS());
		Imposto composto = new ImpostoMuitoAlto(new IHIT());
				
		Orcamento orcamento = new Orcamento(500);
		
		double valor = iss.calcula(orcamento);
		double outraCombinacao = composto.calcula(orcamento);
				
		System.out.println("Imposto ISS com ICMS : " + valor + " Imposto mais alto com IHIT: " + outraCombinacao);
	}
}
