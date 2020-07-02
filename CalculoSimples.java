package exercicios;

import java.util.Scanner;

// problema 1010
public class CalculoSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int codPeca1, codPeca2, numPeca1, numPeca2;
        double valPeca1, valPeca2, resum1, resum2, finalCalculo;

        codPeca1 = scan.nextInt();

        numPeca1 = scan.nextInt();

        valPeca1 = scan.nextDouble();

        codPeca2 = scan.nextInt();

        numPeca2 = scan.nextInt();

        valPeca2 = scan.nextDouble();

        resum1 = valPeca1 * numPeca1;
        resum2 = valPeca2 * numPeca2;

        finalCalculo = resum1 + resum2;

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", finalCalculo));
    }
}
