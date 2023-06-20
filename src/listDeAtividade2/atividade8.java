package listDeAtividade2;


import java.util.Random;
import java.util.Scanner;

public class atividade8 {
    // 8. Escreva um algoritmo que receba o nome, idade, sexo e salário fixo de um funcionário.
    //Calcule e mostre o nome e salário líquido do funcionário de acordo com a tabela:
    //SEXO IDADE ABONO
    //M ≥ 30 100,00
    //F < 30 50,00
    //F ≥ 30 200,00
    //M < 30 80,00
    public static void main(String[] args) {

        int salarioLiquido;
        String nome;

        Random ram = new Random();
        int idade = ram.nextInt(18, 60);
        int salarioFixo = ram.nextInt(1500, 1800);
        int sexo = ram.nextInt(1,2);
        // 1 == M, 2 == F

        System.out.println(sexo);
        if (sexo == 1) {
            nome = "Bob";
            if (idade >= 30) {
                salarioLiquido = salarioFixo + 100;
                System.out.println("O funcionário " + nome + " recebe um salário líquido de R$" + salarioLiquido);
            } else {
                salarioLiquido = salarioFixo + 80;
                System.out.println("O funcionário " + nome + " recebe um salário líquido de R$" + salarioLiquido);
            }
        } else if (sexo == 2) {
            nome = "Maria";
            if (idade >= 30) {
                salarioLiquido = salarioFixo + 200;
                System.out.println("A funcionária " + nome + " recebe um salário líquido de R$" + salarioLiquido);
            } else {
                salarioLiquido = salarioFixo + 50;
                System.out.println("A funcionária " + nome + " recebe um salário líquido de R$" + salarioLiquido);
            }
        }
    }
}
