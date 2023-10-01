import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class arrayList {
    public static void main(String[] args) {
//
//        ArrayList arrayList=new ArrayList();
//
//        System.out.println("initially size:"+arrayList.size());
//        //add elements to arrayList
//
//        arrayList.add("a");
//        arrayList.add("b");
//        arrayList.add("c");
//        arrayList.add(1,"p2");
//        System.out.println("size after adding"+arrayList.size());
//
//        ////displaying the array list
//        System.out.println("elements of arraylist:"+arrayList);
//        arrayList.add("10");
//        arrayList.add("%");
//        System.out.println("elements after insertion:"+arrayList);
//
//        ///remove elements from the arraylist
//
//        arrayList.remove("10");
//        arrayList.remove(3);
//        System.out.println("size after deletion:"+arrayList.size());
//        System.out.println("elements after deletion:"+arrayList);

        /////reverse array using arraylist
//        ArrayList<Integer> list=new ArrayList<Integer>();
//
//        list.add(Integer.valueOf(0));
//        list.add(Integer.valueOf(10));
//        list.add(Integer.valueOf(3));
//        list.add(Integer.valueOf(5));
//        list.add(Integer.valueOf(22));
//        list.add(Integer.valueOf(10));
//        System.out.println("before reverse:");
//        System.out.println(list);

//        for (int i=0;i<list.size()/2;i++){
//            Integer t=list.get(i);
//            list.set(i,list.get(list.size()-i-1));
//            list.set(list.size()-i-1,t);
//        }

//        Collections.reverse(list);
//
//        System.out.println("after reverse:");
//        System.out.println(list);

        ArrayList<String> list=new ArrayList<String>();

        list.add("akash");
        list.add("rahul");
        list.add("pankaj");
        list.add("manoj");

        //unsortedlist
        //System.out.println(list);
        for (String str:list
             ) {
            System.out.println(str);
        }


        //sorting in decreasing order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("final list:");
        for (String st:list){
            System.out.println(st);
        }


    }
}
