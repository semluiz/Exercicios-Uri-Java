package exercicios;

import java.util.Scanner;

public class ExercicioMedia {
	public static void main(String[]args) {
		Scanner sc  = new Scanner(System.in);
		double MEDIA,A,B;
		
		A= sc.nextDouble();
		
		B= sc.nextDouble();
		
		MEDIA = ((A * 3.5)+(B * 7.5))/11;

		System.out.println("MEDIA = "+String.format(" %.5f ", MEDIA));
		
		sc.close();
	}
}
