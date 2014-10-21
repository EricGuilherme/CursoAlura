package br.com.bluesoft.designpatterns;

public interface EstadoDeUmaConta {

	void saque(Conta conta, double valor);
	void deposito(Conta conta, double valor);
}
