package br.com.alura.orientacaoobjetos.eric;

public class TestaEmpresa {

	public static void main(String[] args) {
		
	
		Empresa empresa = new Empresa();
		empresa.setFunc(new Funcionario[10]);

		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();

		f1.nome = "Guilherme"; 
		f1.departamento = "T.I";
		f1.setSalario(50000);
		
		f2.nome = "Guilherme"; 
		f2.departamento = "T.I";
		f2.setSalario(50000);	
		
		empresa.adicionaFuncionario(f1);
		empresa.adicionaFuncionario(f2);

		empresa.getFunc()[0].mostra();
		empresa.getFunc()[1].mostra();
		empresa.mostraFuncionario();
	}
}
