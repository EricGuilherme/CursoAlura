package br.com.bluesoft.designpatterns;

public class IHIT extends TemplateDeImpostoCondicional{

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
	
		return (orcamento.getValor() * 0.01) * orcamento.getItens().size();
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		
		return (orcamento.getValor() * 13) + 100;
	}

	@Override
	public boolean deveUsarTaxacaoMaxima(Orcamento orcamento) {
		
		for (Item itens : orcamento.getItens()) {
			if(itens.equals(itens)){
				return	true;
			}
		}
		return false;	
	}

	
	
	

}
