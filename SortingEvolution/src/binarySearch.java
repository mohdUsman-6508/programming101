public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int target = 13;
        int i = search(arr, target);
        System.out.println(i);

    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) return mid;
            else if (target < arr[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
