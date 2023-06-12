package listaDeAtividade1;

import java.util.Random;

public class Atividade11 {
    // 11. Desenvolva um algoritmo que receba um valor numérico inteiro, calcule e mostre qual o
    //quociente e o resto da divisão desse número por 3.

    public static void main(String[] args) {

        Random ram = new Random();

        int x = ram.nextInt( 100, 1000 );

        int quociente =  x / 3;

        int resto = x%3;

        System.out.println(x);
        System.out.println(quociente);
        System.out.println(resto);
    }
}
