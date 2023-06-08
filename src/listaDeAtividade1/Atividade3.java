package listaDeAtividade1;

import java.util.Random;

public class Atividade3 {
   // 3. Desenvolva um algoritmo que receba dois valores numéricos inteiros, calcule e mostre a
    //soma do quadrado desses dois números.

    public static void main(String[] args) {

        Random ram = new Random();

        int x = ram.nextInt(1, 100);
        int y = ram.nextInt(1, 100);

        int soma = (x * x) + (y * y);

        System.out.println("Valor x: " + x);
        System.out.println("Valor y: " + y);
        System.out.println("Valor soma: " + soma);
    }
}
