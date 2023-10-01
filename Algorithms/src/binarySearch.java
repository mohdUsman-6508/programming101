public class binarySearch {


//    recursive binary search approach

    static boolean rbSearch(int[] arr, int target, int start, int end) {

        int mid = start + (end - start) / 2;

        if (start <= end) {

            if (target == arr[mid]) {
                return true;
            } else if (target > arr[mid]) {
                start = mid + 1;
                return rbSearch(arr, target, start, end);
            } else {
                end = mid - 1;
               return rbSearch(arr, target, start, end);
            }
        }
        return false;
    }


    //    ********************************************************************************************
    //    iterative approach of binary search algorithm
    static boolean ibSearch(int[] a, int start, int target) {
        int end = a.length - 1;

//        int mid=(start+end)/2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == a[mid]) {
                return true;
            } else if (target > a[mid]) {
//                when array is sorted in non-increasing order then chage condition to target<a[mid]
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4, 5, 6,12,14,16,17,90};
        int[] b = {6, 4, 2, 1};
        int target = 7;
        int s = 0;
//        while (target++<10) {
//
//        }
        System.out.println(ibSearch(a, s, target));
        System.out.println(rbSearch(a, target, 0, a.length - 1));
    }
}
