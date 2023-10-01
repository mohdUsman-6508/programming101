package collectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class maps {
    public static void main(String[] args) {
//        Map<String,Integer> mp=new HashMap<>();
        Map<String, Integer> mp = new TreeMap<>();


        mp.put("one", 3);
        mp.put("three", 9);
        mp.put("four", 23);
        mp.put("nine", 99);

        System.out.println(mp);
        System.out.println(mp.keySet());
        System.out.println(mp.entrySet());
        System.out.println(mp.values());

        System.out.println(mp.containsKey("one"));
        mp.putIfAbsent("tone", 93);
        System.out.println(mp.keySet());
        if (!mp.containsKey("three")) {
            mp.put("three", 932);
        }
        System.out.println(mp.entrySet());
        System.out.println(mp.values());

        /////////////iterating on map
        for (Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (String k : mp.keySet()) {
            System.out.println(k);
        }
        for (Integer v : mp.values()) {
            System.out.println(v);
        }
        mp.remove("tone");
        System.out.println(mp.containsKey("tone"));
        System.out.println(mp.containsValue(9));
    }
}
