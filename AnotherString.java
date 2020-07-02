package exercicios;

public class AnotherString {
    public static void main(String[] args) {
        String texto = "In the beginning God created the heavens and the earth. Now the earth was formless and empty, darkness was over the surface of the deep, and the Spirit of God was hovering over the waters.\n" +
                "\n" +
                "And God said, \"Let there be light,\" and there was light. God saw that the light was good, and he separated the light from the darkness. God called the light \"day,\" and the darkness he called \"night.\" And there was evening, and there was morning - the first day.";

        int limite = 40, quantidade = 0;
        String textoFormatado = " ";

        for (int i = 0; i < texto.length(); i++) {
            textoFormatado = textoFormatado + texto.charAt(i); // recebe o valor do texto
            quantidade++; // conta as strings

            if (quantidade >= limite && texto.charAt(i) == ' ') { // se a quantidade de caracteres for mais de 40 por linha e o valor do texto for um espaço vazio
                quantidade = 0; // ele zera o contador de caracteres
                textoFormatado += "\n"; // e quebra a linha
            }

        }

        System.out.println(textoFormatado);
    }
}

// #primeira solução elaborada, limita a quantidade de caracteresm porém quebra as palavras

//public class AnotherString {
//    public static void main(String[] args) {
//        String texto = "In the beginning God created the heavens and the earth. Now the earth was formless and empty, darkness was over the surface of the deep, and the Spirit of God was hovering over the waters.\n" +
//                "\n" +
//                "And God said, \"Let there be light,\" and there was light. God saw that the light was good, and he separated the light from the darkness. God called the light \"day,\" and the darkness he called \"night.\" And there was evening, and there was morning - the first day.";
//
//        for (int i = 0; i < texto.length(); i++) {
//            System.out.print(texto.charAt(i));
//            if (i != 0 && i % 40 == 0) {
//                System.out.println();
//            }
//        }
//    }
//}
