package longest_common_subsequence;

public class tabulation {
    public static void main(String[] args) {
        String x="acob";
        String y="abde";

        int m=x.length();
        int n=y.length();
        int[][] t=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++) {
                if(i==0 || j==0) t[i][j]=0;
            }
        }

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
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                System.out.print(
                        t[i][j]+" "
                );
            }
            System.out.println();
        }

        System.out.println(t[m][n]);
    }
}
