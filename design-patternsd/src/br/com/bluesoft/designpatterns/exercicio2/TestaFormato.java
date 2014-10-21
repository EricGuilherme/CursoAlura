package br.com.bluesoft.designpatterns.exercicio2;

public class TestaFormato {
		public static void main(String[] args) {
			
			VerificaFormato verifica = new VerificaFormato();
	
			Requisicao requisicao = new Requisicao(Formato.XML);
			
			verifica.verifica(requisicao);
			
		}
}
