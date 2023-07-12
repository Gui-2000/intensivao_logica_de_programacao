package colections_streams.exerciciosSet;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class exercicio6 {
    //6: imprama o SET sem repitir o numero;
    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(3);
        sequenciaNumerica.add(5);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(7);
        sequenciaNumerica.add(10);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(7);
        sequenciaNumerica.add(6);
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(9);

        System.out.println("valores : " + sequenciaNumerica);
        // SET nao aceita repetições, por isso 8 e 7 não foram imprimidos uma segunda vez
    }
}

