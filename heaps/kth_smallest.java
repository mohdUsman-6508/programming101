import java.util.Comparator;
import java.util.PriorityQueue;

public class kth_smallest {
    public static void main(String[] args) {
        int arr[] = {2, 3, 7, 5, 6, 1};
        int k = 3;
        System.out.println(kthSmallest(arr, k));
    }

    private static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            pq.offer(arr[i]);
            if (pq.size() > k) pq.poll();
        }
        return pq.peek();
    }
}
