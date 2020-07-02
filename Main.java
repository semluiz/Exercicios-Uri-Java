package exercicios;

import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String nome = sc.next();

        double salarioFixo = sc.nextDouble();

        double vendasEfetuadas = sc.nextDouble();


        double total = ((vendasEfetuadas * 15) / 100) + salarioFixo;


        System.out.printf("TOTAL = R$ %.2f \n", total);
    }
}
