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

        int[] a={1,2,3,3,2,1,-4,0};
        int[] dp=new int[6];

        System.out.println();
        System.out.println("----------Revision----------");
        //forEach
        for(int val:dp){
            System.out.print(val+" ");
        }
        //fill
        Arrays.fill(dp,-1);
        System.out.println();
        for(int val:dp) System.out.print(val+" ");
        System.out.println();
        for(int val:a) System.out.print(val+" ");
        ///sort
        Arrays.sort(a);
        System.out.println();
        for(int val:a) System.out.print(val+" ");
        ////binarySearch
        System.out.println(Arrays.binarySearch(arr,8));

    }
}
