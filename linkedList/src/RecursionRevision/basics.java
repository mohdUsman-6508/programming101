package RecursionRevision;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class basics {
    public static void print(int count) {

        if (count <= 0) return;
        System.out.println("Adam");
        count--;
        print(count);

    }
    //////

    public static void printN(int n) {
        n--;
        if (n < 0) return;
        System.out.print(n + 1 + " ");
        printN(n);
    }

    /////////

    public static int sumN(int n) {
        if (n <= 0) return 0;
        return n + sumN(n - 1);
    }
    /////////

    //parameterized way
    public static void factorial(int n, int ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        factorial(n - 1, ans * n);
    }

    //// functional way

    public static int factorialF(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorialF(n - 1);

    }
    /////////////

    public static void swap(int[] a, int i, int j) {

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    public static int[] reverseArray(int[] arr, int i) {
        if (arr.length / 2 <= i) return arr;
        swap(arr, i, arr.length - i - 1);
        i++;
        reverseArray(arr, i);
        return arr;
    }

    //////

    public static void palindrome(String s, int i) {
        if (s.length() / 2 <= i) {
            System.out.println("true");
            return;
        }
        ;
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            System.out.println("false");
            return;
        }
        i++;
        palindrome(s, i);

    }

    public static long fibonacci(long n) {


        if (n == 0 || n == 1) {
//            System.out.println();
            return n;
        }
        long last = fibonacci(n - 1);
        long slast = fibonacci(n - 2);

        return last + slast;

    }

    ////////// dynamic programming

    public static long fibonacciD(int n, long[] dp) {

        if (n == 0 || n == 1) return n;
        if (dp[n] != -1) return dp[n];

        return dp[n] = fibonacciD(n - 1, dp) + fibonacciD(n - 2, dp);


    }
    /////////


    public static int subSequence(int i, int[] a, ArrayList<Integer> list, int k,ArrayList<Integer> lucky) {

        if (i == a.length) {
            int count = 0;
            System.out.println(list.toString());
            for (int p = 0; p < list.size(); p++) {
                for (int q = p + 1; q < list.size(); q++) {
                    if (list.get(p) == list.get(q)) count++;
                    if (count == k) {

                      lucky.add(1);
                      return -1;
                    }
                }
            }
//            System.out.println(lucky);
            int ans=lucky.size();
            return ans;

        }

        list.add(a[i]);
        subSequence(i + 1, a, list,k, lucky);

        list.remove(list.size() - 1);
        subSequence(i + 1, a, list,k, lucky);

        return lucky.size();

    }

    /// subsequence with sum equal to k

    public static void subSumK(int idx, int[] arr, ArrayList<Integer> list,int sum,int s){
        if(idx==arr.length){
            if(s==sum){
               for(int i=0;i<list.size();i++){
                   System.out.print(list.get(i)+" ");
               }
                System.out.println();
                return;
            }
            return;
        }
        ///take it
        list.add(arr[idx]);
        s+=arr[idx];
        subSumK(idx+1,arr,list,sum,s);

        ///not take it
        list.remove(list.size()-1);
        s-=arr[idx];
        subSumK(idx+1,arr,list,sum,s);

        return;

    }
    public static void main(String[] args) {

        int[] arr={1,2,3};
        ArrayList<Integer> listK=new ArrayList<>();
        int sum=2;
        subSumK(0,arr,listK,sum,0);

//        print(5);
//        printN(10);
//        System.out.println(sumN(5));
//        factorial(5, 1);
//        System.out.println(  factorialF(5));

//        int[] arr = {1, 2, 3, 4, 5};
//        int[] rarr=reverseArray(arr,0);
//        for(int val:rarr){
//            System.out.print(val+" ");
//        }

//        String s = "madam";
//        palindrome(s,0);


//        System.out.println(fibonacci(46));
//
//        int n = 46;
//        long[] dp = new long[n + 1];
//        Arrays.fill(dp, -1);
//
//        System.out.println(fibonacciD(n, dp));
////        for (int i=0;i<=1;i++){
////            System.out.println(fibonacciD(i,dp)+" ");
////        }
//
//        //// tabulation
//        int l = 47;
////        int[] dpp=new int[l+1];
//        int sprev = 0;//        dpp[0]=0;i
//        int prev = 1;//        dpp[1]=1;
//        int cur = 0;
//        for (int i = 2; i < l; i++) {
//            cur = sprev + prev;
//            sprev = prev;
//            prev = cur;
//        }
//
//        System.out.println(cur);

        ///////memory optimization
//
        int[] a = {1,2,3};
        int[] brr = {2, 1, 3, 4};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> lucky = new ArrayList<>();

//        System.out.println( subSequence(0, arr, list, 10,lucky ));

        ArrayList<Integer> list2=new ArrayList<>();


        ArrayList<Integer> listSum=new ArrayList<>();
        ArrayList<Integer> listMin=new ArrayList<>();
//
        ArrayList<Integer> s=sub(0,a,list,listSum);
//        ArrayList<Integer> m=subM(0,b,list2,listMin);
//
//        ArrayList<Integer> ans=new ArrayList<>();
//        for(int i=0;i<s.size();i++){
//
//            int sm=s.get(i)*m.get(i);
//            ans.add(sm);
//
//        }

//        System.out.println(ans.toString());
//        int max=Integer.MIN_VALUE;
//        for (int i=0;i<ans.size();i++){
//            if(max<ans.get(i)){
//                max=ans.get(i);
//            }
//
//        }
//        System.out.println(max);

    }

    public static ArrayList<Integer> sub(int i, int[] a, ArrayList<Integer> list, ArrayList<Integer> listSum) {

        if (i == a.length) {

            if (list.size() == 3) {
                System.out.println(list.toString());
                int sum = 0;
                for (int m = 0; m < list.size(); m++) {
                    sum += list.get(m);
                }
                listSum.add(sum);
                System.out.println(listSum.toString());
            }

            return listSum;
        }

        list.add(a[i]); ////////// take it
        sub(i + 1, a, list, listSum);

        list.remove(list.size() - 1); ////////// not take it
        sub(i + 1, a, list, listSum);


        return listSum;
    }

    public static ArrayList<Integer> subM(int j, int[] b, ArrayList<Integer> list2, ArrayList<Integer> listMin) {

        if (j == b.length) {

            if (list2.size() == 3) {
//                System.out.println(list2.toString());
                int min = Integer.MAX_VALUE;
                for (int n = 0; n < list2.size(); n++) {
                    if (min > list2.get(n)) {
                        min = list2.get(n);
                    }
                }
                listMin.add(min);
                System.out.println(listMin.toString());
            }
//            System.out.println(list2.toString());

            return listMin;
        }

        list2.add(b[j]); ////////// take it
        subM(j + 1, b, list2, listMin);

        list2.remove(list2.size() - 1); ////////// not take it
        subM(j + 1, b, list2, listMin);


        return listMin;
    }
}
