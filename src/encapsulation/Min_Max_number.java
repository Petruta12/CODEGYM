package encapsulation;

public class Min_Max_number {

    /*Write a method which returns the minimum and maximum numbers of an array.*/
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        int min = array[0],mi=0;
        int max = array[0],mx=0;
        for(int i = 1;i<array.length;i++){
            if(array[i]>max){
                max = array[i];mx=i;
            }
            if(array[i]<min){
                min = array[i];mi=i;
            }
        }

        return new Pair<Integer, Integer>((Integer)array[mi], (Integer)array[mx]);

    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
