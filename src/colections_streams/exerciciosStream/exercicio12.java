package colections_streams.exerciciosStream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercicio12 {
    //12:Realize uma operação em cadeia;
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

        System.out.println("Operação Encadeada: ");
        System.out.println(personagens.stream()
                .peek(System.out::println)
                .map(personagem -> personagem.concat(" - ").concat(String.valueOf(personagem.length())))
                .peek(System.out::println)
                .filter((personagem) ->
                personagem.toLowerCase().contains("r"))
                .collect(Collectors.groupingBy(personagem -> personagem.substring(personagem.indexOf("-")))));
    }
}

