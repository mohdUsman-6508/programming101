package longest_common_subsequence;

public class longesSubstring {
    public static void main(String[] args) {
        String x = "abcde";
        String y = "abfce";
        String z = "";

        int m = x.length();
        int n = y.length();

        int[][] t = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) t[i][j] = 0;
            }
        }

        int max=Integer.MIN_VALUE;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = 0;
                }

                if(max<t[i][j]){
                    max=t[i][j];
                }
            }

        }
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(
                        t[i][j] + " "
                );
            }
            System.out.println();
        }

        System.out.println(max);

    }
}
