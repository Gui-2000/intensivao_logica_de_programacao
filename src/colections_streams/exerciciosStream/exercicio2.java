package colections_streams.exerciciosStream;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class exercicio2 {
    //2:Retorna elemento com maior numero de letras;
    public static void main(String[] args) {

        List<String> personagens = new ArrayList<>();

        personagens.add("Percy");
        personagens.add("Natsu");
        personagens.add("Deku");
        personagens.add("Annabeth");
        personagens.add("Tanjiro");
        personagens.add("Gohan");
        personagens.add("Erza");
        personagens.add("Ochako");
        personagens.add("Lucy");
        personagens.add("Deanerys");

        System.out.println("O personagem com nome de maior letra é: " + personagens.stream().max(Comparator.comparing((String :: length))));
    }
}

