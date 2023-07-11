package colections_streams.exerciciosMap;

import java.util.Map;
import java.util.TreeMap;

public class exercicio18 {
    //usando o treeMap;
    //18:Navegando nos protagonista com Entry;
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

        Map.Entry<String, String> firstEntry = protagonistasDasSeries.pollFirstEntry();
        Map.Entry<String, String> lastEntry = protagonistasDasSeries.pollLastEntry();
        System.out.println(firstEntry);
        System.out.println(lastEntry);

    }
}

