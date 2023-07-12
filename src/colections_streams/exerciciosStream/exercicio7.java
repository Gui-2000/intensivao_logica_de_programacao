package colections_streams.exerciciosStream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercicio7 {
    //7:"Retorna todos os elementoscom peek;
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

        System.out.println("Retorna todos os elementoscom peek: " + personagens.stream().peek(System.out::println).collect(Collectors.toList()));

    }
}

