public class vsw_1 {
    public static void main(String[] args) {

        int[] arr = {4, 1, 1, 2, 3, 5};
        int k = 6;
        System.out.println(maxSubArray(arr, k));
        System.out.println(maxSubArrayOpt(arr, k));

    }


    //brute force

    public static int maxSubArray(int[] arr, int k) {
        int subLen = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    subLen = Math.max(subLen, j - i + 1);
                    break;
                } else if (sum > k) break;
            }
        }
        return subLen;
    }

    public static int maxSubArrayOpt(int[] arr, int k) {
        int j = 0;
        int i = 0;
        int maxL = 0;
        int sum = 0;

        while (j < arr.length) {
            sum += arr[j];
            if (sum < k) j++;
            else if (sum == k) {
                maxL = Math.max(maxL, j - i + 1);
                j++;
            } else if (sum > k) {
                while (sum > k) {
                    sum -= arr[i];
                    i++;
                }
                j++;
            }
        }

        return maxL;

    }

}
