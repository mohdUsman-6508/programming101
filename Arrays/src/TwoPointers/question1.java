package TwoPointers;

import java.util.ArrayList;
import java.util.List;

//pairs with sum=k
public class question1 {
    public static void main(String[] args) {
//        int[] arr = {1,4,4,5,5,5,6,6,11};
//        int k=11;
        int[] arr = {1, 4, 6, 6, 6, 8, 9};
        int[] a = {1, 5, 4, 3};
        int k = 12;
        int ab = pairs(arr, k);
        System.out.println(ab);
        System.out.println(maxArea(a));

        int arr1[]={0,0,1,0,1,0,0,0,1,1,0,1};
        sort10(arr1);
        for(int val:arr1) System.out.print(val+" ");


    }

    //
    private static int pairs(int[] arr, int k) {
        int ans = 0;
        int pt1 = 0;
        int pt2 = arr.length - 1;
        while (pt1 < pt2) {

            if (arr[pt1] + arr[pt2] < k) pt1++;
            else if (arr[pt1] + arr[pt2] > k) pt2--;
            else {
                int c1 = 0, c2 = 0;
                if (arr[pt1] != arr[pt2]) {
                    int temp = arr[pt1];
                    while (arr[pt1] == temp) {
                        pt1++;
                        c1++;
                    }
                    int temp2 = arr[pt2];
                    while (arr[pt2] == temp2) {
                        pt2--;
                        c2--;
                    }
                    ans += c1 * c2;
                } else {
                    ans += pt2 - pt1 + 1;
                    pt1++;
                }

            }
        }


        return Math.abs(ans);
    }

    private static int maxArea(int[] arr) {
        int start = 0, end = arr.length - 1;
        int area = 0;
        while (start < end) {
            int a = Math.min(arr[start], arr[end]) * (end - start);
            area = Math.max(a, area);
            if (arr[start] < arr[end]) start++;
            else end--;
        }
        return area;
    }

    private static void sort10(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <end) {
            if (arr[start] > arr[end]) {
                //swap
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            } else if (arr[start] == arr[end] && arr[end] == 0) start++;
            else if (arr[start] == arr[end] && arr[end] == 1) end--;
            else{
                start++;end--;
            }
        }
    }


    }
