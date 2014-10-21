package br.com.bluesoft.designpatterns;

public class ICMS extends Imposto{

	protected Imposto outroImposto;
	
	public ICMS (Imposto outroImposto){
		super(outroImposto);
	}
	
	public ICMS(){

	}
	
	public double calcula(Orcamento orcamento){
		return orcamento.getValor() * 0.5 + 50;
	}
}
