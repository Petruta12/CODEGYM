package abstract_class;

public class Example2 {
    /*Correct the code so the program will compile.

Hint:
The getChild method must remain abstract.*/

    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "I'm a kitten";
        }

        public abstract Pet getChild();
    }
}
