package br.com.bluesoft.designpatterns;


public class EmAprovacao implements EstadoDeUmOrcamento{
	
	private boolean descontoAplicado = false;
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!descontoAplicado){
			orcamento.valor -= orcamento.valor * 0.05;
			descontoAplicado = true;
		}
		else{
			System.out.println("Desconto j‡ aplicado uma vez");
		}
		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new	Reprovado();
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamento n‹o pode ser finalizado no momento.");
		
	}
}
