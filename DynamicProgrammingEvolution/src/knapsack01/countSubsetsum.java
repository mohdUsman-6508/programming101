package knapsack01;

//Count of subsets sum with a Given sum
//Given an array arr[] of length N and an integer X, the task is to find the number of subsets with sum equal to X.
//Example:
//
//Input: arr[] = {1, 2, 3, 3}, X = 6
//Output: 3
//All the possible subsets are {1, 2, 3},
//{1, 2, 3} and {3, 3}
public class countSubsetsum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};
        int w=6;
        int n = arr.length-1;

        int subset = subsets(arr, n , w);
        System.out.println(subset);
    }

    private static int subsets(int[] arr, int n, int w) {
        int dp[][] = new int[n + 1][w + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 1;
        }


        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (arr[i-1] <= j) {
                    dp[i][j] = dp[i - 1][j - arr[i-1]] + dp[i - 1][j];
                } else dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n][w];
    }
}

// issue with the code
