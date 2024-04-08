import java.util.HashMap;

public class picktoys {
    public static void main(String[] args) {
        String str = "abaccab";
        HashMap<Character, Integer> hm = new HashMap<>();
        int i = 0, j = 0;
        int ans = Integer.MIN_VALUE;

        while (j < str.length()) {
            char ch = str.charAt(j);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);//calculations
            if (hm.size() < 2) {
                j++;
            } else if (hm.size() == 2) {
                ans = Math.max(ans, j - i + 1);
                j++;
            } else if (hm.size() > 2) {
                while (hm.size() > 2) {
                    char c = str.charAt(i);
                    int val = hm.get(c);
                    val--;
                    if (val == 0) {
                        hm.remove(c);
                    } else {
                        hm.put(c, val);
                    }
                    i++;
                }
                j++;
            }
        }
        System.out.println(ans);
    }
}
