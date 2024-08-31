package subset_subsequence;

import java.util.ArrayList;

public class q2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        subsequence("abc", "");
        subSequence("abc", "", list);
        System.out.println();
        System.out.println(list);
    }

    private static void subsequence(String ip, String op) {

        if (ip.isEmpty()) {
            System.out.print(op + " ");
            return;
        }
        subsequence(ip.substring(1), op + ip.charAt(0));
        subsequence(ip.substring(1), op);
    }

    private static void subSequence(String ip, String op, ArrayList<String> list) {
        if (ip.isEmpty()) {
            list.add(op);
            return;
        }

        subSequence(ip.substring(1), op + ip.charAt(0), list);
        subSequence(ip.substring(1), op, list);

    }
}
