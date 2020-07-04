package exercicios;

import java.util.*;

import java.util.Scanner;

// exercicio 1013
public class MaiorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ab = (a + b + Math.abs(a - b)) / 2;
        int abc = (ab + c + Math.abs(ab - c)) / 2;

        System.out.println(abc + " eh o maior valor");

    }
}
