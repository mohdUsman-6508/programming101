package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        /// adding elements
        // adding continuously without specifying index
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println(list);
        list.add(1, 10);// adding at particular index
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(6);
        System.out.println(list2);
        list.addAll(list2); /// adding a list to a list
        System.out.println(list);


        // getting value or elements from list
        System.out.println(list.get(1));

        //deleting elements from list
        list.remove(Integer.valueOf("10"));
        list.remove(2);
        System.out.println(list);

        list2.set(1, 39);
        System.out.println(list2);

        System.out.println(list.contains(30));
        list2.clear();
        System.out.println(list2);

        //// traversing through list
        //for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + 1 + " ");
        }
        System.out.println();

        ///for each method

        for (int value : list) {
            System.out.print(value + " ");
        }

        //Iterator method

        System.out.println();
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }


}
