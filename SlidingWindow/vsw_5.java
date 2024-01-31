import java.util.HashMap;
import java.util.Map;

public class vsw_5 {
    public static void main(String[] args) {
        String str = "timetopractice";
        String t = "t";
        System.out.println("ans:" + findMinStr(str, t));
    }

    private static int findMinStr(String str, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        int count = hm.size();
        while (j < str.length()) {
            char ch = str.charAt(j);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.getOrDefault(ch, 0) - 1);
                if (hm.get(ch) == 0) count--;
            }
            while (count == 0) {
                min = Math.min(min, j - i + 1);
                char ci = str.charAt(i);
                if (hm.containsKey(ci)) {
                    hm.put(ci, hm.getOrDefault(ci, 0) + 1);
                    if (hm.get(ci) > 0) count++;
                }
                i++;
            }

            j++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

//    private static int findMinStr(String str, String t) {
//        HashMap<Character, Integer> hm = new HashMap<>();
//        for (int i = 0; i < t.length(); i++) {
//            char ch = t.charAt(i);
//            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
//        }
//        int i = 0;
//        int j = 0;
//        int min = Integer.MAX_VALUE;
//        int count = hm.size();
//        while (j < str.length()) {
//            char ch = str.charAt(j);
//            if (hm.containsKey(ch)) {
//                hm.put(ch, hm.getOrDefault(ch, 0) - 1);
//                if (hm.get(ch) == 0) count--;
//            }
//            while (count == 0) {
//                min = Math.min(min, j - i + 1);
//                char ci = str.charAt(i);
//                if (hm.containsKey(ci)) {
//                    hm.put(ci, hm.get(ci) + 1);
//                    if (hm.get(ci) > 0) count++;
//                }
//                i++;
//            }
//            j++;
//        }
//        return min == Integer.MAX_VALUE ? 0 : min;
//    }

}
