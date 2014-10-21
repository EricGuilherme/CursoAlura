package br.com.bluesoft.designpatterns;

import java.util.List;

public class ContasComSaldoMaiorQuer500Reais extends Filtro {

	@Override
	public List<Conta> filtro(List<Conta> contas) {
		
		for (Conta conta : contas) {
			if(conta.getSaldo() > 500){
				return contas;
			}
		}
		return null;
	}
}
