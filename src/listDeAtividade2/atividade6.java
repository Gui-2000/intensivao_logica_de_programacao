package listDeAtividade2;

import java.util.Random;

public class atividade6 {
    // 6. Em um torneio de atletismo as equipes são formadas por quatro jogadores. A equipe
    //da Escola SóDaCampeão e formada pelos seguintes atletas: João, Chico, Pedro e Bola.
    //Algumas restrições podem ocasionar a desclassificação da equipe, são elas:
    //a) O jogador João não pode ter um número de pontos menor que a metade da soma
    //dos pontos dos demais jogadores que compõem a equipe;
    //b) O jogador Pedro não pode ficar com o triplo de pontos do jogador bola.
    //c) O jogador chico não pode ficar com zero pontos;
    //d) O jogador bola pode ficar com ate metade dos pontos do jogador Pedro ou abaixo da
    //soma de pontos dos jogadores João e Chico.
    //Sendo assim, elabore um algoritmo que leia a pontuação de cada um dos jogadores citados.
    //Apos, verifique e mostre se a equipe foi ou não desclassificada.
    public static void main(String[] args) {

         Random ram = new Random();
         int pontosJoao = ram.nextInt(10, 100);
         int pontosChico = ram.nextInt(10, 100);
         int pontosPedro = ram.nextInt(10, 100);
         int pontosBola = ram.nextInt(10, 100);

         if (pontosJoao < somaPontosMetadeJoao(pontosPedro, pontosChico,pontosBola)) {
            System.out.println("Equipe foi desclassificada");
         } else if (pontosPedro > pontosBola * 3) {
            System.out.println("Equipe foi desclassificada");
         } else if (pontosChico == 0) {
            System.out.println("Equipe foi desclassificada");
         } else if ((pontosBola <= pontosPedro / 2) || (pontosBola < pontosChico + pontosJoao)) {
            System.out.println("Equipe foi desclassificada");
         } else {
            System.out.println("Equipe foi classificada");
         }
    }
    public static int somaPontosMetadeJoao(int pontosP, int pontosC, int pontosB) {
        int soma = (pontosP + pontosC + pontosB) / 2;
        return soma;
    }
}
