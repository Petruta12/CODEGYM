package javasintax;

public class Solution {
/*In the main method, place plus and minus signs correctly so that the variable result is equal to 20.
Signs must be placed only in the line where the variable result is declared.
Do not change the order of the variables in this line.
Each variable must be preceded by either a plus or minus sign.*/

    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;

    public static void main(String[] args) {

        int result = +a + b + c + d;

        System.out.println(result);


        /*Change the program so that the variable name has the value "Amigo".*/
        String name = "Ellie";
        String text = "Hello, " + name + "!";
        System.out.println(text);

        /*Change the program to display the following text:
          Coding in Java
          Use variables.*/

        String s1 = "Coding";
        String s2 = "in";
        String s3 = "Pascal";
        System.out.println(s1 + " " + s2 + " " + s3);



    }
}
