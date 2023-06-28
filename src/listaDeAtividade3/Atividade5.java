package listaDeAtividade3;

import java.util.Random;

public class Atividade5 {
   // 5. Chico tem 1,50 metros e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metros e
   //cresce 3 centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos
   //serão necessários para que Zé seja maior que Chico.
    public static void main(String[] args) {

        int anos = 0;
        double alturaZe = 1.10;
        double alturaChico = 1.50;

        while (alturaZe < alturaChico) {
            alturaZe += 0.03;
            alturaChico += 0.02;
            anos++;
        }
        System.out.println("Ze passou a altura do Chico após: "+ anos + " Anos");
    }
}
