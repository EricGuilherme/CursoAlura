package br.com.br.bluesoft.financas.dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.bluesoft.financas.modelo.Conta;

public class MovimentacaoDao {
	
	private EntityManager manager;
	
	public MovimentacaoDao (EntityManager manager){
		this.manager = manager;
	}
	
	public Double mediaDaConta (Conta conta){
		
		TypedQuery<Double> query = manager.createQuery("select avg(m.valor) from Movimentacao m where m.conta=:pConta" 
				+ " and m.tipoMovimentacao = 'SAIDA'", Double.class);
		
		query.setParameter("pConta", conta);
		return query.getSingleResult();

				
	}

	
}
