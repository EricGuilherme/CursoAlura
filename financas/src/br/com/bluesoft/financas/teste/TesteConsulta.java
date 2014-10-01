package br.com.bluesoft.financas.teste;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.bluesoft.financas.modelo.Conta;
import br.com.bluesoft.financas.util.JPAUtil;

public class TesteConsulta {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();
		
		Conta conta = new Conta();
		
		conta.setId(3);
		
//			Query query = manager.createQuery("select max(m.valor) from Movimentacao m where m.conta = :pConta");
//			query.setParameter("pConta", conta);        
//			BigDecimal maiorGasto =  (BigDecimal) query.getSingleResult();
//			System.out.println("A conta possui " + maiorGasto + " movimentações.");
			
			TypedQuery<Long> query = manager.createQuery("select count(m) from Movimentacao m where m.conta = :pConta", Long.class);
			query.setParameter("pConta", conta);
			Long quantidade=  query.getSingleResult();			
			System.out.println("A conta possui " + quantidade + " movimentações.");
			
		}
	}

