package listaDeAtividade3;

import java.util.Random;

public class Atividade1 {
   // 1. Escreva um algoritmo que leia dez valores numéricos inteiros e apresente na tela o somatório
   //dos valores.
    public static void main(String[] args) {

        int x;
        int soma = 0;
        Random ram = new Random();

        for (int i=0; i<10; i++) {
            x = ram.nextInt(0, 100);
            soma += x;
        }

        System.out.println("Soma dos valores: " + soma);
    }
}
