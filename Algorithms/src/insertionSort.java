public class insertionSort {


    //ctrl + alt+ L to decorate the text


    ///////////////algo which select an element and insert it at its correct position
    static void iSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {

            for (int j = i + 1; j > 0; j--) {

                if (arr[j]<arr[j-1]) {
                    ///to write the algo for sorting in decreasing order then just reverse the sign i.e. > instead of <
                    ////swapping
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 7,9,4,-2};

        iSort(arr);
        for (int i : arr
        ) {
            System.out.print(" " + i);

        }

    }
}
