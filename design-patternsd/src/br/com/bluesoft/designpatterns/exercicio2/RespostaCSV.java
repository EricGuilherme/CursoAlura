package br.com.bluesoft.designpatterns.exercicio2;

public class RespostaCSV implements Resposta{
	
	private Resposta resposta;
	
	@Override
	public void responde(Requisicao requisicao) {
		  
       if(requisicao.getFormato() == Formato.CSV) {
           System.out.println("csv");
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


