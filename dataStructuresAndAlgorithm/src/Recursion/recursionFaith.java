package Recursion;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class recursionFaith {

    static void printIncreasing(int n) {

        ////base condition to stop stackOverflow or to avoid infinite running of function

        if (n == 1) {
            System.out.println(n);
            return;
        }
        ////////////////LIFO last in last out
        printIncreasing(n - 1);///////recursion doing its work i.e. calling itself
        System.out.println(n);//////////////self work

    }//////////////////////////

    static void printDecreasing(int n) {
        //////base condition
        if (n == 1) {
            System.out.println(n);
            return; //////////remember to include this
        }


        //////////it depends on problem that between selfwork and recursive is called first
        System.out.println(n);
        printDecreasing(n - 1);

    }/////////////////////

    ///////////////////////////////
    static int fact(int n) {
        if (n == 0) {
            return 1;
        }///////////////base condition

        //   int factorial=n*fact(n-1);
        ///////////////recurrence relation and self work

        return n * fact(n - 1);
    }
////////////////////////////////////

    //////////////////////fibonacci series
    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /////////////////////////////sum of digits
    static int sumDigits(int n) {
        ////////////////////base condition
        if ((n / 10) == 0) {
            return n;
        }
        return sumDigits(n / 10) + n % 10;////////recursive function + self work
    }

    /////////////////number of digits
    static int countDigits(int n) {
        ////////////////////base condition
        if ((n / 10) == 0 || n == 0) {
            return 1;
        }
        return countDigits(n / 10) + 1;////////recursive function + self work
    }


    ////////////////////////////////p^q p raise to power q
    static int power(int base, int power) {
        ////////////halting condition
        if (power == 0) {
            return 1;
        }
        ///////////////recursive fn+self work
//        return power(base,power-1)*base;
        //////////Optimized time complexity
        int small = power(base, power / 2);

        if (power % 2 == 0) {
            return small * small;
        }
        return base * small * small;

    }

    ////////////////k multiples of n
////////////////
    static void multiples(int n, int k) {
        if (k == 0) {
            return;
        }
        multiples(n, k - 1);
        System.out.println(n * k);
    }////////////////////////////////

    /////////sum of n natural numbers
    static int sumN(int n) {
        if (n == 1) {
            return n;
        }
        return sumN(n - 1) + n;
    }

    //////////////////sum of the series 1+2-3+4-5+...................
    static int sumSeries(int n) {
        int sum = 0;

        if (n == 0) {
            return 0;
        }

        int s = sumSeries(n - 1);

        if (n % 2 == 0) {
            sum = s - n;
        }
        if (n % 2 != 0) {
            sum = s + n;
        }
        return sum;
    }/////////////////////////////////////////////////

    /////////////////pattern 16,11,6,1,-4,1,6,11,16
    static void patternM(int n,int m,boolean flag) {

        System.out.println(m + " ");

        if (n == m && flag == false) {
            return;
        }

        if (flag) {
            if (m - 5 > 0) {
                patternM(n, m - 5, true);
            } else patternM(n, m - 5, false);

        } else patternM(n, m + 5, false);


    }//////////////////////////////////////////////

///////////////////

        public static int rec(int n, int m) {
            if (m == 1)
                return sumN(n);

            int sum = rec(n, m - 1);
            return sumN(sum);
        }
    ///////////////////////////

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

//        printIncreasing(n);
//        printDecreasing(n);

        // System.out.println(fact(6));
        //   System.out.println(fibonacci(50));
//        for (int i=0;i<=20;i++){
//            System.out.print(fibonacci(i)+" ");
//        }

////
//        int t = 5;
//        while (t-- > 0) {
//            //System.out.println("enter a number:");
//            //int n=sc.nextInt();
//            System.out.println("n:");
//            int n = sc.nextInt();
//            // System.out.println("k:");
//            //  int k=sc.nextInt();
//
////      //  System.out.println(countDigits(n));
////            System.out.println(sumDigits(n));
//            // System.out.println(power(b,p));
//            //multiples(n,k);
//
//           // System.out.println(sumSeries(n));
//            //System.out.println( sumN(n));
//
//        }
        // patternM(16,16,true);
        System.out.println(rec(3,2));
    }



    }