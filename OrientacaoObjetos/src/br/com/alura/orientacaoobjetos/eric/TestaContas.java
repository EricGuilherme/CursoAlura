package br.com.alura.orientacaoobjetos.eric;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class TestaContas {

	public static void main(String[] args) {

//		ContaCorrente cc = new ContaCorrente();
//		ContaPoupanca cp = new ContaPoupanca();
//		
	
//		cc.adicionaTaxaPercentual(0.10);
//		cp.adicionaTaxaPercentual(55);
		
//		System.out.println(cc.getSaldo());
//		
//		cc.depositaValor(-1);
//		cp.depositaValor(-100);
//		
//		System.out.println(cc.getSaldo());
//		System.out.println(conta1);
//
//	    ContaCorrente conta1 = new ContaCorrente(5, "Paulo José");
//		ContaCorrente conta2 = new ContaCorrente(10, "Ana Paula");
	   	
//	   	String teste = "Contas diferentes";
	   	
//	   	if(conta1.equals(conta2)){
//	   		teste = "Contas iguais";
//	   	}
//	   	
//	   	System.out.println(teste);
//	   		
//	    conta1 = conta2;
//	   	
//	   	System.out.println(conta1.equals(conta2));
//	   	   	
//	   	conta1.mostraCaractere("anotaram a data da maratona");
//	   	conta1.mostraComStringBuilder("TEXTO");


	   	
	   	List<ContaCorrente> contas = new ArrayList<ContaCorrente>();
	   	Random random = new Random();
	
		ContaCorrente c1 = new ContaCorrente(random.nextInt(200), "Carlos");	
	   	contas.add(c1);
		ContaCorrente c2 = new ContaCorrente(random.nextInt(200), "Ana");	
	   	contas.add(c2);
 	
	   	
	   	Collections.sort(contas);
	    
	   	for (Conta conta : contas) {	
			System.out.println(conta);
		}
	   	
	   	System.out.println(contas.size());

	   	List<Integer> conjunto = new ArrayList<Integer>();
	   	for (int i = 0; i <= 1000; i++){
	   		conjunto.add(i);
	   	}
	   	Collections.reverse(conjunto);
	   	
	   	System.out.println(conjunto);
	   	
	   	
//	   	TreeSet<Integer> conjunto = new TreeSet<Integer>();
//	   	for (int i = 0; i <= 1000; i++){
//	   		conjunto.add(i);
//	   	}
//	   		for (Integer integer : conjunto.descendingSet()) {
//				System.out.print(integer + " ");
//				
//			}
//	   	
//	   	
//	    String numero = "762";
//        System.out.println("Imprimindo a string: " + numero);

//        int resultado = converteParaInt(numero);
//        System.out.println("Imprimindo o int: " + resultado);
//        
	}
}
   	 	