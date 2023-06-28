package listaDeAtividade3;

import java.util.Random;

public class Atividade7 {
   //7. Elabore um algoritmo que leia a medida em metros da frente e lateral de um número
   //indeterminado de terrenos. O algoritmo deverá calcular e mostrar a área do terreno.
   //Deverá parar somente quando área de um terreno for inferior a 100 metros quadrados.
   //(Suponha que a área é um retângulo regular).
    public static void main(String[] args) {

        int lado, frente, area;
        Random ram = new Random();

        do {
            lado = ram.nextInt(1, 500);
            frente = ram.nextInt(1, 500);
            area = lado * frente;
            System.out.println("área do terreno: " + area);
        } while (area > 100);
    }
}
