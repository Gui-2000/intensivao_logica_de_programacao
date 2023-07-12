package colections_streams.exerciciosStream;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class exercicio1 {
    //1:quantos elementos tem no stream;
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

        System.out.println("Tem " + personagens.stream().count() + " personagens na lista");
    }
}

