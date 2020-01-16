package exercicios;

import java.util.Scanner;

public class Exercicio1003Soma {
 public static void main(String[]Args) {
	 int A,B,SOMA;
	
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("Digite o valor de A");
	 A= scan.nextInt();
	 
	 B= scan.nextInt();
	 
	 SOMA = A+B;
	 
	 System.out.println("SOMA = " + SOMA);
	 
	 scan.close();
 }
}
