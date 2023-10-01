package Stacks;

import java.util.Stack;

public class conversionOfFix {

    public static void prefixToPostfix(String s){
        Stack<String> st=new Stack<>();

        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            int ascii=(int)ch;

            if(ascii>=48&& ascii<=57){
                st.push(""+ch);
            }
            else{
                String m=st.pop();
                String n= st.pop();
                st.push(m+n+ch);
            }
//            System.out.println(st.peek());
        }
        System.out.println("postfix:"+st.peek());
    }

    public static void postfixToPrefix(String s){
        Stack<String> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=(int)ch;

            if(ascii>=48&& ascii<=57){
                st.push(""+ch);
            }
            else{
                String m=st.pop();
                String n= st.pop();
                st.push(ch+n+m);
            }
//            System.out.println(st.peek());
        }
        System.out.println("prefix: "+st.peek());
    }

    ////// post to infix
    public static void postfixToInfix(String s){
        Stack<String> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=(int)ch;

            if(ascii<=57 && ascii>=48){
                st.push(ch+"");
            }
            else{
                String m=st.pop();
                String n=st.pop();
                st.push("("+n+ch+m+")");
            }
//            System.out.println(st.peek());
        }
        System.out.println(st.peek());
    }

    /////////prefix to infix

    public static void preToIn(String s){
        Stack<String> st=new Stack<>();

        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            int ascii=(int)ch;

            if(ascii<=57 && ascii>=48){
                st.push(""+ch);
            }
            else{
                String m=st.pop();
                String n=st.pop();
                st.push("("+m+ch+n+")");
            }
            System.out.println(st.peek());
        }
        System.out.println(st.peek());

    }
    public static void main(String[] args) {
        String s1="+9/*-6342";
        prefixToPostfix(s1);

        String s2="963-4*2/+";
        postfixToPrefix(s2);

        String s3="963-4*2/+";
        postfixToInfix(s3);

        String s4="+9/*-6342";
        preToIn(s4);


    }
}
