package br.com.alura.orientacaoobjetos.eric;

public class Data {

	int dia, mes, ano;
	
	public static final int adf = 34;
	
	void preecheData(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;		
	}
	
	String getFormata(){
	  return  this.dia+"/"+this.mes+"/"+this.ano;		
	}

	 boolean isDataViavel(int dia, int mes, int ano) {
	    if (dia <= 0 || mes <= 0) {
	        return false;
	    }
	
    if(!isDataViavel(dia, mes, ano)) {
        System.out.println("A data " + getFormata() + " n‹o existe!");
    }
	
	    int ultimoDiaDoMes = 31; 
	    if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
	        ultimoDiaDoMes = 30;
	    } else if (mes == 2) {
	        if (ano % 4 == 0) {
	            ultimoDiaDoMes = 29;
	        } else {
	            ultimoDiaDoMes = 28;
	        }
	    }
	    if (dia > ultimoDiaDoMes) {
	        return false;
	    }
	
	    return true;
	}
}
