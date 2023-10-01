package Recursion;


import java.util.Scanner;

public class recursionArray {
    //////////////////////////sum
    static int sum(int[] array, int idx) {
        if (idx == array.length - 1) {
            return array[idx];
        }
        return sum(array, idx + 1) + array[idx];
    }
//////////////////////**********************************

    static int max(int[] array,int idx){
        int max=array[idx];

        if (idx==array.length-1){
            return array[idx];
        }

        int comp=max(array,idx+1);
        return Math.max(max,comp);

    }
    /////////////////////////////****************************


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("enter "+n+" elements:");
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }


       // System.out.println(sum(array, 0));
        System.out.println(max(array,0));

    }
}
