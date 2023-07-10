package colections_streams.exerciciosMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class exercicio3 {
    //3:busca se existe ou nao um valor metodo containerKey(chave);
    public static void main(String[] args) {

        Map<String, Integer> livros = new HashMap<>();

        livros.put("Percy Jackson", 5);
        livros.put("Harry Potter", 7);
        livros.put("Divergente", 4);
        livros.put("Crepúsculo", 5);
        livros.put("Cronicas de Narnia", 7);
        livros.put("A Song of Ice and Fire", 6);

        System.out.println("Existe a saga Crepúsculo no map! " + livros.containsKey("Crepúsculo"));
        System.out.println("Existe a saga Senhor dos Aneis no map! " + livros.containsKey("Senhor dos Aneis"));
    }
}

