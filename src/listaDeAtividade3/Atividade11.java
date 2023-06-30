package listaDeAtividade3;

import java.util.Random;

public class Atividade11 {
   //11. Elaborar um algoritmo que leia os limites inferior e superior de um intervalo e mostre
   //todos os números pares no intervalo, bem como, o somatório dos pares. Suponha que os
   //números digitados são um intervalo crescente. Exemplo:
   //• Limite inferior: 3
   //• Limite superior: 12
   //• Pares: 4 6 8 10
   //• Soma dos pares: 28
    public static void main(String[] args) {

        int soma = 0;

        Random ram = new Random();
        int limiteInferior = ram.nextInt(10, 20);
        int limiteSuperior = ram.nextInt(20, 40);

        System.out.print("Pares: ");
        for (int i = limiteInferior; i != limiteSuperior; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                soma = soma + i;
            }
        }
        System.out.println();
        System.out.println("Soma dos pares: " + soma);
    }

}

