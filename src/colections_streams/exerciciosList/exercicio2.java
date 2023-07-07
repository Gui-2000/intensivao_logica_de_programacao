package colections_streams.exerciciosList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class exercicio2 {
    //1: Imprimir a Lista em Ordem Alfabetica com Interface Collections eo metodo Sort;
    public static void main(String[] args) {

        List<String> animes = new ArrayList<>();

        animes.add("Fairy-Tail");
        animes.add("Naruto");
        animes.add("Shingeki No Kojin");
        animes.add("Dragon Ball Z");
        animes.add("Haikyuu");
        animes.add("YuYu Hakusho");
        animes.add("Cavaleiros do Zodiaco");
        animes.add("Boku no hero");
        animes.add("Kimetsu no Yaiba");
        animes.add("Bleach");

        Collections.sort(animes);
        System.out.println(animes);
    }
}
