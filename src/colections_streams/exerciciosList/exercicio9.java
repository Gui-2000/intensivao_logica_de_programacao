package colections_streams.exerciciosList;

import java.util.ArrayList;
import java.util.List;

public class exercicio9 {
    //9: retorna o indice de uma lista com o metodo indexOf(elemento);
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

        int existeLivro = livros.indexOf("Cem Anos de Solidão");
        System.out.println("Existe um livro na lista pós Cem Anos de Solidão!: " + existeLivro);

    }
}
