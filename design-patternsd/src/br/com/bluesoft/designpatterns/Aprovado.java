package br.com.bluesoft.designpatterns;

public class Aprovado implements EstadoDeUmOrcamento{
	private boolean descontoJaAplicado = false;
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		
		if(!descontoJaAplicado){
			orcamento.valor -= orcamento.valor * 0.02;
			descontoJaAplicado = true;
		}
		else{
			System.out.println("Desconto j‡ aplicado uma vez");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento j‡ foi aprovado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcmento n‹o pode ser reprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado(); 
	}

	
}
