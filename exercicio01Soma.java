package exercicios;

import java.util.Scanner;

public class exercicio01Soma {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		int A;
		int B;
		int X;
				
		A = input.nextInt();		
		B = input.nextInt();
		X = A + B;
		System.out.println("X= " + X);
		
		input.close();
		
		
	}
}
