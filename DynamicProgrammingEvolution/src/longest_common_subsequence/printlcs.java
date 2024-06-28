package longest_common_subsequence;
public class printlcs {
    public static void main(String[] args) {
            String x = "abbdde";
            String y = "abbdde";
            String z = "";

            int m = x.length();
            int n = y.length();
            System.out.println(m +" " + n);
            int[][] t = new int[m + 1][n + 1];
            for (int i = 0; i <= m; i++) {
                for (int j = 0; j <= n; j++) {
                    if (i == 0 || j == 0) t[i][j] = 0;
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
            for (int i = 0; i <= m; i++) {
                for (int j = 0; j <= n; j++) {
                    System.out.print(
                            t[i][j] + " "
                    );
                }
                System.out.println();
            }

            System.out.println(t[m][n]);
            System.out.println(z);

            int i = m, j = n;
            while (i > 0 && j > 0) {
                if (x.charAt(i-1) == y.charAt(j-1)) {
                    i--;
                    j--;
                    z += "" + x.charAt(i);
                } else {
                    if (t[i][j - 1] > t[i - 1][j]) {
                        j--;
                    } else {
                        i--;
                    }
                }
            }
            StringBuilder sb=new StringBuilder(z);
            System.out.println(sb.reverse());
        }

}
