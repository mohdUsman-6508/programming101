public class r3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=3;
        System.out.println(bs(arr,target,0,arr.length-1));
    }

    private static int bs(int[] arr,int target,int s,int e){
        if(s>e) return -1;

        int m=s+(e-s)/2;
        if(arr[m]==target) return m;

        if(arr[m]<target){
            return bs(arr,target,m+1,e);
        }
        return bs(arr,target,s,m-1);

    }

}
