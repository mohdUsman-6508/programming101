package Stacks;

import java.util.Stack;

public class postfixEvaluation {

    public static int postfixE(String str) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int asc = (int) ch;

            if (asc >= 48 && asc <= 57) {
                st.push(asc - 48);
            } else {

                int v1 = st.pop();
                int v2 = st.pop();
                if (ch == '+') st.push(v2 + v1);
                if (ch == '-') st.push(v2 - v1);
                if (ch == '*') st.push(v2 * v1);
                if (ch == '/') st.push(v2 / v1);

            }
        }
        return st.peek();
    }

    public static void prefixE(String str) {
        Stack<Integer> st = new Stack<>();

        for (int i = str.length()-1; i>=0; i--) {
            char ch = str.charAt(i);
            int asc = (int) ch;

            if (asc >= 48 && asc <= 57) {
                st.push(asc - 48);
            } else {

                int v2 = st.pop();
                int v1= st.pop();
                if (ch == '+') st.push(v2 + v1);
                if (ch == '-') st.push(v2 - v1);
                if (ch == '*') st.push(v2 * v1);
                if (ch == '/') st.push(v2 / v1);

            }
        }

        System.out.println(st.peek());

    }

    public static void main(String[] args) {
        String str1 ="963-4*2/+";
        System.out.println(postfixE(str1));
        String str2="-9/*+5346";
        prefixE(str2);
    }
}
