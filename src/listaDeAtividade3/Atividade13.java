package listaDeAtividade3;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Atividade13 {
   //13. Foi realizada uma pesquisa entre os habitantes de uma região. Sendo assim, foram coletados
   //os dados de idade, sexo (M/F) e salário. Encerre a entrada de dados quando for digitada
   //uma idade zero. Faça um algoritmo que informe:
   //a) A media de salário dos homens;
   //b) A media de salário das mulheres;
   //c) A media de salário do grupo;
   //d) O homem mais velho;
   //e) A mulher mais nova.
    public static void main(String[] args) {

        int idade;
        int idadeMaior = 0;
        int idadeMenor = 0;
        String sexo;
        List<String> sexos = Arrays.asList("M", "F");
        int salario;
        int salarioTotal = 0, salarioTotalMedia = 0;
        int quantidadeGrupo = 0;
        int salariosM = 0, salariosF = 0;
        int salarioMM = 0, salarioMF = 0;
        int quantidadeM = 0, quantidadeF = 0;

        Random ram = new Random();

        do {
            idade = ram.nextInt(0, 80);
            sexo = sexos.get(ram.nextInt(0, 2));
            salario = ram.nextInt(1200, 2000);
            salarioTotal = salarioTotal + salario;
            quantidadeGrupo++;

            if (sexo == "M") {
                salariosM = salariosM + salario;
                quantidadeM++;
            }

            if (sexo == "F") {
                salariosF = salariosF + salario;
                quantidadeF++;
            }

            if (sexo == "M" && idade > idadeMaior) {
                idadeMaior = idade;
            }

            if (sexo == "F" && idade != 0) {
                idadeMenor = idade;
            }

        } while (idade != 0);

        salarioTotalMedia = salarioTotal / quantidadeGrupo;
        salarioMM = salariosM / quantidadeM;
        salarioMF = salariosF / quantidadeF;

        System.out.println("A media de salário dos homens: " + salarioMM);
        System.out.println("A media de salário das mulheres: " + salarioMF);
        System.out.println("A media de salário do grupo: " + salarioTotalMedia);
        System.out.println("O homem mais velho: " + idadeMaior);
        System.out.println("A mulher mais nova: " + idadeMenor);
    }
}

