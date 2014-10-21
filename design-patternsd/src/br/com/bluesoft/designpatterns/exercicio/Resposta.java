package br.com.bluesoft.designpatterns.exercicio;

public interface Resposta {

	Formato resposta(Requisicao requisicao);
	void setProximo(Resposta proximo); 
	
}
