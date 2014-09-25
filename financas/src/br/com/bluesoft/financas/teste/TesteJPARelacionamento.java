
package br.com.bluesoft.financas.teste;
import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.bluesoft.financas.modelo.Conta;
import br.com.bluesoft.financas.modelo.Movimentacao;
import br.com.bluesoft.financas.modelo.TipoMovimentacao;
import br.com.bluesoft.financas.util.JPAUtil;

public class TesteJPARelacionamento {
	public static void main(String[] args) {
		
		Conta conta = new Conta();

//		conta.setTitular("Stefani");
//		conta.setBanco("HSBC");
//		conta.setAgencia("8547");
//		conta.setNumero("445644");
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setData(Calendar.getInstance());
		movimentacao.setDescricao("Conta de Luz");
		movimentacao.setTipoMovimentacao(TipoMovimentacao.SAIDA);
		movimentacao.setValor(new BigDecimal("254.7"));		
		movimentacao.setConta(conta);

		EntityManager manager = new JPAUtil().getEntityManager();
		
		manager.getTransaction().begin();
				
		conta.setId(1);

		manager.persist(movimentacao);
		
		manager.getTransaction().commit();
		
		manager.close();
				
	}
}
