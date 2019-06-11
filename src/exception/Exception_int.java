package exception;

public class Exception_int {


public static void main(String[]args) throws Exception{


    /*Catch the exception that occurs when the following code is executed:
int a = 42 / 0;
Display the type of exception caught.*/

    try{
        int a = 42 / 0;
    }
    catch (ArithmeticException e){
        System.out.print("ArithmeticException");


    }

}




        }

