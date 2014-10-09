package br.com.bluesoft.treinamento.dao;

import javax.persistence.EntityManager;

public class AlunoDao {
	
	EntityManager manager;
	
	public AlunoDao(EntityManager manager){
		this.manager = manager;
	}
}
