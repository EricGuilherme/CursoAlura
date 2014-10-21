package br.com.bluesoft.designpatterns;

import java.util.List;

public class RelatorioSimples extends Relatorio{

	@Override
	protected void cabecario() {
		System.out.println("Banco: Itau");
	}

	@Override
	protected void rodape() {
		System.out.println("Tel: 5698-6523");		
	}


	@Override
	protected void corpo(List<Conta> contas) {
		
		for (Conta conta : contas) {
			System.out.println("Saldo:" + conta.getSaldo());
		}
		
	} 

}
