package colections_streams.exerciciosMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class exercicio19 {
    //usando o treeMap;
    //19:Navegando com interator nos protagonista com Entry;
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

        Iterator<String> iterator = protagonistasDasSeries.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " -- "+ protagonistasDasSeries.get(key));
        }
    }
}

