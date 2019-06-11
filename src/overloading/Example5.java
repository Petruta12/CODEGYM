package overloading;

public class Example5 {

    /*Write the following public static methods: int max(int, int), long max(long, long), double max(double, double).
Each method must return the maximum of the two numbers passed to it.*/

    public static void main(String[] args) {

    }

    //write your code here
    public static int max(int a, int b){

        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static long max(long a, long b){

        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    public static double max(double a, double b){

        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}

