import java.util.PriorityQueue;

public class k_largest_elements {
    public static void main(String[] args) {
        int arr1[] = {72, 10, 4, 3, 20, 15};
        int k = 5;
        int arr[] = new int[k];

        arr = kElement(arr1, k);

        for (int val:arr){
            System.out.print(val+" ");
        }
    }

    private static int[] kElement(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ans[] = new int[k];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            pq.offer(arr[i]);
            if (pq.size() > k) pq.poll();
        }
       for(int val:pq){
           ans[j++]=val;
       }
        return ans;
    }
}
