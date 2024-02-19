public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {4,1,2,3,0};
        insertion(arr);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }


    // it has reduced some steps
    // it is partially sorting array
    private static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            while (j > 0) {
                if (arr[j] > arr[j - 1]) {
                    break;
                }
                if (arr[j] < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                j--;
            }
        }
    }
}


//Description:
//Insertion Sort is a simple sorting algorithm that builds the final sorted array one item at a time.
//It takes each element from the unsorted portion and places it in its correct position in the sorted portion.
//Time Complexity:
//Worst-case and average time complexity: O(n^2).
//Best-case time complexity: O(n), when the list is already sorted.
//Space Complexity: O(1) - Insertion sort is an in-place sorting algorithm.
//Stability: Insertion sort is stable.
//Notes:
//It is efficient for small datasets or nearly sorted arrays.
//Insertion sort is used in practice for sorting small arrays or as the final stage of more advanced sorting algorithms