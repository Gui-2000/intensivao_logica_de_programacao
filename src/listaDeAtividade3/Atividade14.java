package listaDeAtividade3;

import java.util.Random;

public class Atividade14 {
   //14. Em uma eleição presidencial existem quatro candidatos. Os votos são informados por
   //meio de um código (representando os candidatos). Os códigos utilizados são:
   //1- João
   //2- Maria
   //3- Pedro
   //4- Marcos
   //5- Nulo
   //6- Em branco
   //Escreva um algoritmo que calcule e mostre:
   //a) O total de votos para cada candidato;
   //b) O total de votos nulos;
   //c) O total de votos em branco;
   //d) O percentual de nulos em relação ao total de votos;
   //e) O percentual de brancos em relação ao total de votos.
    public static void main(String[] args) {

        int votosNulos = 0, votosBrancos = 0;
        int joaoVotos = 0, mariaVotos = 0, pedroVotos = 0, marcosVotos = 0;
        int codigos;
        int totalVotos = 1000;
        int percetualNulos, percetualBrancos;
        Random ram = new Random();

        for (int i = 0; i < totalVotos; i++) {
           codigos = ram.nextInt(1, 7);

            if (codigos == 1) {
                joaoVotos = joaoVotos + 1;
            }
            else if (codigos == 2) {
                mariaVotos = mariaVotos + 1;
            }
            else if (codigos == 3) {
                pedroVotos = pedroVotos + 1;
            }
            else if (codigos == 4) {
                marcosVotos = marcosVotos + 1;
            }
           else if (codigos == 5) {
                votosNulos = votosNulos + 1;
            }
           else if (codigos == 6) {
                votosBrancos = votosBrancos + 1;
            }
        }

        percetualNulos = (votosNulos * 100) / totalVotos;
        percetualBrancos = (votosBrancos * 100) / totalVotos;

        System.out.println("Votos João: " + joaoVotos);
        System.out.println("Votos Maria: " + mariaVotos);
        System.out.println("Votos Pedro: " + pedroVotos);
        System.out.println("Votos Marcos: " + marcosVotos);
        System.out.println("Votos Nulos: " + votosNulos);
        System.out.println("Votos Brancos: " + votosBrancos);
        System.out.println("O percentual de nulos em relação ao total de votos: " + percetualNulos + "%");
        System.out.println("O percentual de brancos em relação ao total de votos: " + percetualBrancos + "%");
    }
}

