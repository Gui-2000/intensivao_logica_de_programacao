package listaDeAtividade3;

import java.util.Random;

public class Atividade15 {
    //15. Elabore um algoritmo que, utilizando estruturas de repetição aninhadas, apresente na tela
    //as tabuadas de multiplicação e divisão dos números de 1 a 9.
    public static void main(String[] args) {

        Random ram = new Random();
        int numeroDaDivisao = 1;
        int divisor = 1;
        int numeroDaMultiplicacao = 1;
        int multiplicador = 1;

        System.out.println("Multiplicação do 1 ao 9:");
        for (int i=0; i<17; i++) {
            int multiplicacao = multiplicador * numeroDaMultiplicacao;
            System.out.println(multiplicador + " x " + numeroDaMultiplicacao + " = " + multiplicacao);
            multiplicador++;
            if (multiplicador > 10) {
                System.out.println("--------------------");
                multiplicador = 1;
                numeroDaMultiplicacao = numeroDaMultiplicacao + 1;
                for (int j=1; j<10; j++) {
                    multiplicacao = multiplicador * numeroDaMultiplicacao;
                    System.out.println(multiplicador + " x " + numeroDaMultiplicacao + " = " + multiplicacao);
                    multiplicador++;
                    if(multiplicacao == 81) {
                        multiplicacao = multiplicador * numeroDaMultiplicacao;
                        System.out.println(multiplicador + " x " + numeroDaMultiplicacao + " = " + multiplicacao);
                    }
                }
            }
        }

        System.out.println("divisão do 1 ao 9:");
        for (int i=0; i<17; i++) {
            int divisao = divisor / numeroDaDivisao;
            System.out.println(divisor + " / " + numeroDaDivisao + " = " + divisao);
            divisor++;
            if (divisor > 10) {
                System.out.println("--------------------");
                numeroDaDivisao = numeroDaDivisao + 1;
                divisor = numeroDaDivisao;
                for (int j=1; j<10; j++) {
                    divisao = divisor / numeroDaDivisao;
                    System.out.println(divisor + " / " + numeroDaDivisao + " = " + divisao);
                    divisor = divisor + numeroDaDivisao;
                    if(divisor > 81) {
                        divisao = divisor / numeroDaDivisao;
                        System.out.println(divisor + " / " + numeroDaDivisao + " = " + divisao);
                    }
                }
            }
        }
    }
}
