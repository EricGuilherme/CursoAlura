package br.com.alura.orientacaoobjetos.eric;

public class TestaAluno {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.mostraNotaAluno();
		aluno.adicionaNotaAluno(10.0);
		aluno.mostraNotaAluno();
		aluno.adicionaNotaAluno(5.0);
		aluno.mostraNotaAluno();
	}
}
