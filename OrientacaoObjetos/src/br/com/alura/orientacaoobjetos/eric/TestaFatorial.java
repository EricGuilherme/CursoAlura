package br.com.alura.orientacaoobjetos.eric;

public class TestaFatorial {

	public static void main (String[] args) {
        long fatorial = 1;
        for (int n = 1; n <= 40; n++) {
            fatorial = fatorial * n;
            System.out.println("fat(" + n + ") = " + fatorial);
        }
    } 
}

