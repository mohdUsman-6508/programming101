import java.util.HashMap;

public class sw2_2 {
    public static void main(String[] args) {
        String str = new String("aaba");
        String word = "aabaabaa";


        HashMap<Character, Integer> hmStr = new HashMap<>();
        ///frequency calculation

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (hmStr.containsKey(c)) {
                int valCount = hmStr.get(c);
                valCount++;
                hmStr.put(c, valCount);
            } else hmStr.put(c, 1);
        }
        System.out.println(hmStr);
        ///

        int j = 0;
        int i = 0;
        int countAnagrams=0;

        while (j < word.length()) {

            if (j - i + 1 < str.length()) {
                char w=word.charAt(j);
//                System.out.println(w);
                if (hmStr.containsKey(w)) {
//                    System.out.println("working");
                    int val = hmStr.get(w);
                    if (val == 1) {
                        hmStr.remove(w);
                    } else {
                        val--;
                        hmStr.put(w, val);
                    }
                }
                j++;
            } else if (j - i + 1 == str.length()) {
                if (hmStr.isEmpty()){
//                    System.out.println("works!!");
                    countAnagrams++;
                    hmStr.put(word.charAt(i),1);
                }
                i++;
            }

        }

        System.out.println("No.of Anagrams: "+ countAnagrams);


    }
}
