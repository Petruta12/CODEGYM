package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example13 {

    /*. Inside the Solution class, create a public static Cat class.
2. Implement the createCats method. It must create a Set of cats and add 3 cats to it.
3. In the main method, remove one cat from Set cats.
4. Implement the printCats method. It should display all the cats that remain in the set.
Each cat on a new line.*/

    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //write your code here. step 3
        Iterator<Cat> itr = cats.iterator();
        while(itr.hasNext()) {
            cats.remove(itr.next());
            break;
        }
        printCats(cats);

    }

    public static Set<Cat> createCats() {
        //write your code here. step 2
        Set<Cat> set = new HashSet<Cat>();
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4
        for(Cat cat : cats)
            System.out.println(cat);

    }

    // step 1
    public static class Cat {
        Cat(){

        }

    }
}


