package listaDeAtividade1;

import java.util.Random;

public class Atividade12 {
    //12. Desenvolva um algoritmo que receba uma quantidade de um alimento em quilos, calcule e
    //mostre quantos dias durará esse alimento para uma pessoa que consome 50 gramas desse
    //alimento por dia.

    public static void main(String[] args) {

        Random ram = new Random();

        int x = ram.nextInt( 10);
        // Valor Quilos

        int dias = (int) (x / 0.05);
        // 0.05 QUIlOS = 50g

        System.out.println(dias);
    }
}
