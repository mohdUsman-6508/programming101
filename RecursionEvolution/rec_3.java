public class rec_3 {
    public static void main(String[] args) {
        int arr[] = {2, 1, -3, -15, 1, 6, -14, 3};
//        int s=calSum(arr,arr.length-1);
//        System.out.println(s);
//        System.out.println(findMax(arr, arr.length - 1));
//        System.out.println(findLastNeg(arr,arr.length-1));
    }

    private static int calSum(int[] arr, int l) {
        if (l == 0) return arr[0];
        int sum = calSum(arr, l - 1);
        sum += arr[l];
        return sum;
    }

    private static int findMax(int[] arr, int l) {
        if (l == 0) return arr[l];
        int max = findMax(arr, l - 1);
        if (max < arr[l]) max = arr[l];
        return max;
    }

    private static int findLastNeg(int[] arr, int l) {
        if (arr[l] < 0){
            return arr[l];
        }
        return findLastNeg(arr, l - 1);
    }

}
