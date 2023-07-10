package colections_streams.exerciciosMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class exercicio2 {
    //2:busca um indice metodo get(chave);
    public static void main(String[] args) {

        Map<String, Integer> livros = new LinkedHashMap<>();

        livros.put("Percy Jackson", 5);
        livros.put("Harry Potter", 7);
        livros.put("Divergente", 4);
        livros.put("Crepúsculo", 5);
        livros.put("Cronicas de Narnia", 7);
        livros.put("A Song of Ice and Fire", 6);

        System.out.println("Quantidade de livros da saga Harry Potter? " + livros.get("Harry Potter"));
    }
}

