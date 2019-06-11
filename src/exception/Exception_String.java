package exception;

public class Exception_String {

    /*Catch (and display the type of) the exception that occurs when the following code is executed:
String s = null;
String m = s.toLowerCase();*/


    public static void main(String[] args) throws Exception {
        //write your code here
        try{
            String s = null;
            String m = s.toLowerCase();

            //write your code here
        } catch(NullPointerException e){
            System.out.println("NullPointerException");
        }

    }
}


