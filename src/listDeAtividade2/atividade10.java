package listDeAtividade2;

import java.util.Random;

public class atividade10 {
    //10. Escreva um algoritmo que leia a cidadania de uma pessoa, codificada da seguinte forma:
    //1 – Brasileiro;
    //2 – Alemão;
    //3 – Inglês;
    //4 – Italiano;
    //5 – Espanhol e
    //6 – Frances.O algoritmo devera mostrar na tela a lingua nativa do cidadão, de acordo com a cidadania
    //selecionada. Caso não seja informado nenhum código válido, informar na tela que a cidadania
    //nativa da pessoa não pode ser verificada.
    public static void main(String[] args) {

        String linguaNativa;

        Random ram = new Random();
       // int cidadania = ram.nextInt(1, 10);

        int cidadania = 10;
        if (cidadania == 1) {
            linguaNativa = "Português";
        } else if (cidadania == 2) {
            linguaNativa = "Alemão";
        } else if (cidadania == 3) {
            linguaNativa = "Inglês";
        } else if (cidadania == 4) {
            linguaNativa = "Italiano";
        } else if (cidadania == 5) {
            linguaNativa = "Castelhano ou Espanhol";
        } else if (cidadania == 6) {
            linguaNativa = "Francês";
        } else {
            linguaNativa = "nenhum código válido, cidadania nativa da pessoa não pode ser verificada";
        }
        System.out.println(linguaNativa);
    }
}
