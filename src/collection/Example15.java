package collection;

import java.util.HashMap;
import java.util.Map;

public class Example15 {
    /*1. Create a Map<String, String> and add 10 people represented by (last name, first name) pairs.
2. Among these 10 people, let there be people who share the same first names.
3. Among these 10 people, let there be people who share the same last names.
4. Display the contents of the Map on the screen.*/

    public static Map<String, String> createPeopleList() {

        Map<String, String> people = new HashMap<String, String>();
        people.put("Aaa", "Aaa");
        people.put("Aaa", "Aaa");
        people.put("Aaa", "Aaa");
        people.put("Aaa", "Aaa");
        people.put("Aaa", "Aaa");
        people.put("Aaa", "Aaa");
        people.put("Aaa", "Aaa");
        people.put("Aaa", "Aaa");
        people.put("Aaa", "Aaa");
        people.put("Aaa", "Aaa");
        return people;


    };

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }
}
