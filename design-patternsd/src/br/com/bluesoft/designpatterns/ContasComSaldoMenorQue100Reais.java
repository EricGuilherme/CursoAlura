package br.com.bluesoft.designpatterns;

import java.util.List;

public class ContasComSaldoMenorQue100Reais extends Filtro{

	@Override
	public List<Conta> filtro(List<Conta> contas) {

		for (Conta conta : contas) {
			if(conta.getSaldo() < 100){
				return contas; 
			}
		}
		return null;
	}	
}
