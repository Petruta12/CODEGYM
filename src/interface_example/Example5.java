package interface_example;

public class Example5 {

    /*Write a public Human class, and public CanRun and CanSwim interfaces.
Add one method to each interface.
Add these interfaces to the Human class, but do not implement the methods.
Declare the Human class as abstract*/

    public static void main(String[] args) {

    }

    // Add public interfaces and a public class here

    public interface CanRun{
        public void run();
    }

    public interface CanSwim{
        public void swim();
    }

    public abstract class Human implements CanRun, CanSwim{


    }
}

