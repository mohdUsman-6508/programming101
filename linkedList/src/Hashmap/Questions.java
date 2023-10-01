package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Questions {
    ////// check Anagram
    /// helping fn for checking frequency
    public static Map<Character, Integer> freq(String str) {
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (!mp.containsKey(key)) {
                mp.put(key, 1);
            } else {
                mp.put(key, mp.get(key) + 1);
            }
        }
        return mp;
    }

    public static boolean isAnagram(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        Map<Character, Integer> m1 = freq(str1);
        Map<Character, Integer> m2 = freq(str2);

        if (l1 != l2) return false;
        else {
            if (m1.equals(m2)) return true;
            else return false;
//            int count = 0;
//            for (int i = 0; i < l1; i++) {
//                if (m1.get(str1.charAt(i)) == m2.get(str1.charAt(i))) count++;
//            }
//            if (count == l1) return true;
//            else return false;

        }

    }

    //////// isomorphic
    public static boolean isomorphic(String str1, String str2) {
        Map<Character, Character> mp = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if (mp.containsKey(c1)) {
                if (mp.get(c1) != c2) return false;
            } else if (mp.containsValue(c2)) {
                return false;
            } else {
                mp.put(c1, c2);
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String str1 = "addy";
        String str2 = "dady";
//        System.out.println(freq(str1));
//        System.out.println(freq(str2));
//        Map<Character, Integer> m = freq(str1);
//        Map<Character, Integer> n = freq(str2);
//
//        System.out.println(m.size());
//        if (m.get('s') == n.get('s')) System.out.println("true");

        System.out.println(isAnagram(str1, str2));


//        System.out.println(freq("usmaan"));

    }
}
