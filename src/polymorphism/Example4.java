package polymorphism;

public class Example4 {
    /*Write a method which determines the class type of the
    object you pass into it, and then displays on the screen the
    corresponding message: Cat, Dog, Bird, and Lamp.*/

    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //write your code here
        System.out.println(o.getClass().getSimpleName());
    }

    public static class Cat {

    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}

