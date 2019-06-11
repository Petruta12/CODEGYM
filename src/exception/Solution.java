package exception;

public class Solution {

    /*There are four classes: MyException, MyException2, MyException3, and MyException4.
Inherit the classes so that you get any two checked exceptions and any two unchecked exceptions.*/

    public static void main(String[] args) {
    }

    static class MyException  extends Exception{

    }

    static class MyException2  extends RuntimeException{
    }

    static class MyException3  extends MyException{
    }

    static class MyException4  extends MyException2{
    }
}

