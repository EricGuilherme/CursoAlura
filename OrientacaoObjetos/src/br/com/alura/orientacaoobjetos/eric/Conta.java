package br.com.alura.orientacaoobjetos.eric;

abstract public class Conta  {
	private static final Object ContaCorrente = null;
	protected double saldo;
	protected int numero;
	protected String nome; 
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	abstract void depositaValor (double quantidade);
	
	void sacarValor(double quantidade){
		
		if(this.saldo < quantidade){
				System.out.println("Valor maior que saldo disponivel. Saldo disponivel para saque: " + this.saldo);	
		}
		else{
			this.saldo -= quantidade;	
			System.out.println("Voce sacou : " + quantidade +  " Seu novo saldo Ž: " + this.saldo);
		}
	}
	 
	void mostraCaractere(String s){
		String [] palavras = s.split(" ");
   	   	for(int i = palavras.length - 1; i >= 0; i--){
   	   			System.out.println(palavras[i] + " ");
   	   		}   	   		
   	   			System.out.println(" ");
   	   			
	   	}	
	
	void mostraComStringBuilder(String texto){
		StringBuilder inverte = new StringBuilder(texto).reverse();
		System.out.println(inverte);
	}
	
//	private int converteParaInt(String numero) {
//        int resultado = 0;
//        while (numero.length() > 0) {
//            char algarismo = numero.charAt(0);
//            resultado = resultado * 10 + (algarismo - '0');
//            numero = numero.substring(1);
//        }
//        return resultado;
//    }
    
    
	@Override
	public String toString() {
	
		return "Posicao: " + hashCode() + "Esse objeto Ž do tipo conta de numero " + getNumero() + " com saldo " + getSaldo() + " Do cliente " + getNome() + ". Iguais = " + equals(ContaCorrente);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numero;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Conta other = (Conta) obj;
        if (numero != other.numero)
            return false;
        return true;
    }
	

	
}
