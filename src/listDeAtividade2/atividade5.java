package listDeAtividade2;

import java.util.Random;

public class atividade5 {
    // 5. CALCULADORA: escreva um algoritmo para ler 2 valores e uma das seguintes operações
    //a serem executadas (codificada da seguinte forma: (1.Adição, 2.Subtração, 3.Divisão,
    //4.Multiplicação). Calcular e escrever o resultado dessa operação sobre os dois valores lidos.
    public static void main(String[] args) {

        Random ram = new Random();
        int valor1 = ram.nextInt(100, 1000);
        int valor2 = ram.nextInt(1, 100);
        int numeroDaOperacao = ram.nextInt(1, 4);

        System.out.println("Primero Número: " + valor1);
        System.out.println("Segundo Número: " + valor2);
        System.out.println("Operação: " + numeroDaOperacao);

        if (numeroDaOperacao == 1) {
            int adicao = valor1 + valor2;
            System.out.println("Adição: " + adicao);
       } else if (numeroDaOperacao == 2) {
            int subtracao = valor1 - valor2;
            System.out.println("Subtração: " + subtracao);
        } else if (numeroDaOperacao == 3) {
            int divisao = valor1 / valor2;
            System.out.println("Divisão: " + divisao);
        } else {
            int multiplicacao = valor1 * valor2;
            System.out.println("Multiplicação: " + multiplicacao);
        }
    }
}
