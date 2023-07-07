package colections_streams.exerciciosList;

import java.util.LinkedList;
import java.util.List;

public class exercicio1 {
    //1: adicionei 10 nomes na lista e imprima;
    public static void main(String[] args) {

        List<String> herois = new LinkedList<>();
        //Usei o Linked porque é mais apropriado para inserção.

        herois.add("Homem-Aranha");
        herois.add("Batman");
        herois.add("Flash");
        herois.add("Superman");
        herois.add("Homem-De-Ferro");
        herois.add("Capitão-America");
        herois.add("Mulher-Maravilha");
        herois.add("Zatanna");
        herois.add("Feiticeira-Escalarte");
        herois.add("Viuva-Negra");

        System.out.println(herois);
    }
}
