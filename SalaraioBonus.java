package exercicios;

import java.util.*;

public class SalaraioBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        Double salarioFixo, vendasEfetuadas, total;

        nome = sc.next();


        salarioFixo = sc.nextDouble();

        vendasEfetuadas = sc.nextDouble();

        total = ((vendasEfetuadas * 15) / 100) + salarioFixo;


        System.out.printf("TOTAL = R$ %.2f \n", total);
    }
}
