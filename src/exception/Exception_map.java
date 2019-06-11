package exception;

import java.util.HashMap;

public class Exception_map {

    /*Catch (and display the type of) the exception that occurs when the following code is executed:
HashMap<String, String> map = new HashMap<String, String>(null);
map.put(null, null);
map.remove(null);

*/

    public static void main(String[] args) throws Exception {
        //write your code here
        try{
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);

            //write your code here
        }
        catch(NullPointerException c){
            System.out.println("(NullPointerException");
        }
    }
}

