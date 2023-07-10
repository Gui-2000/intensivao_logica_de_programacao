package colections_streams.exerciciosMap;

import java.util.HashMap;
import java.util.Map;

public class exercicio4 {
    //4:remover um valor metodo remove(chave);
    public static void main(String[] args) {

        Map<String, Integer> livros = new HashMap<>();

        livros.put("Percy Jackson", 5);
        livros.put("Harry Potter", 7);
        livros.put("Divergente", 4);
        livros.put("Crepúsculo", 5);
        livros.put("Cronicas de Narnia", 7);
        livros.put("A Song of Ice and Fire", 6);

        System.out.println("Existe a saga Divergente no map! " + livros.containsKey("Divergente"));
        livros.remove("Divergente");
        System.out.println("Existe a saga Divergente no map! " + livros.containsKey("Divergente"));
    }
}

