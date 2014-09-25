package br.com.bluesoft.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.bluesoft.financas.modelo.Conta;
import br.com.bluesoft.financas.modelo.Movimentacao;
import br.com.bluesoft.financas.modelo.TipoMovimentacao;
import br.com.bluesoft.financas.util.JPAUtil;

public class TesteConsulta {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();
		
		Conta conta = new Conta();
		
		conta.setId(2);

		
		
		Query query = manager.createQuery("select m from Movimentacao m where m.conta=:pConta" 
											+ " and m.tipoMovimentacao = :pTipo "
											+ " order by m.valor desc ");
		query.setParameter("pConta", conta);
		query.setParameter("pTipo", TipoMovimentacao.SAIDA);

		List<Movimentacao> movimentacoes = query.getResultList();
		
		for (Movimentacao m : movimentacoes) {
			
			System.out.println("Descricao: " + m.getDescricao());
			System.out.println("Valor: " + m.getValor());			
		}
		
		
		
		
	}

}
