package collection;

import java.util.HashMap;
import java.util.Map;

public class Example12 {

    /*Create a Map<String, Integer> and add ten entries that represent (last name, salary) pairs.
Remove from the map all people whose salary is below 500.*/

    public static HashMap<String, Integer> createMap() {

        HashMap<String, Integer> list = new HashMap<>();

        list.put("Alex",4500);
        list.put("Satewa",7900);
        list.put("Mach", 2000);
        list.put("Ouem", 500);
        list.put("Guansou", 270);
        list.put("Picaho", 100);
        list.put("Ramakant", 10000);
        list.put("Joy", 499);
        list.put("Cindy", 2000);
        list.put("Sean", 376);

        return list;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
                removeItemFromMap(map);
                break;
            }

        }
    }

    public static void main(String[] args) {



    }
}

