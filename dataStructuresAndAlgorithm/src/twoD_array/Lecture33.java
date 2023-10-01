package twoD_array;

import java.util.ArrayList;

public class Lecture33 {

    static int searchAllIdx(int[] array, int n, int idx, int target) {
        if (idx >= n) {
            return -1;
        }
        //////////////self work
        if (array[idx] == target) {
            System.out.print(idx + " ");
        }

        return searchAllIdx(array, n, idx + 1, target);

    }

    //////////////////////
////////////////////find index at which number is present

    static int searchIdx(int[] array, int n, int idx, int target) {
        if (idx >= n) {
            return -1;
        }
        //////////////self work
        if (array[idx] == target) {
            return idx;
        }
        return searchIdx(array, n, idx + 1, target);

    }

    ////////////////

    static boolean search(int[] array, int n, int idx, int target) {
        if (idx >= n) {
            return false;
        }
        //////////////self work
        if (array[idx] == target) {
            return true;
        }
        return search(array, n, idx + 1, target);

    }
    ////////////////////////////////////////////////////////////

    ////using arraylist find all indices of given number
    static ArrayList<Integer> allIndices(int[] a, int n, int idx, int target) {

        ArrayList<Integer> ans = new ArrayList<>();
        if (idx >= n) {
            return new ArrayList<Integer>();
        }
        if (target == a[idx]) {
            ans.add(idx);
        }
        ArrayList<Integer> smallans = allIndices(a, n, idx + 1, target);
        ans.addAll(smallans);
        return ans;
    }





    static boolean isSorted(int[] array, int n, int idx){

        if (n>=idx){
            return false;
        }
        if (array[idx]<=array[idx+1]){
            
            return true;
        }
        return isSorted(array,array.length,idx+1);

    }
        /******************************************************************************************************/

        public static void main(String[] args){

            twoD_Array ta = new twoD_Array();

            int[] array = {1, 2, 3, 4, 6};


            if (search(array, array.length, 0, 49)) {

                System.out.println("Found");
            } else System.out.println("not found");

            System.out.println(searchIdx(array, array.length, 0, 63));

            searchAllIdx(array, array.length, 0, 2);
            ArrayList<Integer> ans=allIndices(array,array.length,0,2);

            for (Integer i:ans
                 ) {
                System.out.println(ans);
                
            }

         if (isSorted(array,array.length,0)){
             System.out.println("sorted");
         }
         else System.out.println("not sorted");
       }
}

