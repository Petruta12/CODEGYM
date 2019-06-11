package collection;

import java.util.HashSet;
import java.util.Set;

public class Example7 {

    /*You need to create a Set<String> and add 20 words that start with the letter "L".*/
    public static Set<String> createSet() {
        //write your code here
        HashSet<String> s = new HashSet<String>();

        for (int i=0; i<20; i++){

            s.add("Llll" +i);
        }
        return s;


    }

    public static void main(String[] args) {

    }
}


