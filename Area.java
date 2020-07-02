package exercicios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c, areaTriangulo, raioCirculo, pi = 3.14159, areaTrapezio, areaQuadrado, areaRetangulo;

        a = scan.nextDouble();

        b = scan.nextDouble();

        c = scan.nextDouble();


        //fórmula b(a)*h(c)/2
        areaTriangulo = ((a * c) / 2);

        //fórmula C= pi * r2
        raioCirculo = pi * (c * c);

        //fórmula area do Trapézio A = (B+b/2)*2
        areaTrapezio = (((a + b) / 2) * c);

        //fórmula area do Quadrado A = L * L
        areaQuadrado = b * b;

        //fórmula area do retângulo
        areaRetangulo = a * b;

        System.out.println("TRIANGULO: " + String.format("%.3f", areaTriangulo));
        System.out.println("CIRCULO: " + String.format("%.3f", raioCirculo));
        System.out.println("TRAPEZIO: " + String.format("%.3f", areaTrapezio));
        System.out.println("QUADRADO: " + String.format("%.3f", areaQuadrado));
        System.out.println("RETANGULO: " + String.format("%.3f", areaRetangulo));


    }
}
