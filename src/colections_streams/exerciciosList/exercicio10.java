package colections_streams.exerciciosList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class exercicio10 {
    //10:iterar (navegar) sobre uma lista com iterator;
    public static void main(String[] args) {

        List<String> livros = new ArrayList<>();

        livros.add("Percy-Jackson");
        livros.add("1984");
        livros.add("O Pequeno Principe");
        livros.add("O Conde de Monte Cristo");
        livros.add("Harry Poter");
        livros.add("Cem Anos de Solidão");
        livros.add("O Senhor dos Aneis");
        livros.add("Em Busca Do Tempo Perdido");
        livros.add("Odisseia");
        livros.add("Alice no País das Maravilhas");

        int i = 1;
        Iterator<String> it = livros.iterator();
        while (it.hasNext()){
            System.out.println("Livro numero" + i + " : " + it.next());
            i++;
        }

    }
}
