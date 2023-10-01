package Stacks;

import java.util.Stack;

public class infix {

    public static int infixExpression(String str) {
        Stack<Integer> v = new Stack<>();
        Stack<Character> o = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                v.push(ascii - 48);
            } else if (o.size() == 0 || ch=='(' || o.peek()=='('){
                o.push(ch);
            }
            else if(ch==')'){
                while (o.peek()!='('){
                    int v1 = v.pop();
                    int v2 = v.pop();

                    if (o.peek() == '+') v.push(v2 + v1);
                    if (o.peek() == '-') v.push(v2 - v1);
                    if (o.peek() == '*') v.push(v2 * v1);
                    if (o.peek() == '/') v.push(v2 / v1);

                    o.pop();
                }
                o.pop();
            }
                else {
                if (ch == '+' || ch == '-') {
                    int v1 = v.pop();
                    int v2 = v.pop();

                    if (o.peek() == '+') v.push(v2 + v1);
                    if (o.peek() == '-') v.push(v2 - v1);
                    if (o.peek() == '*') v.push(v2 * v1);
                    if (o.peek() == '/') v.push(v2 / v1);
                    o.pop();
                    o.push(ch);
                }

                if (ch == '*' || ch == '/') {
                    if (o.peek() == '*' || o.peek() == '/') {
                        int v1 = v.pop();
                        int v2 = v.pop();
////
//                        if (o.peek() == '+') v.push(v2 + v1);
//                        if (o.peek() == '-') v.push(v2 - v1);
                        if (o.peek() == '*') v.push(v2 * v1);
                        if (o.peek() == '/') v.push(v2 / v1);
                        o.pop();
                        o.push(ch);
                    } else {
                        o.push(ch);
                    }
                }
            }


        }

        while (v.size() > 1) {
            int v1 = v.pop();
            int v2 = v.pop();

            if (o.peek() == '+') v.push(v2 + v1);
            if (o.peek() == '-') v.push(v2 - v1);
            if (o.peek() == '*') v.push(v2 * v1);
            if (o.peek() == '/') v.push(v2 / v1);
            o.pop();
        }
        return v.peek();
    }

    public static void main(String[] args) {

        String str = "9+(6-3)*4/2";
        System.out.println(infixExpression(str));

    }
}
