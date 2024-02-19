
import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int arr[] = {5, -4, 3, -2, 1};
        qSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void qSort(int[] arr, int low, int high) {

        if (low >= high) return;

        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];

        while (s <= e) {
            while (arr[s] < pivot) s++;
            while (arr[e] > pivot) e--;
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        qSort(arr, low, e);
        qSort(arr, s, high);

    }
}

///
//Here are the notes for the QuickSort algorithm:
//
//        ### QuickSort:
//
//        - **Description**:
//        - QuickSort is a highly efficient sorting algorithm that follows the divide-and-conquer strategy.
//        - It selects a 'pivot' element from the array and partitions the other elements into two sub-arrays, according to whether they are less than or greater than the pivot.
//        - It then recursively sorts the sub-arrays.
//
//        - **Time Complexity**:
//        - Average-case time complexity: O(n log n).
//        - Worst-case time complexity: O(n^2) when the pivot selection is poor, such as always choosing the first or last element.
//        - Best-case time complexity: O(n log n).
//        - QuickSort is generally faster than other O(n log n) algorithms like Merge Sort, especially for smaller datasets.
//
//        - **Space Complexity**:
//        - QuickSort is an in-place sorting algorithm, meaning it doesn't require additional storage proportional to the input size beyond a small auxiliary stack.
//
//        - **Pivot Selection**:
//        - The choice of pivot significantly influences QuickSort's performance.
//        - In this implementation, the pivot is selected as the middle element, which helps to prevent the worst-case scenario for already sorted arrays.
//
//        - **Partitioning**:
//        - The partitioning step ensures that all elements less than the pivot are placed before it, and all elements greater than the pivot are placed after it.
//        - This process is achieved by incrementing one pointer from the left and another from the right, swapping elements when they are on the wrong side of the pivot.
//
//        - **Recursion**:
//        - After partitioning, QuickSort recursively sorts the left and right partitions.
//        - The left partition consists of elements less than the pivot, and the right partition consists of elements greater than the pivot.
//
//        - **Base Case**:
//        - The recursion terminates when the subarray to be sorted has only one element or is empty (low >= high).
//        - This prevents unnecessary recursive calls and ensures the algorithm converges to a sorted solution.
//
//        - **Stability**:
//        - QuickSort, as typically implemented, is not a stable sorting algorithm.
//        - The relative order of equal elements may change during the sorting process.
//
//        - **Efficiency**:
//        - QuickSort is highly efficient and widely used in practice, particularly for large datasets.
//        - It performs well even on average and worst-case scenarios, especially with good pivot selection strategies like using the median-of-three technique.
//
//        - **Usage**:
//        - QuickSort is used in various programming languages and libraries as a standard sorting algorithm due to its efficiency and versatility.
//
//        Understanding QuickSort and its implementation is crucial for understanding fundamental sorting algorithms and their optimization techniques.
