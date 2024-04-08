public class prefixSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        for (int val : arr) {
            System.out.print(val + " ");
        }

        

    }

}
