package listaDeAtividade1;

import java.util.Random;

public class Atividade13 {
    //13. A turma C e composta de 60 alunos, e a turma D de 20 alunos. Escreva um algoritmo que
    //leia o percentual de alunos reprovados na turma C, o percentual de aprovados na turma
    //D, calcule e escreva:
    //a) O número de alunos reprovados na turma C.
    //b) O número de alunos reprovados na turma D.
    //c) A percentagem de alunos reprovados em relação ao total de alunos das duas turmas.

    public static void main(String[] args) {

        int tC = 60;
        int tD = 20;
        int alunosReprovadosTC;
        int alunosReprovadosTD;
        int alunosReprovadosNumeros;

        Random ram = new Random();
        int percentualReprovadosTC = ram.nextInt(10, 20);
        int percentualAprovadosTD = ram.nextInt( 90, 95);

        alunosReprovadosTC = calcularNumerosDeAlunos(tC, percentualReprovadosTC);
        alunosReprovadosTD =  tD  - calcularNumerosDeAlunos(tD, percentualAprovadosTD);
        alunosReprovadosNumeros = alunosReprovadosTD + alunosReprovadosTC;

        int alunosReprovadosPercentagem = calcularPercentagemAlunos(alunosReprovadosNumeros, 80);

        System.out.println("a) alunos reprovados na turma C: " + alunosReprovadosTC);
        System.out.println("b) alunos reprovados na turma D: " + alunosReprovadosTD);
        System.out.println("c) A percentagem de alunos reprovados em relação ao total de alunos das duas turmas: " + alunosReprovadosPercentagem + "%");
    }

    private static int calcularNumerosDeAlunos(int totalAlunos, int percentual) {
           int alunos = (totalAlunos * percentual) / 100;
           return  alunos;
    }

    private static int calcularPercentagemAlunos(int totalAlunosReprovados, int totalAlunos) {
        int percetagem = (totalAlunosReprovados * 100) / totalAlunos;
        return  percetagem;
    }
}

