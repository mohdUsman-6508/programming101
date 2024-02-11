public class Nbit {
    public static void main(String[] args) {
        int n = 3;
        solve("", 0, 0, n);
    }

    static void solve(String op, int zero, int one, int n) {
        if (n == 0) {
            System.out.print(op + " ");
            return;
        }
        String op1 = op + "1";
        //ye to har bar hoga he hoga
        solve(op1, zero, one + 1, n - 1);
//        if(zero==one){
//            String op1=op+"1";
//            solve(op1,zero,one+1,n-1);
//        }
        if (one > zero) {
//            String op1=op+"1";
            String op2 = op + "0";
//            solve(op1,zero,one+1,n-1);
            solve(op2, zero + 1, one, n - 1);
        }

    }
}
