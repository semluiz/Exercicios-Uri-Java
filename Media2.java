package exercicios;

import java.util.Scanner;

public class Media2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c,media;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		media = ((a*2)+(b*3)+(c*5))/10;
		System.out.println("MEDIA = "+String.format(" %.1f ",media));
		
		sc.close();
	}
}
