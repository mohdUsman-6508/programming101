package matrix_chain_multiplication;

public class memoized {
    public static void main(String[] args) {
        int[] arr = {10, 30, 5, 60};
        int N = 500;
        int i = 1, j = arr.length - 1;
        int[][] t = new int[N + 1][N + 1];
        for (int m = 0; m < N; m++) {
            for (int n = 0; n < N; n++) {
                t[m][n] = -1;
            }
        }
        System.out.println(mcm(arr,i,j,t));
    }

    private static int mcm(int[] arr, int i, int j, int[][] t) {

        if (i >= j) return 0;

        if (t[i][j] != -1) return t[i][j];

        int min_cost = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int temp_ans = mcm(arr, i, k, t) + mcm(arr, k + 1, j, t) + arr[i - 1] * arr[k] * arr[j];
            min_cost = Math.min(temp_ans, min_cost);
        }

        return t[i][j] = min_cost;


    }
}
