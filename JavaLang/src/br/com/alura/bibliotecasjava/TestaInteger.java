package br.com.alura.bibliotecasjava;

import java.io.PrintStream;

public class TestaInteger {

	public static void main(String[] args) {
		
		Integer x1 = new Integer(10);
	    Integer x2 = new Integer(10);
	    
	    if (x1 == x2) {
	        System.out.println("igual");
	    }
	    else {
	        System.out.println("diferente");
	    }
	    
	    System.out.println(x1.equals(x2));
	    
	    PrintStream saida = System.out;
	    
	    saida.println("ola");
	    
	}	
}	    