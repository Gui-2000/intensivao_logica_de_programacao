package listaDeAtividade1;

import java.util.Random;

public class Atividade2 {
   // 2. Construa um algoritmo que leia 4 notas e mostre a média.

    public static void main(String[] args) {

        Random ram = new Random();

        int x = ram.nextInt(1, 100);
        int y = ram.nextInt(1, 100);
        int a = ram.nextInt(1, 100);
        int b = ram.nextInt(1, 100);

        int soma = x + y + a + b;

        int media = soma / 4;

        System.out.println("Valor x: " + x);
        System.out.println("Valor y: " + y);
        System.out.println("Valor a: " + a);
        System.out.println("Valor b: " + b);
        System.out.println("Valor soma: " + soma);
        System.out.println("Valor média: " + media);
    }
}
