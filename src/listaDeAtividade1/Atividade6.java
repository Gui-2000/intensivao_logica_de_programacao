package listaDeAtividade1;

import java.util.Random;

public class Atividade6 {
     // 6. Faça um algoritmo que leia o valor que um funcionário ganha por hora e o número de
     //  horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.


    public static void main(String[] args) {

        Random ram = new Random();

        double valorHora = ram.nextDouble( 6.00);

        int horasTrabalhadas = 220;

        System.out.println("Valor da hora: " + valorHora);
        System.out.println("Horas: " + horasTrabalhadas);
        System.out.printf("Valor do salario mensal: %.1f%n" , calcularSalario(valorHora, horasTrabalhadas));
    }

    private static double calcularSalario(double vh, int ht) {
        double salario = vh * ht;
        return  salario;
    }
}
