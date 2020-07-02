package exercicios;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c,d,media;
        System.out.println("Digite o valor de A");
        a= scan.nextInt();
        System.out.println("Digite o valor de B");
        b= scan.nextInt();
        System.out.println("Digite o valor de C");
        c= scan.nextInt();
        System.out.println("Digite o valor de D");
        d= scan.nextInt();
        media = ((a*b)-(c*d));

        System.out.println("MEDIA \n" + media);
        scan.close();
    }
}
