package exception;

public class Exception_group {

    /*1. There are three exceptions that successively inherit Exception.
2. The Exception1 class extends Exception
3. The Exception2 class extends Exception1
4. The Exception3 class extends Exception2
5. There is a method with the following signature:
public static void method1() throws Exception1, Exception2, Exception3
6. Write a catch block that will catch all three exceptions: Exception1, Exception2, and Exception3*/

    public static void main(String[] args) throws Exception {
        //write your code here
        try{
            method1();

            //write your code here

        } catch (Exception s){
            System.out.println("Exception");

        }
    }

    public static void method1() throws Exception1, Exception2, Exception3 {
        int i = (int) (Math.random() * 3);
        if (i == 0)
            throw new Exception1();
        if (i == 1)
            throw new Exception2();
        if (i == 2)
            throw new Exception3();
    }
}

class Exception1 extends Exception {
}

class Exception2 extends Exception1 {
}

class Exception3 extends Exception2 {
}


