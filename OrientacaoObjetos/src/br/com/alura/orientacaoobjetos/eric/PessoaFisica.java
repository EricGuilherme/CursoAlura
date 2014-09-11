package br.com.alura.orientacaoobjetos.eric;

public class PessoaFisica {	
	private String cpf;
	
	public boolean validaCpf(String cpf){
		if(cpf.length() == 12){
			return true;
		}
		return false;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
