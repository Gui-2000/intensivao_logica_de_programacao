package listaDeAtividade3;

import java.util.Random;

public class Atividade4 {
   // 4. Escrever um algoritmo que leia um valor numérico inteiro. Após, escreva uma tabela com
   //cabeçalho, contendo o valor, seu dobro e seu triplo. Mostrar para todos valores entre
   //o valor informado e 1. Por exemplo, digamos que o número informado seja 20, deve-se
   //apresentar na tela:
   //Número Dobro Triplo
   //20 40 60
   //19 38 57
   //18 36 54
   //... ... ...
   //1 1 1
    public static void main(String[] args) {

        Random ram = new Random();
        int numero = ram.nextInt(1, 100);

        System.out.println("Número Dobro Triplo");

        for (int i = numero; i >= 1; i--) {
            System.out.println("  " + numero + "     " + numero * 2 + "     " + numero * 3);
            numero--;
        }
    }
}
