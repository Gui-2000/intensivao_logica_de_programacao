package listDeAtividade2;

import java.util.Random;

public class atividade1 {
    // 1. Elaborar um algoritmo que leia o público total de um jogo de futebol e forneça a renda
    //do jogo, sabendo-se que havia 4 tipos de ingressos assim distribuídos: popular 10% do
    //público a R$ 5,00, geral 50% do público a R$ 10,00, arquibancada 30% do público a R$
    //20,00 e cadeiras 10% do público a R$ 30,00
    public static void main(String[] args) {

        double popular;
        double geral;
        double arquibancada;
        double cadeiras;

        Random ram = new Random();

        int publicoTotal = ram.nextInt(40000, 1000000);
        double rendaTotal;

        double valorPublicPopular = valorSetor(publicoTotal, 0.1, 5.00);
        double valorPublicGeral = valorSetor(publicoTotal, 0.5, 10.00);
        double valorPublicArquibancada = valorSetor(publicoTotal, 0.3, 20.00);
        double valorPublicCadeiras = valorSetor(publicoTotal, 0.1, 30.00);
        rendaTotal = valorPublicGeral + valorPublicPopular + valorPublicArquibancada + valorPublicCadeiras;
        System.out.println(rendaTotal);
    }

    public static double valorSetor(int torcidaTotal, double porcentagem, double preco) {
       double valor = (torcidaTotal * porcentagem) * preco;
       return valor;
    }
}
