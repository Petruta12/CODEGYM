package collection;

import java.util.HashMap;
import java.util.Map;

public class Example2 {

    /*Create a HashMap<String, String>, and add 10 string pairs:
watermelon - melon,
banana - fruit,
cherry - fruit,
pear - fruit,
cantaloupe - melon,
blackberry - fruit,
ginseng - root,
strawberry - fruit,
iris - flower,
potato - tuber.
Display the contents of the collection, each element on a new line.*/

    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("watermelon" , "melon");
        map.put("banana", "fruit");
        map.put("cherry", "fruit");
        map.put("pear", "fruit");
        map.put("cantaloupe", "melon");
        map.put("blackberry", "fruit");
        map.put("ginseng", "root");
        map.put("strawberry", "fruit");
        map.put("iris", "flower");
        map.put("potato", "tuber");

        for(Map.Entry<String, String> text : map.entrySet()){

            String key = text.getKey();
            String value = text.getValue();

            System.out.println(key + " - " + value);
        }
    }
}


