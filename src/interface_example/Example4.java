package interface_example;

public class Example4 {
    /*We have public CanFly, CanRun, and CanSwim interfaces.
Add these interfaces to the Human, Duck, Penguin, and Airplane classes.*/

    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanRun, CanSwim{
        public void run(){

        }
        public void swim(){
        }
    }

    public class Duck implements CanSwim, CanFly,CanRun{

        public void swim(){

        }
        public void fly(){

        }

        public void run(){

        }
    }

    public class Penguin implements CanSwim,CanRun {

        public void swim(){

        }


        public void run(){

        }
    }

    public class Airplane implements CanRun,CanFly{
        public void run(){
        }

        public void fly(){
        }
    }
}
