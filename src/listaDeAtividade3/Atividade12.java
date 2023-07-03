package listaDeAtividade3;

import java.util.Random;

public class Atividade12 {
   //12. Faça um algoritmo que leia 20 números inteiros e positivos e calcule o produto dos números
   //pares e o somatório dos ímpares. Além disso, deve-se verificar a quantidade de pares e
   //ímpares informados. O algoritmo não poderá aceitar valores negativos. O fim da leitura
   //será indicado pelo número 0.
    public static void main(String[] args) {

        int quantidadeImpar = 0;
        int quantidadePares = 0;
        int produto = 1;
        int somatorioImpar = 0;
        int numeros;
        Random ram = new Random();

        for (int i = 1; i < 21; i++) {
            numeros = ram.nextInt(1, 100);
            System.out.println(i + ": " + numeros);
            if (numeros % 2 != 0) {
                somatorioImpar = somatorioImpar + numeros;
                quantidadeImpar++;
            }

           if (numeros % 2 == 0) {
               produto *= numeros;
               quantidadePares++;
            }
        }
        System.out.println("Produto dos pares: " + produto);
        System.out.println("Somatório dos ímpares: " + somatorioImpar);
        System.out.println("Quantidade de numeros Pares:" + quantidadePares);
        System.out.println("Quantidade de numeros Impares: " + quantidadeImpar);
    }
}

