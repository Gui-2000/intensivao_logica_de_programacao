package listaDeAtividade1;

import java.util.Random;

public class Atividade5 {
   // 5. Elabore um algoritmo que leia o valor do lado do quadrado e calcule a área. Em seguida,
    //calcule o dobro da área. Mostre a área e o dobro.

    public static void main(String[] args) {

        Random ram = new Random();

        int lado = ram.nextInt(1, 10);

        int area = lado * lado;
        // Um lado pode ser considerado altura da formula: A = b.h

        int areaDobro = area * 2;

        System.out.println("Valor lado: " + lado);
        System.out.println("Valor área: " + area);
        System.out.println("Valor do dobro da área: " + areaDobro);
    }
}
