package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Example1 {

    /*Create a HashSet with String elements.
Add 10 strings to it:
watermelon
banana
cherry
pear
cantaloupe
blackberry
ginseng
strawberry
iris
potato

Display the contents of the collection, each element on a new line.
Watch how the order of the entries has changed.*/

    public static void main(String[] args) throws Exception {
        //write your code here

        HashSet<String> set = new HashSet<String>();

        set.add("watermelon");
        set.add("banana");
        set.add("cherry");
        set.add("pear");
        set.add("cantaloupe");
        set.add("blackberry");
        set.add("ginseng");
        set.add("strawberry");
        set.add("iris");
        set.add("potato");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())
        {
            String text = iterator.next();
            System.out.println(text);
        }

    }
}

