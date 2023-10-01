package Recursion;

import java.util.Scanner;


public class gcdanslcm {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=3;
        while (t-->0){
            System.out.println("enter number:");
            int n=sc.nextInt();
            System.out.println("enter number :");
            int m=sc.nextInt();
          //  wgcd(n,m);
            igcd(n,m);
            System.out.println(gcd(n,m));
        }

    }
/*************************************************************************************************/

    ///////////////////find gcd
    static void wgcd(int x, int y) {
        int n = 1;
        int ans = 1;
        while (x > n || y > n) {

            if (x % n == 0 && y % n == 0) {
                ans = n;
            }
            n++;

        }
        System.out.println("gcd of given number is: "+ans);
    }
    //////////////////////////////////////////////////////////////////////////

    static void igcd(int x,int y){

        while (x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        System.out.println(y);
    }

    /////////////////euclid algo

    static int gcd(int m,int n){
        if (n==0){
            return m;
        }
        return gcd(n,m%n);
    }
/////////////////////

}
