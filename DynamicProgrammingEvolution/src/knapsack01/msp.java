package knapsack01;

import java.util.ArrayList;

// minimum sum partion
public class msp {
    public static void main(String[] args) {
        int N = 4;
        int arr[] = {1, 6, 11, 5};

        int ans = minSumPart(arr, N);
        System.out.println(ans);
    }

    private static int minSumPart(int[] arr, int n) {
        int range = 0;
        for (int val : arr) range += val;

        boolean[][] dp = new boolean[n + 1][range + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < range + 1; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                } else dp[i][j] = dp[i - 1][j];
            }
        }

        for (int i = 0; i < dp[0].length; i++) {
            System.out.print(dp[n][i] + " ");
        }
        ArrayList<Integer> list = new ArrayList<>();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= range / 2; i++) {
            if (dp[dp.length - 1][i] == true) list.add(i);
        }
        System.out.println(list);
        for (int val : list) {
            ans = Math.min(ans, range - 2 * val);
        }
        return ans;
    }


}
