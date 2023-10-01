package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collectionClasses {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(13);
        list.add(41);
        list.add(32);
        list.add(24);
        list.add(33);
        list.add(34);
        list.add(35);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
