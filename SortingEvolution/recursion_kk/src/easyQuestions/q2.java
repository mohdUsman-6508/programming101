package easyQuestions;
public class q2 {
    public static void main(String[] args) {
        int n=5;
        int f=fact(n);
        System.out.println("factorial:"+f);
        System.out.println("sum:"+ sum(n));
        System.out.println("digit sum:"+digitSum(1234));
        System.out.println("digit product:"+digitProduct(1234));
    }

//    fact n
    private static int fact(int n){
        if(n<=1) return 1;
        return n*fact(--n);
    }

//    sum n

    private static int sum(int n){
        if(n==0) return 0;
        return n+sum(n-1);
    }

    private static int digitSum(int n){
        if(n==0) return 0;
        return n%10+digitSum(n/10);
    }
//    product

    private static int digitProduct(int n){
        if(n%10==n) return n;
        return n%10*digitProduct(n/10);
    }
}
