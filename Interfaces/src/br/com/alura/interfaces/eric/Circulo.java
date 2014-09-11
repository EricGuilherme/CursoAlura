package br.com.alura.interfaces.eric;

public class Circulo {

	private double raio;
	
	public Circulo(double raio){
		this.raio = raio;
	}
	
	public double calculaArera(){
		return Math.PI * raio * raio;
	}
}
