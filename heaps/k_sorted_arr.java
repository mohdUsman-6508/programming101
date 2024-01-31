
import java.util.PriorityQueue;

public class k_sorted_arr {
    public static void main(String[] args) {
        int[] arr={6,5,3,2,8,9,10};
        int k=3;
        int ans[]=new int[arr.length];
        kS(arr,k,ans);
        for(int val:ans){
            System.out.print(val+" ");
        }
    }

    private static int[] kS(int[] arr, int k,int[] ans){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int ind=0;

        for(int i=0;i<arr.length;i++){
            pq.offer(arr[i]);
            if(pq.size()>k){
                ans[ind]=pq.poll();
                ind++;
            }
        }
        while (!pq.isEmpty()) ans[ind++]=pq.poll();

        return ans;

    }
}
