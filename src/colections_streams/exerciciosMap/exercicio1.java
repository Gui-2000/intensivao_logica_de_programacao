package colections_streams.exerciciosMap;

import java.util.HashMap;
import java.util.Map;

public class exercicio1 {
    //1:Atualizar valor da chave com metodo put(chave, valor a atualizar);
    public static void main(String[] args) {

        Map<String, Integer> livros = new HashMap<>();

        livros.put("Percy Jackson", 5);
        livros.put("Harry Potter", 7);
        livros.put("Divergente", 4);
        livros.put("Crepúsculo", 5);
        livros.put("Cronicas de Narnia", 7);
        livros.put("A Song of Ice and Fire", 6);

        System.out.println(livros);
        System.out.println("**********************************");

        System.out.println("Percy Jackson ganhara um novo livro em 2024");
        livros.put("Percy Jackson", 6);
        System.out.println(livros);
    }
}

