package Stacks;

import java.util.Stack;

public class nextSmallest {

//    public static int[] nS(int[] a) {
//        int n = a.length;
//        Stack<Integer> st = new Stack<>();
//        int[] b = new int[n];
//
//        st.push(a[n-1]);
//        b[n - 1] = -1;
////        1, 4, 6, 2, 7, 9
//        for (int i = n - 2; i >= 0; i--) {
//            while (st.size() > 0 && st.peek() > a[i]) {
//                st.pop();
//            }
//            if (st.size() == 0) b[i] =-1;
//            else b[i] =st.peek();
//
//            st.push(a[i]);
//        }
//
//        return b;
//
//    }


    ///////////giving index
    public static int[] nS(int[] a) {
        int n = a.length;
        Stack<Integer> st = new Stack<>();
        int[] b = new int[n];

        st.push(n-1);
        b[n - 1] = n;
//        1, 4, 6, 2, 7, 9
//        -1 2 2 -1 -1 -1
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && a[st.peek()] > a[i]) {
                st.pop();
            }
            if (st.size() == 0) b[i] =n;
            else b[i] =st.peek();

            st.push(i);
        }

        return b;

    }
    /////////////////

    /// previous smaller giving index

    public static int[] pS(int[] a){
        int n=a.length;
        Stack<Integer> st=new Stack<>();
        int[] x=new int[n];


        st.push(0);
        x[0]=-1;

//        {1, 4, 6, 2, 7, 9}
//        -1 1 4 1 2 7
        for (int i=1;i<n;i++){

            while(st.size()>0 && a[st.peek()]>a[i] ){
                st.pop();
            }

            if(st.size()==0 ) x[i]=-1;
            else x[i]=st.peek();

            st.push(i);
        }

        return x;
    }

    ///////////

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2, 7, 9};
        int[] ans = pS(arr);
        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
}
