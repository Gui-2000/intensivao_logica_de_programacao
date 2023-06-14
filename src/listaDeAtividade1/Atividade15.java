package listaDeAtividade1;

import java.util.Random;

public class Atividade15 {
    //15. Elabore um algoritmo que decomponha o número 1738, informando ao usuário o número
    //de unidades, dezenas, centenas e milhares.

    public static void main(String[] args) {

        int numero = 1738;
        int unidade, dezena, centena, u_milhar;

        unidade = ((numero/1)%10)*1;
        dezena = ((numero/10)%10)*10;
        centena = ((numero/100)%10)*100;
        u_milhar = ((numero/1000)%10)*1000;

        System.out.println("Valor decomposto: " + numero);
        System.out.println(u_milhar);
        System.out.println(centena);
        System.out.println(dezena);
        System.out.println(unidade);
    }
}

