package longest_common_subsequence;

public class recursive {
    public static void main(String[] args) {
        String x="acob";
        String y="abde";

       int len= lsc(x,y,x.length(),y.length());
        System.out.println(len);
    }

    private static int lsc(String x, String y, int m, int n) {
        if(m==0 || n==0) return 0;

        if(x.charAt(m-1)==y.charAt(n-1)){
            return 1+lsc(x,y,m-1,n-1);
        }
        else{
            return Math.max(lsc(x,y,m-1,n),lsc(x,y,m,n-1));
        }

    }
}
