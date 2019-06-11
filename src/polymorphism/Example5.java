package polymorphism;

public class Example5 {

    /*Write a method that will determine the class of an object passed to it,
    and returns one of the following values: "Cow", "Whale", "Dog", or "Unknown Animal".*/

    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        if (o instanceof Cow){
            return "Cow";
        }
        else if (o instanceof Dog){
            return "Dog";
        }
        else if (o instanceof Whale){
            return "Whale";
        }
        else {
            return "Unknown Animal";
        }//write your code here

    }
    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}

