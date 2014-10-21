package br.com.bluesoft.designpatterns.exercicio2;


public class VerificaFormato {

	public void verifica(Requisicao requisicao){
		
		Resposta r1 = new RespostaXML();
		Resposta r2 = new RespostaCSV();
		Resposta r3 = new RespostaPORCENTO();
	 
		r1.setProximo(r2);
		r2.setProximo(r3);
		
		r1.responde(requisicao);
		
	}
}
