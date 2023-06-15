package listDeAtividade2;

import java.util.Random;

public class atividade2 {
    // 2. Escreva um algoritmo que leia a quantidade de combustível abastecido em um automóvel
    //em litros, bem como, a distância que o automóvel percorre por litro abastecido. O
    //algoritmo deverá calcular e mostrar a distância máxima que o automóvel poderá atingir.
    public static void main(String[] args) {

        Random ram = new Random();
        int gasolinaLitros = ram.nextInt(90, 92);
        int distanciaPorLitro = ram.nextInt(3, 5);

        int distânciaMaxima = (int) distanciaPecorridaPorTanqueCheio(gasolinaLitros, distanciaPorLitro);

        System.out.println(distânciaMaxima);
    }

    public static double distanciaPecorridaPorTanqueCheio(int litrosTotal, int distanciaPorLitro) {
        int distancia = (litrosTotal * distanciaPorLitro) / 1;
        return distancia;
    }
}
