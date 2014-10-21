package br.com.bluesoft.designpatterns.exercicio;


public class RespostaPorcento implements Resposta {

	private Resposta proximo;

	@Override
	public Formato resposta(Requisicao requisicao) {
		
		if(requisicao.getFormato() == Formato.PORCENTO) return Formato.PORCENTO;
		
		return proximo.resposta(requisicao);
	}

	@Override
	public void setProximo(Resposta proximo) {
		this.proximo = proximo;
		
	}

}
