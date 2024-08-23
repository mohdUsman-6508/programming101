package arrayQ;

import java.util.ArrayList;

public class q2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 4, 5, 8, 6, 5, 7};
        int n = 0, target = 5;
        System.out.println(linearSearch(arr, target, n));
        ArrayList<Integer> l = mls(arr, target, n);
        System.out.println(l);

        ArrayList<Integer> list = new ArrayList<>();
        ls(arr, target, n, list);
        System.out.println(list);
    }

    private static void ls(int[] arr,int target, int n, ArrayList<Integer> list){
        if(n==arr.length) return;
        if(arr[n]==target) list.add(n);

        ls(arr,target,n+1,list);
    }

    private static int linearSearch(int[] arr, int target, int n) {
        if (n == arr.length) return -1;
        if (arr[n] == target) return n;
        return linearSearch(arr, target, n + 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    private static ArrayList<Integer> mls(int[] arr, int target, int n) {
        if (n == arr.length) return list;
        if (arr[n] == target) list.add(n);
        return mls(arr, target, n + 1);
    }
}
