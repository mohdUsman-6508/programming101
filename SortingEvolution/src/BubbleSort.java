public class BubbleSort {
    /// Inplace, stable algorithm
    // space--> O(1) ,time--> best-O(n) when array is already sorted
    // worst O(n^2) when array is sorted in decreasing order
    // bubble sort is also known as exchanging,sinking sort

    // basically we are comparing adjacent elements and at the end of each pass
    // one larger element will be sorted
    public static void main(String[] args) {
        int[] arr = {3, -1, 5, 4, -2, 0};
        bubble(arr);
        System.out.println("After Sorting:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    static void bubble(int[] arr) {
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    //swap swap swap !!!
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag = true;
                }
            }

            if (!flag) break;
        }
    }
}



///////

//    Bubble Sort:
//        Description:
//        Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
//        It passes through the list multiple times until the list is sorted.
//        Time Complexity:
//        Worst-case and average time complexity: O(n^2).
//        Best-case time complexity: O(n), when the list is already sorted.
//        Space Complexity: O(1) - Bubble sort is an in-place sorting algorithm.
//        Stability: Bubble sort is stable, meaning it preserves the relative order of equal elements.
//        Notes:
//        It is not recommended for large datasets due to its quadratic time complexity.
//        Bubble sort is useful primarily for educational purposes or for sorting small datasets.
//
