package Hashmap;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class maxFrequency {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 3, 2, 1, 2, 3, 2, 1, 1, 2, 1, 2, 3};
        Map<Integer, Integer> freq = new HashMap<>();

        for (int el : arr) {
            if (!freq.containsKey(el)) {
                freq.put(el, 1);
            } else {
                freq.put(el, freq.get(el) + 1);
            }
        }

        System.out.println(freq.entrySet());
        System.out.println(freq.keySet());

        int max = 0;
        int ansKey = -1;

//        for (var e : freq.entrySet()) {
//            if (e.getValue() > max) {
//                max = e.getValue();
//                ansKey = e.getKey();
//            }
//        }

        for (var key : freq.keySet()) {
            if (freq.get(key) > max) {
                max = freq.get(key);
                ansKey = key;
            }
        }

        System.out.println(max + " " + ansKey);


    }
}
