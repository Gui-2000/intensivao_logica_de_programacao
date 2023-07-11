package colections_streams.exerciciosMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class exercicio20 {
    //usando o treeMap;
    //20:Navegando com foreach nos protagonista com Entry;
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

        for(Map.Entry<String, String> series: protagonistasDasSeries.entrySet()){
            System.out.println(series.getKey() + " -- "+ series.getValue());
        }
    }
}

