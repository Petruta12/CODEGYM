package overloading;

public class Example4 {
    /*Write the following public static methods: int min(int, int), long min(long, long), double min(double, double).
Each method must return the minimum of the two numbers passed to it.*/


    public static void main(String[] args) {

    }

    //write your code here

    public static int min(int a, int b){

        if(a<b){
            return a;
        }else{
            return b;
        }
    }

    public static long min(long x, long y){

        if(x<y){
            return x;
        }else{
            return y;
        }
    }

    public static double min(double x, double y){

        if(x<y){
            return x;
        }else{
            return y;
        }
    }
}

