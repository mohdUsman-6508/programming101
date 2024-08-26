package dividendConquere;

import java.util.Arrays;

public class qs {
    public static void main(String[] args) {
        int[] arr = {5, 4, -3, 2, 1};
        int l = 0, h = arr.length-1;
        sort(arr, l, h);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int l, int h) {

        if (l >= h) return;

        int s = l, e = h;
        int m = s + (e - s) / 2;
        int pivot = arr[m];

        while (s <= e) {

            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;e--;
            }
        }

        sort(arr, l, e);
        sort(arr, s, h);
    }
}
