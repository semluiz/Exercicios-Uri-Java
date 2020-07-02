package exercicios;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int number, w_hours;
        Double salario;
        System.out.println("Digite o numero do funcionario");
        number = sc.nextInt();

        System.out.println("Digite as horas trabalhadas");
        w_hours = sc.nextInt();

        System.out.println("Salario");
        salario = sc.nextDouble();

        salario = w_hours * salario;

        System.out.println("NUMBER = " + number);
        System.out.println("SALARY = " + String.format("%.2f", salario));

        sc.close();

    }
}
