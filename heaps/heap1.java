import java.util.Comparator;
import java.util.PriorityQueue;

public class heap1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();///for min heap(by default)
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        //min element always at top (here priority will be given to min element always)
        pq.add(-2);
        pq.add(5);
        pq.add(-3);
        pq.add(20);
        pq.add(10);
        pq.add(9);
        System.out.println(pq);
        int len = pq.size();
        for (int i = 0; i < len; i++) {
            System.out.print(pq.poll()+" ");
        }

        pq1.add(-2);
        pq1.add(5);
        pq1.add(-3);
        pq1.add(20);
        pq1.add(10);
        pq1.add(9);
        System.out.println(pq1);
        while (pq1.isEmpty() != true) {
            System.out.print(pq1.poll()+" ");
        }
    }
}
