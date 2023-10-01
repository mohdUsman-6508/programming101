import java.util.Scanner;

import twoD_array.*;
public class aStep {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        ////////////input original array
        System.out.println("enter "+n+" elements");
        for (int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        ////////////////

        int[][] arr2=new int[n][n];
       ///////array possibilities
        for (int i=0;i<arr2.length;i++){
            for (int j=0;j<arr2.length;j++){
                arr2[i][j]=Math.abs(arr1[j]-arr1[i]);
            }
        }
        ////////////////////////////

        twoD_Array ta=new twoD_Array();
        ta.printArray(arr2);

        ////////////////////////////finding less than and equal to 2
        int count=0;
        for (int i=0;i<arr2.length;i++){
            for (int j=0;j<arr2[0].length;j++){
                if (arr2[i][j]<=2){
                    count++;
                }
            }
            /////counting possible cases
            arr1[i]=count;
            count=0;
        }
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("");
        /////////////////////////finding answer min

        ////////////////////////////// max

///////////////////////////////final answer
        System.out.println(min(arr1)+","+max(arr1));

    }

    static int max(int[] arr1) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if (max < arr1[i]) {
                max = arr1[i];
            }
        }
        return max;
    }

    static int min(int[] arr1){
        int min= Integer.MAX_VALUE;
        for (int i=0;i<arr1.length;i++){
            if (min>arr1[i]){
                min=arr1[i];
            }
        }
        return min;
    }
}
