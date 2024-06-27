package longest_common_subsequence;

public class longest_palindromic_sub {
    public static void main(String[] args) {

//        String x = "cbbd";
        String x = "bbbab";
        String y = "";
        for (int i = x.length() - 1; i >= 0; i--) {
            y += x.charAt(i);
        }
        int lps = lcs(x, y);
        System.out.println("longest common palindromic: " + lps);

    }

    private static int lcs(String x, String y) {
        int m=x.length();
        int n=y.length();

        int[][] t=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }

        return t[m][n];
    }
}
