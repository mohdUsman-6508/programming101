package knapsack01;

import java.util.Arrays;

//// subset sum (gfg)
public class subsetSum {
    public static void main(String[] args) {
        int set[] = {3, 34, 4, 12, 5, 2};
        int sum = 30;
        int n = set.length;
        boolean ans = subsetS(set, sum, n - 1);
        System.out.println(ans);
        int dp[][] = new int[n + 1][sum + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(subsetSM(set, sum, n, dp));

        boolean t = subset(set, sum, n-1);
        System.out.println(t);

    }

    /// recursive solution
    private static boolean subsetS(int[] arr, int sum, int n) {
        if (sum == 0) return true;
        if (n == 0 && sum != 0) return false;

        if (arr[n] <= sum) {
            return subsetS(arr, sum - arr[n], n - 1) || subsetS(arr, sum, n - 1);
        } else return subsetS(arr, sum, n - 1);
    }

    /// memoization
    private static int subsetSM(int[] arr, int sum, int n, int dp[][]) {
        if (sum == 0) return 1;
        if (n == 0) return 0;

        if (dp[n][sum] != -1) return dp[n][sum];

        if (arr[n - 1] > sum) {
            return dp[n][sum] = subsetSM(arr, sum, n - 1, dp);

        } else {
            if (subsetSM(arr, sum - arr[n - 1], n - 1, dp) == 1 || subsetSM(arr, sum, n - 1, dp) == 1) {
                return dp[n][sum] = 1;
            } else return dp[n][sum] = 0;
        }
    }

    //tabulation

    private static boolean subset(int[] arr, int sum, int n) {
        //initialisation

        boolean[][] t = new boolean[n + 1][sum + 1];
        for (int i = 0; i < sum + 1; i++) {
            t[0][i] = false;
        }
        for (int j = 0; j < n + 1; j++) {
            t[j][0] = true;
        }

        // tabulation
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (j >= arr[i - 1]) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] || t[i - 1][j];
                } else t[i][j] = t[i-1][j];
            }
        }

        return t[n][sum];
    }

}

/// equal partition sum problem at leetcode

