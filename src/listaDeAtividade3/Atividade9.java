package listaDeAtividade3;

import java.util.Random;

public class Atividade9 {
   //9. Faça um algoritmo que receba a idade, altura e peso de 10 pessoas. Calcule e mostre:
   //a) A quantidade de pessoas com idade superior a 50 anos;
   //b) média das alturas das pessoas com idade entre 10 e 20 anos;
   //c) A porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas
    public static void main(String[] args) {

        int idade = 0;
        double altura = 0.0, peso = 0.0;

        double mediaAltura = 0;
        int idadeSoma = 0, alturaSoma = 0,  pesoSoma = 0, porcentagemDoPeso = 0;

        Random ram = new Random();

        for (int i=1; i<11; i++) {
            idade = ram.nextInt(10, 80);
            altura = ram.nextDouble(0.6, 2.0);
            peso = ram.nextDouble(20.0, 100.0);

            if (idade > 50) {
                idadeSoma++;
            }

            if (idade >= 10 && idade <= 20) {
                alturaSoma++;
                mediaAltura = (mediaAltura * altura) / alturaSoma;
            }

            if (peso < 40.0) {
                pesoSoma++;
                porcentagemDoPeso = (pesoSoma * 100) / 10;
            }

            System.out.println(idade + " " + altura + " " + peso);
        }
        System.out.println("a) A quantidade de pessoas com idade superior a 50 anos: " + idadeSoma);
        System.out.printf("b) média das alturas das pessoas com idade entre 10 e 20 anos: %.1f\n" , mediaAltura);
        System.out.println("c) A porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas: " + porcentagemDoPeso + "%");
    }
}

