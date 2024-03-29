package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example2 {

    /*Using an ArrayList and LinkedList, perform 10,000 insertions, deletions, and get and set calls.*/

    public static void main(String[] args) throws Exception {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        //write your code here
        for(int i=0; i<10000; i++){
            list.add(i);
        }

    }

    public static void get10000(List list) {
        //write your code here
        for(int i=0; i<10000; i++){
            list.get(i);
        }

    }

    public static void set10000(List list) {
        //write your code here
        for(int i=0; i<10000; i++){
            list.set(i, "");
        }

    }

    public static void remove10000(List list) {
        //write your code here
        for(int i=0; i<list.size();){
            list.remove(i);
        }

    }
}



