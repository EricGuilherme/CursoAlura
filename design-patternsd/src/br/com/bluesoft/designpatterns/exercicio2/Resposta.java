package br.com.bluesoft.designpatterns.exercicio2;

public interface Resposta {
	void responde (Requisicao requisicao);
	void setProximo(Resposta resposta);	
}
