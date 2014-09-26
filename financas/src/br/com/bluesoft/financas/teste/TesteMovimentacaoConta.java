package br.com.bluesoft.financas.teste;

import javax.persistence.EntityManager;

import br.com.bluesoft.financas.modelo.Conta;
import br.com.bluesoft.financas.modelo.Movimentacao;
import br.com.bluesoft.financas.util.JPAUtil;

public class TesteMovimentacaoConta {

	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		Movimentacao movimentacao = manager.find(Movimentacao.class, 2);
		
		Conta conta = manager.find(Conta.class, 2);
		
		manager.close();
		
		System.out.println(conta.getMovimentacao().size());
		
	}

}
