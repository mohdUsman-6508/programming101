package knapsack01;

public class knapsackConcept {
    static int N = 100;
    static int W = 100;

    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int w = 50;
        int n = 3;
        int maxProfit = knapsack(wt, val, w, n);
        System.out.println("Profit: " + maxProfit);
        int dp[][] = new int[N + 1][W + 1];
        for (int i = 0; i < N + 1; i++)
            for (int j = 0; j < W + 1; j++)
                dp[i][j] = -1;

        int maxPro = knapsack(wt, val, w, n, dp);
        int maxT = knapsackT(wt, val, w, n);
        System.out.println("profit: " + maxPro);
        System.out.println("profit: " + maxT);

    }

    //knapsack recursive
    private static int knapsack(int[] wt, int[] val, int w, int n) {
        //base condition
        if (n == 0 || w == 0) return 0;

        if (wt[n - 1] <= w) {
            int pick = val[n - 1] + knapsack(wt, val, w - wt[n - 1], n - 1);
            int notPick = knapsack(wt, val, w, n - 1);
            return Math.max(pick, notPick);
        } else if (wt[n - 1] > w) {
            return knapsack(wt, val, w, n - 1);
        }
        return 0;
    }

    //knapsack memoization
    private static int knapsack(int[] wt, int[] val, int W, int n, int[][] dp) {

        if (W == 0 || n == 0) return 0;

        //memoization
        if (dp[n][W] != -1) return dp[n][W];

        if (wt[n - 1] <= W) {
            int pick = val[n - 1] + knapsack(wt, val, W - wt[n - 1], n - 1, dp);
            int notPick = knapsack(wt, val, W, n - 1, dp);
            int maxProfit = Math.max(pick, notPick);
            return dp[n][W] = maxProfit;
        } else if (wt[n - 1] > W) {
            return dp[n][W] = knapsack(wt, val, W, n - 1, dp);
        }
        return 0;
    }

    //knapsack Tabulation
    private static int knapsackT(int[] wt, int[] val, int W, int n) {
        //intialisation
        int[][] t = new int[n + 1][W + 1];
        //filling it
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                if (i == 0 || j == 0) t[i][j] = 0;
            }
        }

        //fill remaining matrix (decision tree to iterative solution)
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (wt[i - 1] <= j) {
                    t[i][j] = Math.max(val[i - 1] + t[i - 1][j - wt[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][W];

    }

}
