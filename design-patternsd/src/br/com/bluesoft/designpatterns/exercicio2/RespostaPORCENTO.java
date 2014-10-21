package br.com.bluesoft.designpatterns.exercicio2;

public class RespostaPORCENTO implements Resposta{
	
	private Resposta resposta;
	
	@Override
	public void responde(Requisicao requisicao) {
		  
       if(requisicao.getFormato() == Formato.PORCENTO) {
           System.out.println("%");
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


