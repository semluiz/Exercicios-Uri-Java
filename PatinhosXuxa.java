package exercicios;

import java.util.Scanner;

public class PatinhosXuxa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int patos_iniciais;

        System.out.println("Vou cantar uma canção, preciso que voces me ajudem");
        System.out.println("é preciso escolher um numero de 0 a 20");

        patos_iniciais = entrada.nextInt();
        int patos_var = patos_iniciais;

        if ((patos_iniciais >= 1) && (patos_iniciais <= 20)) {


            while (patos_var != 1) {


                System.out.println(patos_var + "  patinhos foram passear");

                System.out.println("Além das montanhas");

                System.out.println("Para brincar");

                System.out.println("A mamãe gritou: Quá, quá, quá, quá Mas só  " + (patos_var - 1) + " patinhos");

                System.out.println("voltaram de lá.");


                patos_var--;
            }


            if (patos_var == 1) {


                System.out.println(+patos_var + " patinho foi passear");

                System.out.println("Além das montanhas");

                System.out.println("Para brincar");

                System.out.println("A mamãe gritou: Quá, quá, quá, quá Mas nenhum patinho");

                System.out.println("voltou de lá.");


                patos_var--;
            }


            if (patos_var == 0) {

                System.out.println("A mamãe patinha foi procurar");

                System.out.println("Além das montanhas");

                System.out.println("Na beira do mar");

                System.out.println("A mamãe gritou: Quá, quá, quá, quá");

                System.out.println("E os " + patos_iniciais + " patinhos voltaram de lá.");


            }


        } else {


            System.out.println("Desculpe mas tem de ser um numero entre 1 a 20!");

            System.out.println("Terminando programa...tente de novo!!!");

        }


    }
}
