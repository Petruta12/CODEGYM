package exception;

public class Exception_numbers {

    /*Catch (and display the type of) the exception that occurs when the following code is executed:
int num = Integer.parseInt("XYZ");
System.out.println(num);*/

    public static void main(String[] args) throws Exception {
        //write your code here
        try{
            int num = Integer.parseInt("XYZ");
            System.out.println(num);

            //write your code here
        } catch(NumberFormatException v){
            System.out.println("NumberFormatException");
        }
    }
}

