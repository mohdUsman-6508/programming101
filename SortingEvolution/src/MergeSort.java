import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {3, 1, -2, 10, -12, 5};
//        int[] a = sort(arr);
        sortIn(arr, 0, arr.length);
        for (int val : arr) {
            System.out.print(val + " ");
        }

    }

    static int[] sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int arr1[] = sort(Arrays.copyOfRange(arr, 0, mid));
        int arr2[] = sort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(arr1, arr2);
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (i < arr1.length && (j >= arr2.length || arr1[i] < arr2[j])) {
                ans[k] = arr1[i];
                i++;
            } else {
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (j < arr2.length)
            ans[k++] = arr2[j++];

        while (i < arr1.length)
            ans[k++] = arr1[i++];

        return ans;
    }

    static void sortIn(int[] arr, int s, int e) {
        if (e - s == 1) return;

        int mid = (s + e) / 2;
        sortIn(arr, s, mid);
        sortIn(arr, mid, e);
        mergeIn(arr, s, e, mid);
    }

    static void mergeIn(int[] arr, int s, int e, int m) {
        int mix[] = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else mix[k] = arr[j++];

            k++;
        }

        while (i < m) mix[k++] = arr[i++];
        while (j < e) mix[k++] = arr[j++];

        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }

}


// ****************************************************  NOTES *******************************************************//

//    Here are some concise notes for the provided merge sort implementation:
//
//        1. **Merge Sort Algorithm**:
//        - Merge sort is a divide-and-conquer algorithm that recursively divides the array into halves until each subarray contains only one element, then merges them back in sorted order.
//        - It has a time complexity of O(n log n) for average and worst-case scenarios.
//
//        2. **sortIn Method**:
//        - Recursively sorts the given subarray.
//        - Divides the subarray into halves until it contains only one element, then merges them back in sorted order.
//
//        3. **mergeIn Method**:
//        - Merges two sorted subarrays into one sorted subarray.
//        - Uses an auxiliary array to temporarily store the merged subarray.
//        - Iterates through both subarrays, comparing elements and merging them into the auxiliary array.
//        - Copies the merged array back to the original array.
//
//        4. **Base Case**:
//        - If the subarray contains only one element, it's considered already sorted and no further action is needed.
//
//        5. **Pointers**:
//        - Uses pointers to keep track of elements in the subarrays and the merged array.
//
//        6. **Time Complexity**:
//        - Merge sort has a time complexity of O(n log n) due to its divide-and-conquer approach.
//        - The merge step takes O(n) time to merge two sorted subarrays of size n/2.
//
//        7. **Space Complexity**:
//        - Requires additional space for the auxiliary array used in the merge step.
//        - Space complexity is O(n) due to the auxiliary array.
//
//        8. **Stable Sorting**:
//        - Merge sort is a stable sorting algorithm, meaning it preserves the relative order of equal elements in the sorted output.
//
//        9. **Efficiency**:
//        - Merge sort is efficient for large datasets and is widely used in practice.
//        - Its recursive nature makes it suitable for parallelization and external sorting algorithms.