package Stacks;

import java.util.*;

public class Q_balancedBracket {

    ////////// BALANCED BRACKET

    public static boolean isBalanced(String str) {
        int n = str.length();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.size() == 0) return false;
                else {
                    st.pop();
                }
            }
        }
        if (st.size() > 0) return false;
        else return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));

    }
}
