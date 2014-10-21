package br.com.bluesoft.designpatterns;

import java.util.List;

public abstract class Relatorio {

	 protected abstract void cabecario();
	 protected abstract void rodape();
	 protected abstract void corpo(List<Conta> contas);
	protected void corpo() {
		// TODO Auto-generated method stub
		
	}
	
	 
}
