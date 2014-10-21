package br.com.bluesoft.designpatterns.exercicio;


public class VerificaFormato {

	public Formato verifica(Requisicao requisicao){
		
		Resposta r1 = new RespostaXML();
		Resposta r2 = new RespostaCVS();
		Resposta r3 = new RespostaPorcento();
	 
		r1.setProximo(r2);
		r2.setProximo(r3);
		
		return r1.resposta(requisicao);
	}
}
