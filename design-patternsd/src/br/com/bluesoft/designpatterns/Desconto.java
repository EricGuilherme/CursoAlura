package br.com.bluesoft.designpatterns;

public interface Desconto {
	
	double desconto(Orcamento orcamento);
	void setProximo(Desconto proximo);
}
