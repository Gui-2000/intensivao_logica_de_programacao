package colections_streams.exerciciosList;

import java.util.ArrayList;
import java.util.List;

public class exercicio8 {
    //8: verifca se a lista está vazia metodo isEmpty() retorna um boolean;
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

        boolean listaEstaVazia = livros.isEmpty();
        System.out.println("Lista está vazia!: " + listaEstaVazia);

    }
}
