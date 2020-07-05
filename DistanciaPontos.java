package exercicios;

import java.util.Scanner;

public class DistanciaPontos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1, y1, x2, y2, calcDistancia;

        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();

        double subtracaoResultA = x2 - x1;
        double subtracaoResultB = y2 - y1;

        calcDistancia = (subtracaoResultA * subtracaoResultA) + (subtracaoResultB * subtracaoResultB);
        double finalResult = Math.sqrt(calcDistancia);

        System.out.println(String.format("%.4f", finalResult));

    }
}
