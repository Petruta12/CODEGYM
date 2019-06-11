package collection;

import java.util.HashMap;

public class Example9 {
    /*Create a Map<String, String> and add ten entries that represent (last name, first name) pairs.
Check how many people have the same first name or last name.*/

    public static HashMap<String, String> createMap() {
        HashMap<String, String> Map = new HashMap<String, String>();
        Map.put("kekSurname3", "kekName1");
        Map.put("kekSurname2", "kekName3");
        Map.put("kekSurnamfe3", "kekName3");
        Map.put("kekSurdname", "kekName");
        Map.put("kekSusrname5", "kekName5");
        Map.put("kekSuvrname", "kekName");
        Map.put("kekSucrname", "kekName");
        Map.put("kekSudrname8", "kekName8");
        Map.put("keksSurname", "kekName");
        Map.put("kehkSurname", "kekName");
        return Map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        int i = 0;
        for(String n : map.values())
            if(n.equals(name))
                i++;
        return i;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        int i = 0;
        for(String n : map.keySet())
            if(n.equals(lastName))
                i++;
        return i;
    }

    public static void main(String[] args) {

    }
}


