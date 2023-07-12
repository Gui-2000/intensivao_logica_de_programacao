package colections_streams.exerciciosStream;


import java.util.ArrayList;
import java.util.List;

public class exercicio11 {
    //11:Retorna o primeiro elemento da coleção;
    public static void main(String[] args) {

        List<String> personagens = new ArrayList<>();

        personagens.add("Percy");
        personagens.add("Natsu");
        personagens.add("Deku");
        personagens.add("Annabeth");
        personagens.add("Tanjiro");
        personagens.add("Gohan");
        personagens.add("Yui");
        personagens.add("Ochako");
        personagens.add("Lucy");
        personagens.add("Deanerys");

        personagens.stream().findFirst().ifPresent(System.out::println);
    }
}

