package arrayQ;

public class q1 {
    public static void main(String args[]){

        int[] arr = {-1,2,3,-7};
        System.out.println(isSort(arr,0));
    }

    private static boolean isSort(int[] arr,int s){
        if(s==arr.length-1) return true;

        if(arr[s]>arr[s+1]) return false;

        return isSort(arr,s+1);
    }
}
