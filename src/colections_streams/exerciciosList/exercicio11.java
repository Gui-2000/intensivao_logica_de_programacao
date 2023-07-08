package colections_streams.exerciciosList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class exercicio11 {
    //11:Limpa uma lista com metodo clear() retorna um boolean;
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

        livros.clear();
        System.out.println("A lista está vazia!: " + livros.isEmpty());

    }
}
