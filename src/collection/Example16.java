package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example16 {

    /*1. Use the keyboard to enter the number N.
2. Read N integers and put them in a list: the getIntegerList method.
3. Find the minimum among the list items: the getMinimum method.*/

    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {

        int min = Collections.min(array);
        return min;
    }

    public static List getIntegerList() throws IOException {
        // Create and initialize a list here
        List list=new ArrayList<>();
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int n = Integer.parseInt(br.readLine());
        for (int i=1;i<=n;i++)
            list.add(Integer.parseInt(br.readLine()));
        return list;
    }
}