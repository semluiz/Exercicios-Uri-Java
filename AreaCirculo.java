package exercicios;

import java.util.Scanner;

public class AreaCirculo {
 
    public static void main(String[] args)   {
    	Scanner scan = new Scanner(System.in);
    	double area,n= 3.14159 ,raio;
    	raio = scan.nextDouble();
    	area = n *(raio * raio);
    	System.out.println("A="+String.format("%.4f",area));
    	scan.close();
    }
 
}