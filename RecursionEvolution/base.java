import java.util.Scanner;

public class base {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        int n = sc.nextInt();
        print(n);
        System.out.println();
        System.out.println("factorial: " +fact(5));
    }

    /// IBH (Induction Base Hypothesis)
    private static void print(int n) {
        //base
        if (n == 0) {
            System.out.println();
            return;
        }
        // Hypothesis
        System.out.print(n + " ");
        print(n - 1);
        // induction
        System.out.print(n + " ");
    }
    private static int fact(int n){
        // base
        if(n==1 || n==0) return 1;
        //hypothesis
      int factHypo=  fact(n-1);
      int factFinal=n*factHypo;
      return factFinal;
    }
}
