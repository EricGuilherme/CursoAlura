package br.com.bluesoft.treinamento.dao;

import java.util.List;

import br.com.bluesoft.treinamento.modelo.Tarefa;

public interface TarefaDao {

	Tarefa buscaPorId(Long id);
	List<Tarefa> lista();
	void adiciona(Tarefa t);
	void altera(Tarefa t);
	void remove(Tarefa t);
	void finaliza(Long id);
}
