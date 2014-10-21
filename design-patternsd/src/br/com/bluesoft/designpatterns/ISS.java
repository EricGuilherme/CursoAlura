package br.com.bluesoft.designpatterns;

public class ISS extends Imposto{

	protected Imposto outroImposto;
	
	public ISS(Imposto outroImposto){
		super();
	}

	public ISS(){
		
	}
	
	@Override
	public double calcula(Orcamento orcamento) {	
		return orcamento.getValor() * 0.06;
	}
	
	
	
} 		
