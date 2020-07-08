package exercicios;

import java.util.Scanner;

// exercicio iniciante 1016
public class DistanciaCarros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int distancia, tempoCarroY;

        distancia = scan.nextInt();
        tempoCarroY = distancia * 2;
        System.out.println(tempoCarroY + " minutos");
    }
}
