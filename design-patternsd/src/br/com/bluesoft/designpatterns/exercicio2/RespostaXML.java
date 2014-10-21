package br.com.bluesoft.designpatterns.exercicio2;

public class RespostaXML implements Resposta{
	
	private Resposta resposta;
	
	@Override
	public void responde(Requisicao requisicao) {
		  
       if(requisicao.getFormato() == Formato.XML) {
           System.out.println("xml");
         }
         else {
        	resposta.responde(requisicao);
         }
       }

	@Override
	public void setProximo(Resposta resposta) {
		this.resposta = resposta;
		
	}
}


