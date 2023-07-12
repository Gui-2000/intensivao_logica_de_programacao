package colections_streams.exerciciosStream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercicio6 {
    //6:"retorna os 3 primeiros elementos de uma coleção;
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

        System.out.println("Os 3 primeiros personagens: " + personagens.stream().limit(3).collect(Collectors.toList()));

    }
}

