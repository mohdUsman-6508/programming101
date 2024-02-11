public class validBrackets {
    public static void main(String[] args) {
        int n = 2;
        solve(n, n, "");
    }

    static void solve(int open, int close, String op) {
        if (open ==0 && close == 0) {
            System.out.print(op + " ");
            return;
        }

        if (open == 0) {
            String op1 = op + ")";
            solve(open, close - 1, op1);
        }
        if (close > open && open != 0) {
            String op1 = op;
            String op2 = op;
            op1 += "(";
            op2 += ")";
            solve(open - 1, close, op1);
            solve(open, close - 1, op2);
        }
        if (open == close) {
            String op1 = op + "(";
            solve(open - 1, close, op1);
        }
    }
}
