package knapsack01;

public class targetSum {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        int ts = 1;

        System.out.println("ans: " + ss(arr, ts, 0, arr.length - 1));
    }

    private static int ss(int[] arr, int ts, int sum, int n) {
        //base condition
        if (n < 0) {
            if (ts == sum) return 1;
            else return 0;
        }

        int l = ss(arr, ts, sum + arr[n], n - 1);
        int r = ss(arr, ts, sum - arr[n], n - 1);
        return l + r;

    }
}
