import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int arr[] = {1, 2, 3, 4, 5};
        int ind = 2;
        int ele = 9;
        arr = delete(arr, ind);
        System.out.println(Arrays.toString(arr));
        int narr[] = insert(arr, ele, ind);
        System.out.println(Arrays.toString(narr));
    }

    static int[] delete(int arr[], int ind) {

        for (int i = ind; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr = Arrays.copyOfRange(arr, 0, arr.length - 1);
        return arr;
    }

    static int[] insert(int arr[], int ele, int ind) {
        int narr[] = new int[arr.length + 1];
        narr[ind] = ele;
        for (int i = 0; i < ind; i++) {
            narr[i] = arr[i];
        }

        for (int i = ind; i < arr.length; i++) {
            narr[i + 1] = arr[i];
        }
        return narr;
    }
}