package br.com.alura.orientacaoobjetos.eric;

public class TestaFuncionario {

	public static void main(String[] args) {
			
		Funcionario func1 = new Funcionario ();		
		Funcionario func2 = new Funcionario();
		
		func1.nome = "Guilherme"; 
		func1.departamento = "T.I";
		func1.setSalario(50000);
		func1.dataEntradaBanco = new Data();
		func1.setRg("4522245580");
				
		func2.nome = "Guilherme"; 
		func2.departamento = "T.I";
		func2.setSalario(50000);
		func2.dataEntradaBanco = new Data();
		func2.setRg("4522245580");
		
		
		func1.dataEntradaBanco.preecheData(1, 9, 2014);
		func1.mostra();
		func2.mostra();
			
		if(func1 == func2){
			System.out.println("iguais");
		}
		else{
			System.out.println("diferentes");
		}			
	}
}