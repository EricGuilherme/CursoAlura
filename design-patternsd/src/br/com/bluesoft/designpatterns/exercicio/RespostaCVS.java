package br.com.bluesoft.designpatterns.exercicio;


public class RespostaCVS implements Resposta{

	private Resposta proximo;

	
//	@Override
//	public void resposta(Requisicao requisicao) {
//		
//		if(requisicao.getFormato() == Formato.CVS){
//			System.out.println("Formato cvs");	
//		}
//		
//		proximo.resposta(requisicao);
//	}

	
	@Override
	public Formato resposta(Requisicao requisicao) {
		
		if(requisicao.getFormato() == Formato.CVS) return Formato.CVS;
			
		return proximo.resposta(requisicao);
	}

	@Override
	public void setProximo(Resposta proximo) {
		this.proximo = proximo;
		
	}

}
