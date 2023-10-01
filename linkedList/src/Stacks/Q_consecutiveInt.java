package Stacks;

import java.util.Stack;

public class Q_consecutiveInt {
    public static int[] antiCons(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (st.size() == 0  || st.peek()!=arr[i]) {
                st.push(arr[i]);
            } else if (st.peek() == arr[i]) {
                if (i == n - 1 || arr[i] != arr[i + 1]) {
                    st.pop();
                }


            }
        }

        int[] ans = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 3, 4, 3,4, 4, 5, 5, 6, 7, 8, 8, 9};
        int[] ans = antiCons(arr);
        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
}
