package listaDeAtividade1;

import java.util.Random;

public class Atividade10 {
    // 10. Desenvolva um algoritmo que receba o valor de um depósito em poupança, calcule e mostre
    //o valor apos um mês de aplicação na poupança, sabendo que a poupança rende 5% ao mês

    public static void main(String[] args) {

        Random ram = new Random();

        double depósitoPoupanca = ram.nextDouble( 1.000, 2.000 );

        double aumentoMensal =  depósitoPoupanca * 0.05;

        double poupancaFinal = depósitoPoupanca +  aumentoMensal;

        System.out.printf("Deposito Inicial: %.3f%n", depósitoPoupanca);
        System.out.printf("Poupança Mensal: %.3f%n", poupancaFinal);
    }
}
