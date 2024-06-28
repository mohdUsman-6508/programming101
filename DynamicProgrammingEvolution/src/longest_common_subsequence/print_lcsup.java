package longest_common_subsequence;

public class print_lcsup {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "bce";

        int i = str1.length();
        int j = str2.length();
        String output = "";
        int[][] t=lcs(str1, str2);
        while (i > 0 && j > 0) {
            char c1 = str1.charAt(i-1);
            char c2 = str2.charAt(j-1);
            if (c1 == c2) {
                output += c1;
                i--;
                j--;
            } else {
                if (t[i][j - 1] < t[i - 1][j]) {
                    output += str1.charAt(i-1);
                    i--;
                } else {
                    output += str2.charAt(j-1);
                    j--;
                }
            }
        }
        while (i > 0) {
            output += str1.charAt(i-1);
            i--;
        }  while (j > 0) {
            output += str2.charAt(j-1);
            j--;
        }

        String ans = "";
        for (int k = output.length() - 1; k >= 0; k--) {
            ans += output.charAt(k);
        }

        for(int m=0;m<=str1.length();m++){
            for(int n=0;n<=str2.length();n++){
                System.out.print(t[m][n]+" ");
            }
            System.out.println();
        }

        System.out.println(ans);

    }

    private static int[][] lcs(String x, String y) {
        int m=x.length();
        int n=y.length();
        int[][] t=new int[m+1][n+1];
        for (int i = 1; i <m+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i][j - 1], t[i - 1][j]);
                }
            }
        }
        return t;

    }
}



