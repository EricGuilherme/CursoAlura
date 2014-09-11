package br.com.alura.orientacaoobjetos.eric;

public class Empresa {
	
	public String nome, cnpj;
	private Funcionario[] func; 
	public int arrayLivre = 0;
	
	void adicionaFuncionario(Funcionario funcionario){
		this.func[this.arrayLivre] = funcionario;
		this.arrayLivre++;
		
		System.out.println(this.func[this.arrayLivre]);
	}
	
	public Funcionario[] getFunc() {
		return func;
	}

	public void setFunc(Funcionario[] func) {
		this.func = func;
	}

	void mostraFuncionario(){
		for(int i = 0; i < func.length; i++){
			System.out.println(func[i].nome);
			System.out.println(func[i].departamento);
			System.out.println(func[i].getSalario());
			System.out.println(func[i].getDataEntradaBanco());
			System.out.println(func[i].getRg());
		}	
	}
	
	boolean contemFuncionario(Funcionario funcionario){
		for(int i = 0; i < func.length; i++){
			if(funcionario == this.func[i]){
				return true;
			}
		}
		return false;						
	}
}

