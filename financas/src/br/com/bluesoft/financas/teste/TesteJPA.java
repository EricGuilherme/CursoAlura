package br.com.bluesoft.financas.teste;

import javax.persistence.EntityManager;

import br.com.bluesoft.financas.modelo.Conta;
import br.com.bluesoft.financas.util.JPAUtil;

public class TesteJPA {

	public static void main(String[] args) {
	
//		Conta conta = new Conta();
//		conta.setTitular("Stefani");
//		conta.setBanco("HSBC");
//		conta.setAgencia("8547");
//		conta.setNumero("445644");

		EntityManager manager = new JPAUtil().getEntityManager();
		
		manager.getTransaction().begin();
		
		Conta conta = manager.find(Conta.class, 4);
		
		System.out.println(conta.getTitular());
		
		conta.setTitular("Karen Nicole");
		
		manager.getTransaction().commit();
		
		manager.close();
		
	}

}
