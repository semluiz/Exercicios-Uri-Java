package exercicios;

import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double raio,pi = 3.14159,calcFinal;

        raio = scan.nextInt();

        calcFinal = ((4.0/3)*pi*(raio*raio*raio));

        System.out.println("VOLUME = "+String.format("%.3f",calcFinal));
    }
}
