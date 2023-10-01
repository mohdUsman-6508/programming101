package Stacks;

import java.util.Stack;

public class prefix {
    public static String prefixExpression(String str) {
        Stack<String> v = new Stack<>();
        Stack<Character> o = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                String s = "" + ch;
                v.push(s);
            } else if (o.size() == 0 || ch == '(' || o.peek() == '(') {
                o.push(ch);
            } else if (ch == ')') {

                while (o.peek() != '(') {
                    String v1 = v.pop();
                    String v2 = v.pop();
                    char c =o.pop();
                    String val=c+v2+v1;
                    v.push(val);

                }
                o.pop();
            } else {
                if (ch == '+' || ch == '-') {
                    String v1 = v.pop();
                    String v2 = v.pop();
                    char c =o.pop();
                    String val=c+v2+v1;
                    v.push(val);
                    o.push(ch);
                }

            }

            if (ch == '*' || ch == '/') {
                if (o.peek() == '*' || o.peek() == '/') {
                    String v1 = v.pop();
                    String v2 = v.pop();
                    char c =o.pop();
                    String val=c+v2+v1;
                    v.push(val);
                    o.push(ch);

                } else {
                    o.push(ch);
                }
            }

        }

        while (v.size() > 1) {
            String v1 = v.pop();
            String v2 = v.pop();
            char c =o.pop();
            String val=c+v2+v1;
            v.push(val);
        }

        return v.peek();
    }

    //////

    public static String postfix(String str){
        Stack<String> v = new Stack<>();
        Stack<Character> o = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                String s = "" + ch;
                v.push(s);
            } else if (o.size() == 0 || ch == '(' || o.peek() == '(') {
                o.push(ch);
            } else if (ch == ')') {

                while (o.peek() != '(') {
                    String v1 = v.pop();
                    String v2 = v.pop();
                    char c =o.pop();
                    String val=v2+v1+c;
                    v.push(val);

                }
                o.pop();
            } else {
                if (ch == '+' || ch == '-') {
                    String v1 = v.pop();
                    String v2 = v.pop();
                    char c =o.pop();
                    String val=v2+v1+c;
                    v.push(val);
                    o.push(ch);
                }

            }

            if (ch == '*' || ch == '/') {
                if (o.peek() == '*' || o.peek() == '/') {
                    String v1 = v.pop();
                    String v2 = v.pop();
                    char c =o.pop();
                    String val=v2+v1+c;
                    v.push(val);
                    o.push(ch);

                } else {
                    o.push(ch);
                }
            }

        }

        while (v.size() > 1) {
            String v1 = v.pop();
            String v2 = v.pop();
            char c =o.pop();
            String val=v2+v1+c;
            v.push(val);
        }

        return v.peek();

    }

    public static void main(String[] args) {
        String str = "9+(6-3)*4/2";
        System.out.println(prefixExpression(str));
        System.out.println(postfix(str));
    }
}
