package colections_streams.exerciciosStream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercicio5 {
    //5:"Retorna elementos (nome com seu respectivo total de caracteres);
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

        System.out.println(personagens.stream().map(personagem -> personagem.concat(" -> ").concat(String.valueOf(personagem.length()))).collect(Collectors.toList()));

    }
}

