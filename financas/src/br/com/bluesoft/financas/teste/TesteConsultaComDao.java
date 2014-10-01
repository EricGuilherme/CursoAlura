package br.com.bluesoft.financas.teste;

import javax.persistence.EntityManager;

import br.com.bluesoft.financas.modelo.Conta;
import br.com.bluesoft.financas.util.JPAUtil;
import br.com.br.bluesoft.financas.dao.MovimentacaoDao;

public class TesteConsultaComDao {
	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		
		Conta conta = new Conta();
		
		conta.setId(2);
		
		MovimentacaoDao dao = new MovimentacaoDao(manager);
        Double media = dao.mediaDaConta(conta); 
        
        System.out.println(media);
			
	}
}
