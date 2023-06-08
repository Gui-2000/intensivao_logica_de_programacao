package listaDeAtividade1;

import java.util.Random;

public class Atividade4 {
   // 4 Escreva um algoritmo que leia uma medida em metros e converta para centímetros

    public static void main(String[] args) {

        Random ram = new Random();

        int metros = ram.nextInt(10, 100);

        int centímetros = metros * 100;

        System.out.println("Valor x: " + metros);
        System.out.println("Valor centímetros: " + centímetros);
    }
}
