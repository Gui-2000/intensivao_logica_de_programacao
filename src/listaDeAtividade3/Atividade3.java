package listaDeAtividade3;

import java.util.Random;

public class Atividade3 {
   // 3. Crie um algoritmo que leia um determinado número e apresente na tela a tabuada da
   //divisão deste número. Por exemplo, digamos que o número informado foi 5, o programa
   //devera apresentar na tela:
   //5 ÷ 5 = 1
   //10 ÷ 5 = 2
   //15 ÷ 5 = 3
   //...
   //50 ÷ 5 = 10
    public static void main(String[] args) {

        Random ram = new Random();
        int numero = ram.nextInt(1, 10);
        int divisor = numero;

        for (int i=0; i<10; i++) {
            int divisao = divisor / numero;
            System.out.println(divisor + " ÷ " + numero + " = " + divisao);
            divisor = divisor + numero;
        }
    }
}
