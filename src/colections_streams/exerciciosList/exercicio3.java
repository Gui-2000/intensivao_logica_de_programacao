package colections_streams.exerciciosList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exercicio3 {
    //3: Atualizar uma lista com  metodo set(Int, String);
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

        System.out.println(animes);
        System.out.println("*************************************************");
        animes.set(6, "Death-Note");
        System.out.println(animes);

    }
}
