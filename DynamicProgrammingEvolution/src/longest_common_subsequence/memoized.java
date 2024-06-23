package longest_common_subsequence;

import java.util.Arrays;

public class memoized {
    public static void main(String[] args) {
        String x="ab";
        String y="ca";

        int m=x.length();
        int n=y.length();
        int[][] t=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++) {
                t[i][j] = -1;
            }
        }

       int len= lcs(x,y,m,n,t);
        System.out.println(len);


    }

    private static int lcs(String x, String y, int m, int n, int[][] t) {
        if(m==0 || n==0){
            return 0;
        }
        if(t[m][n]!=-1){
            return t[m][n];
        }
        if(x.charAt(m-1)==y.charAt(n-1)){
            return t[m][n]=1+lcs(x,y,m-1,n-1,t);
        }
        else{
            return t[m][n]=Math.max(lcs(x,y,m-1,n,t),lcs(x,y,m,n-1,t));
        }
    }
}
