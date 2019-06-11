package interface_example;

public class Example3 {
    /*The public CanFly, CanMove, and CanEat interfaces have already been written.
Add these interfaces to the Dog, Car, Duck, and Airplane classes.*/

    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat {

        public void move(){
        }


        public void eat(){

        }
    }

    public class Duck implements CanFly, CanEat, CanMove{


        public void eat(){
        }
        public void move(){

        }
        public void fly(){

        }
    }

    public class Car implements CanMove {
        public void move(){
        }

    }


    public class Airplane implements CanFly, CanMove{

        public void move(){

        }
        public void fly(){
        }
    }
}




