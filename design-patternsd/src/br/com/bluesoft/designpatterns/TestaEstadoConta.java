package br.com.bluesoft.designpatterns;

public class TestaEstadoConta {
	public static void main(String[] args) {
		
		Conta conta = new Conta(500.0);
		
 		conta.saca(200);
		
		System.out.println(conta.getSaldo());
		
		conta.deposita(300);
		
		System.out.println(conta.getSaldo());
		
		conta.saca(600);
		
		System.out.println(conta.getSaldo());
		
		
	}
}
