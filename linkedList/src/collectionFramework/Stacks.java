package collectionFramework;
import java.util.*;
public class Stacks {
    public static void main(String args[]){
      /// push pop and peek

        Stack<Integer> st=new Stack<>();

        st.push(3); /// add
        st.push(8);
        st.push(38);
        st.push(23);
        System.out.println(st);
        System.out.println(st.peek());
        st.pop(); //remove top element
        System.out.println(st.peek());// show peek element


    }

}
