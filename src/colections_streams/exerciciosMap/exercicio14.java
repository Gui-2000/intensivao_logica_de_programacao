package colections_streams.exerciciosMap;

import java.util.TreeMap;

public class exercicio14 {
    //usando o treeMap;
    //14:Retorna o topo da arvore serie e protagonista;
    public static void main(String[] args) {

        TreeMap<String, String> protagonistasDasSeries = new TreeMap<>();

        protagonistasDasSeries.put("Suits", "Mike Ross");
        protagonistasDasSeries.put("Game Of Thores", "Jon Snow");
        protagonistasDasSeries.put("Peaky Blinders", "Tommy Shelby");
        protagonistasDasSeries.put("The Boys", "Bruto");
        protagonistasDasSeries.put("Stranger Things", "Eleven");
        protagonistasDasSeries.put("The Walking Dead", "Rick Grimes");
        protagonistasDasSeries.put("Bridgerton", "Daphne Bridgerton");
        protagonistasDasSeries.put("Vikings", "Ragnar");

        System.out.println("A Serie do topo é " + protagonistasDasSeries.firstEntry().getKey() + ", com protagonista " + protagonistasDasSeries.firstEntry().getValue());
    }
}

