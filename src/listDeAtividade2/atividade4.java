package listDeAtividade2;

import java.util.Random;

public class atividade4 {
    // 4. Escreva um algoritmo que leia um valor para a variável A e um valor para a variável B.
    //Logo apos, o algoritmo deverá fazer com que a variável A guarde o valor da variável B e a
    //variável B guarde o valor da variável A. Apresentar os valores das variáveis A e B antes e
    //depois da troca.
    public static void main(String[] args) {

        Random ram = new Random();
        int variavelA = ram.nextInt(200, 299);
        int variavelB = ram.nextInt(100, 199);

        System.out.println("Valor da variavel A antes da troca: " + variavelA);
        System.out.println("Valor da variavel B antes da troca: " + variavelB);

        System.out.println("---------------------------------");

        if (variavelA > variavelB) {
           variavelA = variavelA ^ variavelB;
           variavelB = variavelA ^ variavelB;
           variavelA = variavelA ^ variavelB;
       }

        System.out.println("Valor da variavel A depois da troca: " + variavelA);
        System.out.println("Valor da variavel B depois da troca: " + variavelB);
    }
}
