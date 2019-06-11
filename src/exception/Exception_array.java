package exception;

public class Exception_array {

    /*Catch (and display the type of) the exception that occurs when the following code is executed:
int[] m = new int[2];
m[8] = 5;*/

    public static void main(String[] args) throws Exception {
        //write your code here
        try{
            int[] m = new int[2];
            m[8] = 5;

            //write your code here
        } catch(ArrayIndexOutOfBoundsException c){

            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}

