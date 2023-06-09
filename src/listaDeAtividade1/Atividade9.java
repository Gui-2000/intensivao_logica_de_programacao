package listaDeAtividade1;

public class Atividade9 {
    // 9. Desenvolva um algoritmo que receba o salário de um funcionário, calcule e mostre seu
    //novo salário com reajuste de 15%.

    public static void main(String[] args) {

        double salario = 1.320 ;

        double aumentoSalarial =  salario * 0.15;

        double salarioReajustado = salario + aumentoSalarial;

        System.out.println(salarioReajustado);
    }
}
