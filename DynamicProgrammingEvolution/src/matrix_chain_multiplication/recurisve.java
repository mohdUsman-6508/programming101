package matrix_chain_multiplication;

public class recurisve {
    public static void main(String[] args) {
        int[] arr = {10, 30, 5, 60};
        int i = 1, j = arr.length - 1;
        int minCost = mcm(arr, i, j);
        System.out.println(minCost);
    }

    private static int mcm(int[] arr, int i, int j) {
        int min_cost = Integer.MAX_VALUE;
        if (i >= j) return 0;

        for (int k = i; k <= j - 1; k++) {
            int temp_ans = mcm(arr, i, k) + mcm(arr, k + 1, j) + arr[i - 1] * arr[k] * arr[j];
            min_cost = Math.min(temp_ans, min_cost);
        }

        return min_cost;
    }
}
