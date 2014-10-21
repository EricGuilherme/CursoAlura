package br.com.bluesoft.designpatterns;

public abstract class Imposto {
	
	protected Imposto outroImposto;
	
	public Imposto(Imposto outroImposto){
		this.outroImposto = outroImposto;
	}
	
	public Imposto(){
		
	}
	
	abstract double calcula (Orcamento orcamento);
}
