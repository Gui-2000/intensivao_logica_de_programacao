package colections_streams.exerciciosList;

import java.util.ArrayList;
import java.util.List;

public class exercicio5 {
    //5: Buscando um valor com o metodo get(Int) ";
    public static void main(String[] args) {

        List<String> filmes = new ArrayList<>();

        filmes.add("Guerra-Ifinita");
        filmes.add("Ultimato");
        filmes.add("Titanic");
        filmes.add("Star-Wars");
        filmes.add("Harry Poter");
        filmes.add("Velozes e Furiosos");
        filmes.add("Jonh Wick");
        filmes.add("Missão Impossivel");
        filmes.add("Identidade Bourne");
        filmes.add("Matrix");

        String melhorFilme = filmes.get(1);
        System.out.println("O melhor filme da lista é: " + melhorFilme);

    }
}
