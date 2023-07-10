package colections_streams.exerciciosMap;

import java.util.TreeMap;

public class exercicio13 {
    //usando o treeMap;
    //13:Retorna o sucessor da arvore passada como referencia no parametro metodo higherKey(referencia);
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

        System.out.println("A Serie que suceder Stranger Things é: " + protagonistasDasSeries.higherKey("Stranger Things"));
    }
}

