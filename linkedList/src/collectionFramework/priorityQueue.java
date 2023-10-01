package collectionFramework;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue<>();

        pq.offer(510);
        pq.offer(5);
        pq.offer(20);
        pq.offer(1);
        pq.offer(15);
        pq.offer(20);
        pq.offer(18);

        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println("XXXXXXXXXXXXXXXXX");
        while (pq.size()>0){
            System.out.println(pq);
            System.out.println(pq.poll());
//            System.out.println(pq);
        }
    }
}
