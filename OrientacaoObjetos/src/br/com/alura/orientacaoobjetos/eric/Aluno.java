package br.com.alura.orientacaoobjetos.eric;

public class Aluno {
	double [] nota = new double[5];
	
	void adicionaNotaAluno(double n){
		for(int i = 0; i <= this.nota.length; i++){
			this.nota[i] = n;
		}
	}
	
	void mostraNotaAluno(){
		for(int i = 0; i < this.nota.length; i++){
			System.out.println(this.nota[i]);
		}
	}
}
