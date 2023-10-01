package Stacks;

import java.util.*;

public class nextGreater {

    /////array approach
    public static int[] nextG(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    b[i] = a[j];
                    break;

                } else {
                    b[i] = -1;

                }
            }
        }
        b[a.length - 1] = -1;
        return b;
    }

    //////// Stack approach

    public static int[] nG(int[] a) {
        int n = a.length;
        int[] b = new int[n];

        Stack<Integer> st = new Stack<>();
        st.push(a[n - 1]);
        b[n - 1] = -1;

        for (int i = n - 2; i >= 0; i--) {
            /// pop answer push ALGO
            while (st.size() > 0 && st.peek() < a[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                b[i] = -1;
            } else {
                b[i] = st.peek();
            }
            st.push(a[i]);

        }
        return b;

    }
    /////////


    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 1, 6, 3, 4};
//        int[] ans = nextG(arr);
        int[] ans = nG(arr);
        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
}
