package exception;

import java.util.ArrayList;

public class Exception_list {

    /*Catch (and display the type of) the exception that occurs when the following code is executed:
ArrayList<String> list = new ArrayList<String>();
String s = list.get(18);*/
    public static void main(String[] args) throws Exception {
        //write your code here
        try{
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);

            //write your code here
        } catch(IndexOutOfBoundsException c){
            System.out.println("IndexOutOfBoundsException");
        }
    }
}