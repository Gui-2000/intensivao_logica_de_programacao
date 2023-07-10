package colections_streams.exerciciosMap;

import java.util.HashMap;
import java.util.Map;

public class exercicio6 {
    //6:retorna o tamanho do map metodo size();
    public static void main(String[] args) {

        Map<String, Integer> livros = new HashMap<>();

        livros.put("Percy Jackson", 5);
        livros.put("Harry Potter", 7);
        livros.put("Divergente", 4);
        livros.put("Crepúsculo", 5);
        livros.put("Cronicas de Narnia", 7);
        livros.put("A Song of Ice and Fire", 6);

        System.out.println("Qual tamanho do map? " + livros.size());
    }
}

