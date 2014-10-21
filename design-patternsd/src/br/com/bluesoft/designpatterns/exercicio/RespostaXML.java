package br.com.bluesoft.designpatterns.exercicio;


public class RespostaXML implements Resposta{
	
	private Resposta proximo;

	public Formato resposta(Requisicao requisicao){
		
		if(requisicao.getFormato() == Formato.XML) return Formato.XML;
		
		return proximo.resposta(requisicao);
	}

	@Override
	public void setProximo(Resposta proximo) {
		this.proximo = proximo;
		
	}
}
