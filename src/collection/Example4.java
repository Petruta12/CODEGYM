package collection;

import java.util.HashMap;
import java.util.Map;

public class Example4 {
    /*There is a HashMap<String, String>. 10 different strings have been added to it.
Display a list of keys on the screen, each element on a new line.*/

    private static String pair;

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

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map) {
        //write your code here

        for (Map.Entry<String,String> pair : map.entrySet()  ) {
            System.out.println(pair.getKey());

        }
    }
}


