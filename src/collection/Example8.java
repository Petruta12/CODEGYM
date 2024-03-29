package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Example8 {

    /*Create a set of numbers (Set<Integer>) and add 20 different numbers to it.
Remove from the set all numbers greater than 10 .*/

    public static HashSet<Integer> createSet() {
        // write your code here
        HashSet<Integer> set=new HashSet<Integer>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(19);
        set.add(20);
        //  removeAllNumbersGreaterThan10(set);
        return set;

    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // write your code here
        //  HashSet<Integer> setA = Solution.createSet();

        for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();){
            Integer r =  iterator.next();
            if(r>10)
                iterator.remove();
        }

        return set;

    }

    public static void main(String[] args) {

    }
}

