package listaDeAtividade3;

import java.util.Random;

public class Atividade8 {
   //8. Escreva um algoritmo que leia 50 valores e encontre o maior e o menor. Mostre o resultado
    public static void main(String[] args) {

        int valor;
        int maior = 0;
        int menor = 0;

        Random ram = new Random();

        for (int i=1; i<51; i++) {
            valor = ram.nextInt(-100, 1000);
            System.out.println(valor);
             if (maior < valor) {
                 maior = valor;
             }
             if (menor > valor) {
                 menor = valor;
             }
        }
        System.out.println("O maior numero: " + maior);
        System.out.println("O menor numero: " + menor);
    }
}
