package colections_streams.exerciciosList;

import java.util.ArrayList;
import java.util.List;

public class exercicio6 {
    //6: Buscando o tamanho da lista metodo size(lista);
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

        int numerosFilmes = filmes.size();
        System.out.println("A quantidade de filme da lista é: " + numerosFilmes);

    }
}
