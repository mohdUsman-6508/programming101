public class quickSort {

    static void swap(int[] array, int s, int l) {
        int temp = array[s];
        array[s] = array[l];
        array[l] = temp;
    }

    static int partition(int a[], int f, int l) {
        int pivot = a[f];
        int count = 0;
        for (int i = f + 1; i < a.length; i++) {
            if (pivot >= a[i]) count++;
        }
        int pivotI = f + count;
        swap(a, f, pivotI);

        int i = f, j = l;
        //elements lesser to left ,larger to right
        while (i<pivotI && j>pivotI) {
            while (a[i] <= pivot) i++;
            while (a[j] > pivot) j--;
            if (i < pivotI && j > pivotI) {
                swap(a, i, j);
                i++;
                j--;
            }
        }

        return pivotI;
    }

    static void quickSort(int a[], int f, int l) {

        if (f >= l) return;
        int p = partition(a, f, l);
        quickSort(a, f, p - 1);
        quickSort(a, p + 1, l);

    }

    public static void main(String[] args) {
        int a[] = {3, 6, 3,1, 8, 4, 0, 9};
        quickSort(a, 0, a.length-1);
        for (int val : a) {
            System.out.print(val+ " ");
        }
    }
}
