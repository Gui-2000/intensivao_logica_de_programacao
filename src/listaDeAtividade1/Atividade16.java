package listaDeAtividade1;

import java.util.Random;

public class Atividade16 {
    //16. Uma escola deseja dividir os alunos de uma série em três turmas. Entretanto, deverá
    //ocorrer um equilíbrio no número de alunos em cada turma. Caso ocorra diferença no
    //número de alunos, esta deverá ser a mínima. Escreva um algoritmo que leia o número de
    //alunos da série, calcule e mostre o número de alunos em cada turma.

    public static void main(String[] args) {

        int turma1;
        int turma2;
        int turma3;

        Random ram = new Random();
        int alunosSerie = ram.nextInt(90, 93);

        System.out.println(alunosSerie);
        turma1 = calcularTurma(alunosSerie);
        turma2 = calcularTurma(alunosSerie, turma1);
        turma3 = calcularTurma(alunosSerie,turma1, turma2);

        System.out.println(turma1);
        System.out.println(turma2);
        System.out.println(turma3);
    }

    public static int calcularTurma(int valor1) {
      return valor1 / 3;
    }
    public static int calcularTurma(int valor1, int valor2) {
        return (valor1 - valor2) / 2;
    }
    public static int calcularTurma(int valor1, int valor2, int valor3) {
        return valor1 - (valor2 + valor3);
    }
}

