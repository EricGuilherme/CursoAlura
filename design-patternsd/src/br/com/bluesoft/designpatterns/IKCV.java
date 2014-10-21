package br.com.bluesoft.designpatterns;

public class IKCV extends TemplateDeImpostoCondicional {

	protected Imposto outroImposto; 
	
	public IKCV (Imposto outroImposto){
		super();
	}
	
	public IKCV(){
	}
	
	@Override
	public double minimaTaxacao(Orcamento orcamento) {
	
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public boolean deveUsarTaxacaoMaxima(Orcamento orcamento) {
		
		for (Item item : orcamento.getItens()) {
			if(item.getValor() > 100) return true;		
		}

		return false;
	}

}
