package abstract_class;

public class Example4 {

    /*Make the Cow class inherit Animal.
Implement the Cow class's missing methods.*/

    public static void main(String[] args) {

    }

    public static abstract class Animal {

        public abstract String getName();
    }

    public static class Cow extends Animal{

        @Override
        public String getName(){
            return "Cow cow";
        }
    }

}

