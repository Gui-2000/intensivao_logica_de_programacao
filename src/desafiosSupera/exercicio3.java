package desafiosSupera;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        int numero1;

        int numerosDeParesAlvo = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do array:" );
        int n = sc.nextInt();
        List<Integer> numeros = new ArrayList<>();

        System.out.print("digite os valores do array: ");
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            numeros.add(x);
        }

        System.out.println("Digite o valor alvo: ");
        int valorAlvo = sc.nextInt();

        Collections.sort(numeros, Collections.reverseOrder());

        numero1 = 0;
        for (int y  : numeros) {
            if (numeros.get(numero1) - numeros.get(numero1 + 1) == valorAlvo) {
                numerosDeParesAlvo++;
            }
        }

        System.out.println(numerosDeParesAlvo);

        sc.close();;
    }
}


