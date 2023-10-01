package twoD_array;

import java.awt.*;
import java.util.Scanner;

public class practise {
    /////////////////////////
    public static int[] arrayIn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:");
        int n = sc.nextInt();
        System.out.println("enter " + n + " elements:");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

        }

        return array;
    }///////////////////////////

    public static void arrayOut(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
//        int t=5;
//       while (t-->0){
//           Scanner sc=new Scanner(System.in);
//           System.out.println("enter runs required:");
//           double runs=sc.nextDouble();
//           System.out.println("enter overs:");
//           double over=sc.nextDouble();
//
////        double balls=0;
//           double extra=over*10;
//           double extraball=extra%10;
//           double mult=(extra/10);
//           int m=(int)mult;
////        System.out.println(mult);
////        System.out.println(extraball);
//           double balls=(m*6) + extraball;
//
//           //  System.out.println(balls);
//           double runrate=(runs/balls);
//           System.out.println("Required run-rate:"+runrate*6);
//
//       }


        Scanner sc = new Scanner(System.in);
//        int[] a = arrayIn();
//        arrayOut(a);
        System.out.println("testcases:");
        int t = sc.nextInt();

        while (t--> 0) {


            int[] a1 = arrayIn();
            int[] a2 = arrayIn();
            int[] q = new int[9];

            for (int i = 0; i < a1.length; i++) {
                int max = a1[i];
                for (int j = i; j < a1.length; j++) {

                    if ((a1[i] == a1[j]) && (a1[i] < 9 || a1[i] < 10 || a1[i] < 11)) {

                        if (a2[i] > a2[j]) {
                            max = a2[i];

                        } else max = a2[j];


                    }

                    q[i] = max;
                }




            }
            arrayOut(q);

        }


    }

}
