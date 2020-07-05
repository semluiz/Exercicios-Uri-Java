package exercicios;

import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int distancia = scan.nextInt();
        double combustivel = scan.nextDouble();
        double consumo = distancia / combustivel;

        System.out.println(String.format("%.3f", consumo) + " km/l");
    }
}
