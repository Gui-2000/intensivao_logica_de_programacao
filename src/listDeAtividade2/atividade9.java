package listDeAtividade2;

import java.util.Random;

public class atividade9 {
    // 9. Em uma competição o nadador é premiado de acordo com a distância máxima que percorrer.
    //Se o nadador percorrer uma distância menor que 800 metros, recebe R$ 5.000,00 reais de
    //prêmio. Caso percorra uma distância entre 800 e 1500 metros, recebe R$ 10.000,00. E se
    //percorrer uma distância superior a 1500 metros, recebe R$ 15.000,00 em prêmio. Escreva
    //um algoritmo que leia a distância percorrida e mostre na tela o valor da premiação a ser
    //recebida pelo nadador.
    public static void main(String[] args) {

         Random ram = new Random();
         int distânciaPercorrida = ram.nextInt(700, 2000);

         System.out.println(distânciaPercorrida);

         if (distânciaPercorrida < 800) {
            System.out.println("Valor da premiação: R$ 5.000,00 reais");
         } else if (distânciaPercorrida == 800 || distânciaPercorrida <= 1500) {
            System.out.println("Valor da premiação: R$ 10.000,00 reais");
         } else {
            System.out.println("Valor da premiação: R$ 15.000,00 reais");
         }
    }
}
