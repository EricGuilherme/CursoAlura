package br.com.bluesoft.designpatterns;

public abstract class TemplateDeImpostoCondicional extends Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
	
	if(deveUsarTaxacaoMaxima(orcamento)){
			return maximaTaxacao(orcamento);
		}
			return minimaTaxacao(orcamento);
	}	
	
		
	public abstract double minimaTaxacao(Orcamento orcamento);
	public abstract double maximaTaxacao(Orcamento orcamento);
	public abstract boolean deveUsarTaxacaoMaxima(Orcamento orcamento);	
	
}
