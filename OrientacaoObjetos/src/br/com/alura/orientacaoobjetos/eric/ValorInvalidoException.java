package br.com.alura.orientacaoobjetos.eric;

@SuppressWarnings("serial")
public class ValorInvalidoException extends Exception{
	
	public ValorInvalidoException(double quantidade){
		super("Valor invalido" + quantidade);
	}

}
