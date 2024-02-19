public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {2, 7, -3, 0, -4, 5};
        selection(arr);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    static void selection(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int index = -1;
            int min = Integer.MAX_VALUE;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    index = j;
                    min = arr[j];
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
        }
    }
}

///Description:
//Selection Sort is a simple sorting algorithm that repeatedly selects the minimum element from the unsorted portion and swaps it with the first unsorted element.
//It divides the input array into two parts: sorted and unsorted.
//Time Complexity:
//Worst-case, average, and best-case time complexity: O(n^2).
//Space Complexity: O(1) - Selection sort is an in-place sorting algorithm.
//Stability: Selection sort is not stable.
//Notes:
//Despite its simplicity, it performs inefficiently on large lists.
//It performs fewer writes compared to insertion sort but more comparisons, making it inefficient for large datasets.
