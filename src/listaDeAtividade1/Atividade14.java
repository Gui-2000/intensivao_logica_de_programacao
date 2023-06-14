package listaDeAtividade1;

import java.util.Random;

public class Atividade14 {
    //14. Uma loja vende bicicletas com um acréscimo de 50% sobre o seu preço de custo. Ela paga
    //a cada vendedor dois salários-mínimos mensais, mais uma comissão de 15% sobre o preço
    //de custo de cada bicicleta vendida, dividida igualmente entre eles. Escreva um algoritmo
    //que leia o número de empregados da loja, o valor do salário-mínimo, o preço de custo de
    //cada bicicleta, o número de bicicletas vendidas, calcule e escreva: O salário final de cada
    //empregado e o lucro (liquido) da loja

    public static void main(String[] args) {

        double lucroLiq;

        Random ram = new Random();
        int empregados = ram.nextInt(5, 10);
        int NumerosBicicletasVendidas = ram.nextInt(30, 50);
        double salarioMinimo = ram.nextDouble(1.200, 1.300);
        double precoBicicletas = ram.nextDouble(1.000, 2.000);

        double bicicletasVendidasPrecoTotal = NumerosBicicletasVendidas * precoBicicletasFinal(precoBicicletas);
        double salarioFinal = salarioFinalEmpregado(salarioMinimo, precoBicicletas, NumerosBicicletasVendidas, empregados);
        lucroLiq = NumerosBicicletasVendidas * (precoBicicletasFinal(precoBicicletas) - precoBicicletas) - salarioFinal * empregados;

        System.out.printf("O salário final de cada empregado: %.3f%n" , salarioFinal);
        System.out.printf("O lucro (liquido) da loja: %.3f%n" , lucroLiq);
    }

    private static double salarioFinalEmpregado (double salario, double precoInicial, int numBicVendidas, int empregados) {
           double salarioMensal = salario * 2 + (0.15 * precoInicial * numBicVendidas) / empregados;
           return  salarioMensal;
    }

    private static double precoBicicletasFinal(double precoInicial) {
        double precoFinal = precoInicial * 1.5;
        return precoFinal;
    }
}

