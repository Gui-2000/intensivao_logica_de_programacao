package desafiosSupera;

import java.util.*;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        int countX = 0;
        int x;
        int n;

        do {
            System.out.println("Digite o valor de linhas: (0 ou numero negativo não serão aceitos)");
            n = sc.nextInt();
        } while (n <= 0);

        System.out.println("Digite o valor de entrada para cada linha (O número deve ser inteiro e positivo): ");
        while (countX != n) {
            x = sc.nextInt();
            while (x <= 0) {
                System.out.print("Numero 0 ou Negativo não é permitido, digite outro:");
                x = sc.nextInt();
            }
            numeros.add(x);
            countX++;
        }

        for (int y : numeros) {
            if (y % 2 == 0) {
                pares.add(y);
            }
            if (y % 2 != 0) {
                impares.add(y);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        System.out.println("Numeros da lista: " + numeros);
        System.out.println("Numeros pares da lista em ordem crescente: " + pares);
        System.out.println("Numeros impares da lista em ordem decrescente: " + impares);
        sc.close();
    }
}


