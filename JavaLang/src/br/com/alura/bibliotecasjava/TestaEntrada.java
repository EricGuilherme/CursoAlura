package br.com.alura.bibliotecasjava;

import java.io.BufferedReader;
import java.io.FileInputStream;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaEntrada {

	private static PrintStream ps;

	public static void main(String[] args) throws IOException {
		//InputStream is = System.in;
		InputStream is = new FileInputStream("arquivo.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
	
		while (s != null) {
			System.out.println(s);																	
			s = br.readLine();
		}
		
		br.close();
		
		Scanner s1 = new Scanner(System.in);
		ps = new PrintStream("arquivo.txt");
		while(s1.hasNextLine()){
			ps.println(s1.nextLine());
		}	
	}
}