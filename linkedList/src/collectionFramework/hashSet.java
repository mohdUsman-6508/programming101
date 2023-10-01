package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class hashSet {
    public static void main(String[] args) {
//        Set<Integer> set=new HashSet<>();
//        Set<Integer> set=new LinkedHashSet<>();
        Set<Integer> set=new TreeSet<>();
        set.add(39);
        set.add(9);
        set.add(29);
        set.add(94);
        set.add(9);
        set.add(29);
        set.add(93);
        System.out.println(set);

        set.remove(29);
        System.out.println(set);
        System.out.println(set.contains(9));
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());
    }
}
