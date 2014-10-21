package br.com.bluesoft.designpatterns;


public class TesteDaNotaFiscal {
	public static void main(String[] args) {
		
		NotaFiscalBuilder builder= new NotaFiscalBuilder();
		builder.paraEmpresa ("Bluesoft")
		.comCnpj	("32.3256.456/0001")
		.comItem(new ItemDaNota("item 1", 200.0))
		.comItem(new ItemDaNota("item 2", 300.0))
		.comItem(new ItemDaNota("item 3", 400.0))
		.comObservacoes("observacao")
		.naDataAtual(null);
		
		NotaFiscal nf = builder.constroi();
		
		System.out.println(nf.getValorBruto());
	}
}
