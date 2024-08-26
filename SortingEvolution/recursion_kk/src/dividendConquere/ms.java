package dividendConquere;

import java.util.Arrays;

public class ms {
    public static void main(String[] args) {

        int[] arr = {4, -12, 5, -6, 5, 1};
//        int[] ans = mergeSort(arr);
//        display(ans);

        mergeSortInplace(arr, 0, arr.length);
        display(arr);
    }

    private static void mergeSortInplace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = s + (e - s) / 2;
        mergeSortInplace(arr, s, mid);
        mergeSortInplace(arr, mid, e);
        merge(arr, s, mid, e);
    }

    private static void merge(int[] arr, int s, int mid, int e) {
        int i = s, j = mid, k = 0;
        int[] mix = new int[e - s];

        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) mix[k++] = arr[i++];
        while (j < e) mix[k++] = arr[j++];

        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }

    private static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = (arr.length) / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] sorted = new int[left.length + right.length];
        int i = 0, j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                sorted[k] = left[i];
                i++;
            } else {
                sorted[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) sorted[k++] = left[i++];
        while (j < right.length) sorted[k++] = right[j++];

        return sorted;
    }

    private static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

}
