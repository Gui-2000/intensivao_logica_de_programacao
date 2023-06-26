package listaDeAtividade3;

import java.util.Random;

public class Atividade2 {
   // 2. Elabore um algoritmo que leia um determinado número e apresente na tela a tabuada
   //de multiplicação deste número. Por exemplo, digamos que o número informado foi 2, o
   //programa deverá apresentar na tela:
   //1 × 2 = 2
   //2 × 2 = 4
   //3 × 2 = 6
   //...
   //10 × 2 = 20
    public static void main(String[] args) {

        Random ram = new Random();
        int numero = ram.nextInt(0, 10);
        int multiplicador = 1;

        for (int i=0; i<10; i++) {
            int multiplicacao = multiplicador * numero;
            System.out.println(multiplicador + " x " + numero + " = " + multiplicacao);
            multiplicador++;
        }
    }
}
