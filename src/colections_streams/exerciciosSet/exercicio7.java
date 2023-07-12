package colections_streams.exerciciosSet;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class exercicio7 {
    //7: imprama o SET sem repitir o numero, usando o interator;
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

        Iterator<Integer> it = sequenciaNumerica.iterator();
        while (it.hasNext()){
            System.out.println("valor: "+ it.next());
        }
        // SET nao aceita repetições, por isso 8 e 7 não foram imprimidos uma segunda vez
    }
}

