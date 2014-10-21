package br.com.bluesoft.designpatterns;

class Conta {
	
    protected double saldo;
    private EstadoDeUmaConta estadoConta;
    
    
	public Conta(double saldo){
    	this.saldo = saldo; 	
    }

    public double getSaldo() {
      return this.saldo;
    }
    
    public void saca(double valor){
    	estadoConta.saque(this, valor);
    }
    
    public void deposita(double valor){
    	estadoConta.deposito(this, valor);
    }
}

