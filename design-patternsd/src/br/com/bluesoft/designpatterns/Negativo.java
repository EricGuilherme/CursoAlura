package br.com.bluesoft.designpatterns;

public class Negativo implements EstadoDeUmaConta{

	@Override
	public void saque(Conta conta, double valor) {
		throw new RuntimeException("Sua conta esta negativa ! N‹o Ž possivel efetuar saques");
	}

	@Override
	public void deposito(Conta conta, double valor) {
		conta.saldo += valor * 0.95;
		
	}

}
