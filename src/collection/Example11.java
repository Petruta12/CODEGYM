package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Example11 {

    /*Create a Map<String, String> and add ten entries that represent (last name, first name) pairs.
Remove people with the same first name*/

    public static HashMap<String, String> createMap() {
        HashMap<String, String> namen = new HashMap<>();
        namen.put("thom", "de r");
        namen.put("thomasa", "de zr");
        namen.put("thomasz", "de zter");
        namen.put("thomase", "e zer");
        namen.put("thomasr", "d zier");
        namen.put("thomast", "de zser");
        namen.put("thomasy", "dttser");
        namen.put("thomasu", "de ztter");
        namen.put("thomasi", "de zistr");
        namen.put("thomaso", "de zer");

        return namen;
        //write your code here

    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        Iterator<Map.Entry<String, String>> map1 = copy.entrySet().iterator();

        int counter = 0; // add

        while (map1.hasNext()) {
            String value1 = map1.next().getValue();
            Iterator<Map.Entry<String, String>> map2 = copy.entrySet().iterator();
            while (map2.hasNext()){
                String value = map2.next().getValue();
                if (value1.equals(value)){  // change
                    if(counter > 0){ // add
                        removeItemFromMapByValue(map, value);
                        break; // add
                    }
                    counter++;  // add
                }
            }
            counter = 0; // add
        }
    }


    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}

