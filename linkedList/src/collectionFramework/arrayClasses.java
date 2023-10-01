package collectionFramework;

import java.util.Arrays;

public class arrayClasses {
    public static void main(String[] args) {
        int arr[]={2,5,2,5,3,2,6,7,2,1,8,6,4};
        boolean[] arr1=new boolean[5];

        for (int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
        Arrays.sort(arr); //////sorting arrays
        for(int val:arr){
            System.out.print(val+" ");
        }

        System.out.println();
        System.out.println(Arrays.binarySearch(arr,4));

        Arrays.fill(arr1,true);
        for (boolean val:arr1){
            System.out.print(val+" ");
        }
    }
}
