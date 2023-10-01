package arraysOperation;
public class arraysOperation {

    ///////////// to display array as output *************
    public static void displayA(int[] array){
        System.out.println("Output Array:");
        for(int val:array){
            System.out.print(val+" ");
        }
    }

    ///////////////finding maximum in an array ***********

    public static int arrayMax(int[] array){
        ///find max element present in the given array

        int max=Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){
            if (max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
    //////////////
    public static void main(String[] args) {

    }
}
