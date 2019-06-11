package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Example6 {

    /*There is a HashMap<String, Object>. 10 different object pairs have been added to it.
Display the contents of the collection, each element on a new line.*/

    public static void main(String[] args) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            // Get a key-value pair
            Map.Entry<String, Object> pair = iterator.next();

            String key = pair.getKey();            // Key
            Object value = pair.getValue();     // Value
            System.out.println(key + " - " + value);

            //write your code here
      /*  for(Map.Entry<String,String> p:map.entrySet()){
            String key=p.getKey();
            String value=p.getValue();
            System.out.println(key+"-"+value); */

        }
    }
}

