package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Example5 {

    /*There is a HashMap<String, String>. 10 different strings have been added to it.
Display a list of values on the screen, each element on a new line.*/


    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printValues(map);
    }

    public static void printValues(Map<String, String> map) {

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            // Get a key-value pair
            Map.Entry<String, String> pair = iterator.next();

            String key = pair.getKey();            // Key
            String value = pair.getValue();     // Value
            System.out.println(key + " " + value);

        }
    }
}




