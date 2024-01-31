import java.util.HashMap;

public class vsw_2 {
    public static void main(String[] args) {
        int k = 3;
        String str = "aabacbebebe";
        int unisub = uniqueSub(str, k);
        int unisubO = uniqueSubO(str, k);
        System.out.println("Answer:" + unisub);
        System.out.println("answer:" + unisubO);
    }

    //brute force
    private static int uniqueSub(String str, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int maxLen = 0;

        for (int i = 0; i < str.length(); i++) {
            int j = i;
            while (hm.size() <= k && j < str.length()) {
                char s = str.charAt(j++);
//                if (hm.containsKey(s)) {
//                    int val = hm.get(s);
//                    val++;
//                    hm.put(s, val);
//
//                } else {
//                    hm.put(s, 1);
//                }
                hm.put(s, 1);
            }
            maxLen = Math.max(maxLen, j - i);
            hm.clear();
        }
        return maxLen;
    }

    //optimized approach
    private static int uniqueSubO(String str, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();

        int i = 0;
        int j = 0;
        int maxLen = -1;

        while (j < str.length()) {
            //calculations
            char ch = str.charAt(j);
            if (hm.containsKey(ch)) {
                int val = hm.get(ch);
                val++;
                hm.put(ch, val);
            } else hm.put(ch, 1);

            //////
            if (hm.size() < 3) {//condition<k
                j++;
            } else if (hm.size() == k) {//condition==k
                //ans <-- calc
                j++;
                maxLen = Math.max(maxLen, j - i + 1);

            } else if (hm.size() > k) {//condition>k
                while (hm.size() > k) {//condition >k
                    //remove calculation
                    int val = hm.get(str.charAt(i));
                    val--;
                    if (val == 0) hm.remove(str.charAt(i));
                    i++;
                }
                j++;
            }
        }
        return maxLen;
    }
}
