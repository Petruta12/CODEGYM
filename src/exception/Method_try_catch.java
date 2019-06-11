package exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Method_try_catch {

    /*Write a program that will read numbers from the keyboard.
The code for reading numbers from the keyboard must be in the readData method.
Wrap the code inside readData in a try-catch block.
If the user enters text instead of a number, then the method should catch an exception and then display all previously entered numbers.
Display each number on a new line in the same order it was entered.*/

    public static void main(String[] args) {
        readData();
    }

    public static void readData() {


        ArrayList<Integer> password = new ArrayList<>();

        try {
            Thread.sleep(1000);


            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int YourInput;

            while (true)
            {
                YourInput = Integer.parseInt(bufferedReader.readLine());
                password.add(YourInput);
            }

        }
        catch (Exception e)
        {
            for (int i: password
            ) {
                System.out.println(i);
            }

        }
    }


}


