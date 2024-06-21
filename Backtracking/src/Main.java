import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] arr = {"hi", "java", "code", "apple"};
        List<List<String>> list = new ArrayList<>();
        List<String> strList = new ArrayList<>();

        subsetString(arr, list, strList, 0);
        for (List<String> l : list) {
            System.out.println(l + " ");
        }
        Character[] letters = {'a', 'b', 'c', 'd', 'e', 'a', 'b', 'c'};
        int[] freq=getFreq(letters);

        for (int val:freq){
            System.out.print(val+" ");
        }

    }

    private static int[] getFreq(Character[] arr) {

        int[] freq=new int[26];
        for (int i=0;i<arr.length;i++){
            int idx=arr[i]-97;
            freq[idx]++;
        }

        return freq;

    }

    private static void subsetString(String[] arr, List<List<String>> list, List<String> strList, int idx) {
        if (idx == arr.length) {
            list.add(new ArrayList<>(strList));
            return;
        }
        strList.add(arr[idx]);
        subsetString(arr, list, strList, idx + 1);
        strList.remove(strList.size() - 1);
        subsetString(arr, list, strList, idx + 1);
    }

    private static void getPermutations(List<String> permutations, String input, String output) {

        if (input.length() == 0) {
            permutations.add(output);
            return;
        }

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            if (!set.contains(input.charAt(i) + "")) {
                set.add(input.charAt(i) + "");
                String in = input.substring(0, i) + input.substring(i + 1, input.length());
                String out = input.charAt(i) + "";
                getPermutations(permutations, in, output + out);
            }
        }

    }

    // permutations of a string "abc"- abc acb bac bca cab cba -> n! for unique string n!/r! for duplicate character


}