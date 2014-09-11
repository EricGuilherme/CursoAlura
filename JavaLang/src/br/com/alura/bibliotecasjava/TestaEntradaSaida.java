package br.com.alura.bibliotecasjava;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaEntradaSaida {

    public static void main(String[] args) throws IOException {
    	
//    	BufferedReader br = new BufferedReader(
//    				new InputStreamReader(
//    						new FileInputStream("leitura.txt")));
//    	

        Scanner entrada = new Scanner(System.in);
        PrintStream saida = new PrintStream(new FileOutputStream("leitura.txt"));
        
        while(entrada.hasNextLine()){
        	saida.println(entrada.nextLine());
        }
        
        saida.close();
        entrada.close();
        
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
   
//        String linha = br.readLine();
//        while (linha != null) {
//        	 System.out.println(linha);
//            linha = br.readLine();
//           
//        }
//        
//        
//        while(entrada.hasNextLine()){
//        	System.out.println(entrada.nextLine());
//        }
//        entrada.close();

    }
}
