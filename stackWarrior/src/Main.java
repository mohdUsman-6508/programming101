public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] ans = {0, 0};
        findsheepsAndTurkeys(22, 54, 0, 0, ans);
        for (int val : ans) {
            System.out.print(" " + val);
        }

    }

    public static int[] findsheepsAndTurkeys(int heads, int legs, int turkey, int sheep, int[] ans) {

        if (heads < 0 || legs < 0) {
            return ans;
        }

        if (heads == 0 && legs == 0) {
            ans[0] = turkey;
            ans[1] = sheep;
            return ans;

        }
        findsheepsAndTurkeys(heads - 1, legs - 2, turkey + 1, sheep, ans);
        findsheepsAndTurkeys(heads - 1, legs - 4, turkey, sheep + 1, ans);
        return ans;
    }
}