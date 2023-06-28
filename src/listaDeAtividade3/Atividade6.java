package listaDeAtividade3;

import java.util.Random;

public class Atividade6 {
   //6. Construa um algoritmo que calcule a média aritmética das 3 notas dos alunos de uma
   //classe. O algoritmo deverá ler, além das notas, o código (de três dígitos) do aluno e deverá
   //ser encerrado quando o código for igual a zero
    public static void main(String[] args) {

        int codigo;
        Random ram = new Random();

        do {
            codigo = ram.nextInt(0, 10);
            double nota1 = ram.nextDouble(0.0, 10.0);
            double nota2 = ram.nextDouble(0.0, 10.0);
            double nota3 = ram.nextDouble(0.0, 10.0);
            double media = (nota1 + nota2 + nota3) / 3;
            System.out.printf("A média das 03 Notas: %.1f \n" , media);
        } while (codigo != 0);
    }
}
