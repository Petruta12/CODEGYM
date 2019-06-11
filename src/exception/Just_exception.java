package exception;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class Just_exception {

    /*The method throws two exceptions that inherit Exception, and two exceptions that inherit RuntimeException:
NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.

You need to catch NullPointerException and FileNotFoundException, but not catch ArithmeticException or URISyntaxException.
How do you do that?*/

    public static void main(String[] args) throws Exception {
        //write your code here
        try{
            method1();

        }
        catch (NullPointerException b){
            System.out.print("NullPointerException");
        }
        catch (FileNotFoundException v){
            System.out.print("FileNotFoundException");
        }
    }



    public static void method1() throws Exception {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new NullPointerException();
        if (i == 1)
            throw new ArithmeticException();
        if (i == 2)
            throw new FileNotFoundException();
        if (i == 3)
            throw new URISyntaxException("", "");
    }
}

