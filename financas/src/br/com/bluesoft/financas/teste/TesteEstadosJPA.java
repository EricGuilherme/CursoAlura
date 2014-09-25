package br.com.bluesoft.financas.teste;

import javax.persistence.EntityManager;

import br.com.bluesoft.financas.modelo.Conta;
import br.com.bluesoft.financas.util.JPAUtil;

public class TesteEstadosJPA {

	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		
		manager.getTransaction().begin();
		
		Conta conta = manager.find(Conta.class, 1);  

		conta.setTitular("Deric Guilherme");
		
		System.out.println(conta.getTitular());
		
		manager.getTransaction().commit();
		
		manager.merge(conta);
		manager.getTransaction().commit();
		
		manager.close();
	}
}
