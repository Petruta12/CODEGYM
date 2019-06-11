package collection;

import java.util.HashMap;
import java.util.Map;

public class Example3 {

    /*There is a Cat class with a String name.
Create a HashMap<String, Cat>.
Add 10 cats to the collection. The cat's name should be used as the key.
Display the result on the screen, each element on a new line.*/

    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"Tiger", "Missy", "Smokey", "Marmalade", "Oscar", "Snowball", "Boss", "Smudge", "Max", "Simba"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats) {
        //write your code here
        HashMap<String, Cat> map = new HashMap<String, Cat>();

        /*
        for(String x: cats)
        {
            map.put(cats.get(x) cats[x], x);//
            //new HashMap<x, Cat()>(); //
        }
       */
        for (int i = 0; i < cats.length; i++) {

            // System.out.println(cats[i]);

            String key = cats[i];
            map.put(key, new Cat(key));
        }

        return map;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }

}

