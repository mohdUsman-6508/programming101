package longest_common_subsequence;

public class minInser_minDel {
    public static void main(String[] args) {
        String x = "heap";
        String y = "pea";

        int lcs = lcs(x, y);
        int insertion = y.length() - lcs;
        int deletion =x.length() - lcs;
        System.out.println("Min. Insertion: " + insertion);
        System.out.println("Min Deletion: " + deletion);

    }

    private static int lcs(String x, String y) {
        int m = x.length();
        int n = y.length();

        int[][] t = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
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
