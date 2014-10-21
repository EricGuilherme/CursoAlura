package br.com.bluesoft.designpatterns;

public class ImpostoMuitoAlto extends Imposto{

	protected Imposto outroImposto;
	
	public ImpostoMuitoAlto(Imposto outroImposto){
		super();
	}
	
	public ImpostoMuitoAlto(){
		
	}
	
	@Override
	double calcula(Orcamento orcamento) {
		
		return orcamento.getValor() * 0.20;
	}

}
