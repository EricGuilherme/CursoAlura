package br.com.alura.orientacaoobjetos.eric;

public class Funcionario {
	public String nome;
	public String departamento;
	private double salario;
	Data dataEntradaBanco;
	private String rg;
	private static int proximoFuncionario = 0;
	private int id;
	
	public Funcionario(){
	
	}
	
	public Funcionario (String nome){
		this.nome = nome;
		this.id = proximoFuncionario++;
	}
	
	public int getId(){
		return this.id;
	}
		
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Data getDataEntradaBanco() {
		return dataEntradaBanco;
	}

	public void setDataEntradaBanco(Data dataEntradaBanco) {
		this.dataEntradaBanco = dataEntradaBanco;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	void recebeAumento(double quantidade){
		this.salario += quantidade;
	}

	double calculaGanhoAnual(){
		double valoAnual = this.salario * 12; 
		return valoAnual;
	}
	
	void mostra(){
		System.out.println("Nome: " + this.nome + " \nDepartamento:" + this.departamento+ " \nSalario: " + this.salario+ " \n Data de Entrada: " + this.dataEntradaBanco.getFormata() +"\nRG: " + this.rg);
	}
	
}
