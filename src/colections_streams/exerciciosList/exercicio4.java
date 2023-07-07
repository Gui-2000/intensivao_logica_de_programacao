package colections_streams.exerciciosList;

import java.util.ArrayList;
import java.util.List;

public class exercicio4 {
    //4: Excluindo com o metodo remove(Int) ";
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

        System.out.println(filmes);
        System.out.println("*************************************************");
        filmes.remove(8);
        System.out.println(filmes);

    }
}
