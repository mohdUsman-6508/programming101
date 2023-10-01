public class binarySearchQuestions {

    static int findMin(int[] arr) {
        int len = arr.length;
        int start = 0;
        int end = len - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                start = mid + 1;

            } else if (arr[mid] <= arr[end]) {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    static int findInt(int[] arr, int target) {
        int len = arr.length;
        int start = 0;
        int end = len - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < arr[end]) {

                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            } else {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    ///////
    static boolean check(int[] arr, int student, int maxChoc) {

        int noStu = 1;
        int choc = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxChoc) return false;

            if (choc + arr[i] <= maxChoc) {
                choc += arr[i];
            } else {
                noStu++;
                choc = arr[i];
            }
        }
        return noStu <= student;
    }

    //////////
    static int findMinimalMax(int[] arr, int student) {
        if (student > arr.length) return -1;
        int ans = 0;
        int start = 1, end = (int) 1e9;

        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (check(arr, student, mid)) {

                ans = mid;
                end = mid - 1;

            } else {
                start = mid + 1;
            }


        }
        return ans;
    }
/////////////////////////////////////


    static boolean isPlaced(int[] points, int kid, int dist) {
        int kidplace = 1;
        int lastkid = points[0];

        for (int i = 1; i < points.length; i++) {
            if (points[i] - lastkid >= dist) {
                kidplace++;
                lastkid = points[i];
            }
        }

        return kidplace >= kid;
    }

    static int findMaximalMin(int[] points, int kid) {
        int ans = -1;
        if (points.length < kid) return -1;
        int start = 1, end = (int) 1e9;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPlaced(points, kid, mid)) {
                ans = mid;
                start = mid + 1;
            } else {

                end = mid - 1;
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        //******************************************
        //Pattern 1 Search in 'ROTATED SORTED ARRAY'
        //******************************************


        //other type questions on leetcode

//        int[] arr = {4, 5, 6, 7, 1, 2, 3};
//        int target = 1;
////        System.out.println(findMin(arr));
//
//        System.out.println(findInt(arr, target));

//
//        int[] choclate = {5,3,1,4,2};
//        int noStudents = 3;
//
//        System.out.println(findMinimalMax(choclate, noStudents));


        int[] points = {1,2,4,8,9};
        int kids = 3;

        System.out.println(findMaximalMin(points, kids));

    }
}
