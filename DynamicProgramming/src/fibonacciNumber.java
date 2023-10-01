import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

////////// Those who don't remember the past , are condemned to repeat it.
public class fibonacciNumber {
    public static double fn(int number,double[] dp){
        if(number==0 || number==1) return number;
        /////memoization
        if(dp[number]!=-1) return dp[number];

        dp[number]= fn(number-1,dp)+fn(number-2,dp);
        return dp[number];

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number:");

        int number=sc.nextInt();
        double[] arr=new double[number+1];
        Arrays.fill(arr,-1);
        double n=fn(number,arr);
        System.out.println(n);
    }
}
