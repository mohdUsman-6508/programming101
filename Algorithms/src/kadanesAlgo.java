public class kadanesAlgo {
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int sum = maxSum1(arr);
        int sum2 = maxSubArray(arr);
        System.out.println("sum(kadane):" + sum2);
        System.out.println("sum: " + sum);
    }


    //brute force
    private static int maxSum1(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int maxSum = 0;
            for (int j = i; j < arr.length; j++) {
                maxSum += arr[j];
                max = Math.max(maxSum, max);
            }
        }
        return max;

    }

    //Kadane's Algorithm
    private static int maxSubArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum < 0) sum = 0;
            sum += arr[i];
            max = Math.max(max, sum);
        }
        return max;
    }
}
