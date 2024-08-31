package subset_subsequence;

public class q1 {
    public static void main(String[] args) {
        String str1 = "Thisistheappleapporange", str2 = "";
        skip(str1,str2);
        System.out.println(skip2(str1));

    }

    private static void skip(String str1, String str2) {
        if (str1.isEmpty()) {
            System.out.println(str2);
            return;
        }
        String str = str1.charAt(0) + "";
        if (str.equals("a")) {
            skip(str1.substring(1), str2);

        } else {
            skip(str1.substring(1), str2 + str);
        }
    }

    private static String skip2(String str) {
        if (str.length() == 0) return "";
        char ch = str.charAt(0);
        if (str.startsWith("app") && !str.startsWith("apple") ) return skip2(str.substring(3));
        return ch + skip2(str.substring(1));
    }
}
