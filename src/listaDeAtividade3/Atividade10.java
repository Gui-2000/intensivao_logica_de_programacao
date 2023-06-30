package listaDeAtividade3;

import java.util.Random;

public class Atividade10 {
   //10. Crie um algoritmo que ajude o DETRAN a calcular o total de recursos que foram
   //arrecadados com a aplicação de multas de trânsito. O algoritmo deve ler as seguintes
   //informações para 20 motoristas:
   //• número da carteira de motorista (número inteiro de 4 dígitos);
   //• número de multas do motorista;
   //• valor total da multa. (Considerando que todas as multas de um motorista tem o
   //mesmo valor).
   //Ao final da leitura, deve-se apresentar o total de recursos arrecadados (somatório das
   // multas de todos motoristas). O algoritmo deverá mostrar também o número da carteira
   // do motorista que obteve o maior número de multas
    public static void main(String[] args) {

        int motoristaMaiorMultas = 0;
        int maiorQuantidadeMultas = 0;
        int totalArrecadado = 0;
        int valorMulta = 0;
        int quantidadesMultas;
        int numeroCarteira;
        Random ram = new Random();

        for (int i=1; i<21; i++) {
            numeroCarteira = ram.nextInt(1000, 2000);
            quantidadesMultas = ram.nextInt(10, 20);
            valorMulta = quantidadesMultas * 1000;

            totalArrecadado = totalArrecadado + valorMulta;

            if (quantidadesMultas > maiorQuantidadeMultas) {
                maiorQuantidadeMultas = quantidadesMultas;
                motoristaMaiorMultas = numeroCarteira;
            }

            System.out.println(numeroCarteira + "  " + quantidadesMultas + "  " + valorMulta);
        }

        System.out.println("O total de recursos é de: " + totalArrecadado);
        System.out.println("O motorista com o maior número de multas: " + motoristaMaiorMultas);
    }
}

