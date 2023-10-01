import arraysOperation.*;
import java.util.Scanner;

public class countSort {

    static void basicCountSort(int[] array){
        ///find max element present in the given array

        int max=Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){
            if (max<array[i]){
                max=array[i];
            }
        }
        ////finding occurrence of an element and storing in a freq array
        int[] freq=new int[max+1];

        for (int i=0;i<array.length;i++){
            freq[array[i]]++;
        }
        /////
        int k=0;
        for (int i=0;i<freq.length;i++){
            for (int j=0;j<freq[i];j++){
                array[k++]=i;
            }
        }
    }

    static int[] countSort(int[] array){
        ///find max element present in the given array

        int max=Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){
            if (max<array[i]){
                max=array[i];
            }
        }
        ////finding occurrence of an element and storing in a freq array
        int[] freq=new int[max+1];

        for (int i=0;i<array.length;i++){
            freq[array[i]]++;
        }
        /////prefix sum array to maintain the stability of array

        for (int i=1;i<freq.length;i++){
            freq[i]+=freq[i-1];
        }
/////////////finding index with the help of ps array
        int[] carr=new int[array.length];
        for (int i=array.length-1;i>=0;i--) {
            int idx = freq[array[i]] - 1;
            carr[idx] = array[i];
            freq[array[i]]--; 
        }
        return carr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        arraysOperation aO=new arraysOperation();
        int[] array={2,5,6,3,2,5,1};

        aO.displayA(array);
        System.out.println(" ");
        array=countSort(array);
        aO.displayA(array);
//        basicCountSort(array);
//        aO.displayA(array);

    }
}
