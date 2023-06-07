package listaDeAtividade1;

import java.util.Random;
public class Atividade1 {
   // 1. Elabore um algoritmo que leia dois números e mostre a soma deles.
    public static void main(String[] args) {

        Random ram = new Random();

        int x = ram.nextInt(1, 100);
        int y = ram.nextInt(1, 100);

        int soma = x + y;

        System.out.println("Valor x: " + x + " Valor y: " + y);
        System.out.println(soma);
    }
}
