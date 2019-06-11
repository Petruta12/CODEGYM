package abstract_class;

public class Example5 {
    /*Make the Cat and Dog classes inherit Pet.
Implement the missing methods.
The Cat and Dog classes should not be abstract.*/

    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet{
        @Override
        public String getName(){
            return "";

        }


        @Override
        public Pet getChild(){
            return null;
        }
    }

    public static class Dog extends Pet {

        @Override
        public String getName(){
            return "";

        }


        @Override
        public Pet getChild(){
            return null;

        }

    }

}
