package listaDeAtividade1;

public class Atividade6 {
     // 6. Faça um algoritmo que leia o valor que um funcionário ganha por hora e o número de
     //  horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.


    public static void main(String[] args) {

        double valorHora = 6.00;

        int horasTrabalhadas = 220;

        double salario = valorHora * horasTrabalhadas;

        System.out.println("Valor da hora: " + valorHora);
        System.out.println("Horas: " + horasTrabalhadas);
        System.out.println("Valor do salario mensal: " + salario);
    }
}
