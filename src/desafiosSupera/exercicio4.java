package desafiosSupera;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas: ");
        int linhas = sc.nextInt();

        System.out.println("Digite a frase: ");
        for (int i = 0; i < linhas; i++) {
            String verso = pegaLinha(sc);
            StringBuilder linha1 = new StringBuilder(verso.substring(0, verso.length() / 2));
            StringBuilder linha2 = new StringBuilder(verso.substring(verso.length() / 2));
            ajustaLinha(linha1);
            ajustaLinha(linha2);
            imprimir(linha1, linha2);
        }

        sc.close();
    }

    private static void imprimir(StringBuilder linha1, StringBuilder linha2) {
        System.out.println(linha1.toString() + linha2.toString());
    }

    private static StringBuilder ajustaLinha(StringBuilder linha) {
        return linha.reverse();
    }
    private static String pegaLinha(Scanner snc) {
        String linha = snc.nextLine();
        while (linha.isEmpty())
            linha = snc.nextLine();
        return linha;
    }
}