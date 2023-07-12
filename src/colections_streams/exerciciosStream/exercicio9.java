package colections_streams.exerciciosStream;


import java.util.ArrayList;
import java.util.List;

public class exercicio9 {
    //9:Todos os elementos possuem a letra M no nome?;
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

        System.out.println("Todos os elementos possuem a letra M no nome? " + personagens.stream().allMatch(elemento -> elemento.contains("m")));

    }
}

