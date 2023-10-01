import java.util.Scanner;

public class fibonacciNumberTabulation {
    public static void main(String[] args) {

        ///tabulation
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        double prev=0;
        double cur=1;
        double next=0;

        for(int i=0;i<n;i++){
            next=prev+cur;
            prev=cur;
            cur=next;
        }
        System.out.println(n +"th fibonacci number:"+ next);
    }
}
