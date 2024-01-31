import java.util.ArrayList;
import java.util.HashMap;

public class vsw_3 {
    public static void main(String[] args) {
        String str = "eeydgwdykpv";

        System.out.println(maxUniqueSubsting(str));
        System.out.println("ans: " + maxUS(str));
    }


    /// Brute force
    private static int maxUniqueSubsting(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int maxLen = 0;
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            j = i;
            char c = str.charAt(j);
            while (!hm.containsKey(c) && j < str.length() - 1) {
                hm.put(c, 1);
                j++;
                c = str.charAt(j);
                maxLen = Math.max(maxLen, hm.size());
            }

            hm.clear();
        }

        return maxLen;
    }


    private static int maxUS(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int i = 0;
        int j = 0;
        int maxLen = 0;
        while (j < str.length()) {
            char ch = str.charAt(j);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            if (hm.size() == j - i + 1) {
                maxLen = Math.max(maxLen, hm.size());
                j++;
            } else if (hm.size() < j - i + 1) {
                while (hm.size() < j - i + 1) {
                    char c=str.charAt(i);
                    int val = hm.get(c);
                    val--;
                    if (val == 0) {
                        hm.remove(c);
                    }
                    else {
                        hm.put(c,val);
                    }
                    i++;
                }
                j++;
            }
        }
        return maxLen;
    }

}



