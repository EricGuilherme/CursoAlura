package br.com.bluesoft.designpatterns;

public class Positivo implements EstadoDeUmaConta {

	@Override
	public void saque(Conta conta, double valor) {
		conta.saldo -= valor;
	}

	@Override
	public void deposito(Conta conta, double valor) {
		conta.saldo += valor * 0.98;
	}

}
