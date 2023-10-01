package Hashmap;

import java.util.HashMap;
import java.util.*;

public class basicAndImplementation {

    static void HashMapMethods() {
        // syntax
        Map<String, Integer> mp = new HashMap<>();

        // adding elements
        mp.put("Khalid", 22);
        mp.put("shah", 23);
        mp.put("sahil", 20);
        mp.put("sahel", 21);
        mp.put("riyaz", 23);

        // getting value of a key from the hashmap
        System.out.println(mp.get("shah"));

        // changing/updating value of a key in the hashmap
        mp.put("shah", 22);
        System.out.println(mp.get("shah"));
        System.out.println(mp.get("osman"));

        ///Note: if key does not exist then it returns null value
        /// there can be only one key with one name --> key is unique

        // removing the pair from the hashmap
        int val = mp.remove("riyaz");
        System.out.println(val);

        /// checking if a key is in the Hashmap
        System.out.println(mp.containsKey("riyaz"));
        System.out.println(mp.containsKey("sahil"));

        /// adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("siddique", 22);

        //// get all keys
        System.out.println(mp.keySet());

        /// get all value
        System.out.println(mp.entrySet());

        // traversing all entries of hashmap

        for (String key : mp.keySet()) {
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        System.out.println();
        for (Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());

        }

        System.out.println();
        for (var e : mp.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }

    }

    public static void main(String[] args) {
        HashMapMethods();
    }

}
