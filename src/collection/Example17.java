package collection;

import java.util.ArrayList;

public class Example17 {

    /*1. Create a Human class with String name, boolean sex, int age, and ArrayList<Human> children fields.
2. Create and populate objects so that we end up with: two grandfathers, two grandmothers, one father, one mother, and three children.
3. Display all the Human objects (Hint: use the Human class's toString() method).*/


    public static void main(String[] args) {
        //write your code here
        ArrayList<Human> children1 = new ArrayList<>();
        ArrayList<Human> children2 = new ArrayList<>();
        ArrayList<Human> children3 = new ArrayList<>();

        Human child1 = new Human("Child1", true, 8, null);
        Human child2 = new Human("Child2", false, 5, null);
        Human child3 = new Human("Child3", true, 2, null);

        children1.add(child1);
        children1.add(child2);
        children1.add(child3);

        Human father = new Human("Father", true, 56, children1);
        Human mother = new Human("Mother", false, 50, children1);

        children2.add(father);
        children3.add(mother);


        Human grandF1 = new Human("Gf1", true, 90, children2);
        Human grandF2 = new Human("Gf2", true, 92, children3);

        Human grandM1 = new Human("Gm1", false, 87, children2);
        Human grandM2 = new Human("Gm2", false, 89, children3);

        System.out.println(grandF1);
        System.out.println(grandF2);
        System.out.println(grandM1);
        System.out.println(grandM2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(children1);
        System.out.println(children2);
        System.out.println(children3);


    }

    public static class Human {
        //write your code here
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}

