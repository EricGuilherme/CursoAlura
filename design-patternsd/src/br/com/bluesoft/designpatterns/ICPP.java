package br.com.bluesoft.designpatterns;

public class ICPP extends TemplateDeImpostoCondicional{

	protected Imposto outroImposto;
	
	public ICPP(Imposto outroImposto){
		super();
	}
	
	public ICPP(){
	}
	
	
	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public boolean deveUsarTaxacaoMaxima(Orcamento orcamento) {
		
		return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
	}

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		
		return orcamento.getValor() > 100; 
			
	}

}
