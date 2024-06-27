package longest_common_subsequence;

// Pattern matching algorithm --> build upon what you know

public class shortest_common_superseq {
    public static void main(String[] args) {
//        String x = "AGGTAB";
//        String y = "GXTXAYB"; //9
        String x = "abac";
        String y = "cab"; //5

        int lcs_len = lcs(x, y, x.length(), y.length());

        int shortest_common_ss = (x.length() + y.length()) - lcs_len;
        System.out.println("Shortest common Super Sequence: " + shortest_common_ss);

    }

    private static int lcs(String x, String y, int m, int n) {
        int[][] t = new int[m + 1][n + 1];

        //initialisation
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) t[i][j] = 0;
            }
        }
        //
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }
        return t[m][n];
    }

}
