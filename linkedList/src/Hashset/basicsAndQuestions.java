package Hashset;

import java.util.HashSet;

public class basicsAndQuestions {

static int maxNumberOnTable(int[] bag){
    HashSet<Integer> table=new HashSet<>();
    int max=0;
    for (int i=0;i<bag.length;i++){
        int num=bag[i];
        if(table.contains(num)){
            table.remove(num);
        }
        else{
            table.add(num);
            max=Math.max(max,table.size());
        }
    }
    return max;
}
    public static void main(String[] args) {
//        HashSet<Integer> st=new HashSet<>();
//
//        st.add(2);
//        st.add(4);
//        st.add(6);
//        st.add(1);
//        st.add(3);
//        st.add(5);
//        System.out.println(st);
//
//        System.out.println(st.contains(3));
//        st.remove(3);
//
//        System.out.println( st.size());
//        for (int val:st){
//            System.out.print(val+" ");
//        }

        int[] a = {2, 1, 1, 3, 2, 3};
        System.out.println(maxNumberOnTable(a));

    }


}
