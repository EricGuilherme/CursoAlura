package br.com.bluesoft.designpatterns;

import java.sql.Date;
import java.util.List;

public class RelatorioComplexo extends Relatorio{

	@Override
	protected void cabecario() {
		System.out.println("Banco: Itau /n Endereço: Rua Ilhaus /n Tel: 5456-8554" );
	}

	@Override
	protected void rodape() {
		Date dataAtual = new Date(0);
		System.out.println("Email: itaufalso@itau.com.br /n Data: " + dataAtual);
	}

	@Override
	protected void corpo(List<Conta> contas) {
		
		for (Conta conta : contas) {
			System.out.println("Saldo:" + conta.getSaldo());
		}

	}


}
