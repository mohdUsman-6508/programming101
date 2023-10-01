package collectionFramework;

import queue.circularQueue;

import java.util.LinkedList;
import java.util.Queue;

public class queueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
/// in CP use offer , poll ,element
        // adding
        q.add(19);
        q.offer(39); // want to avoid throw exception error use it
        q.offer(93);
        q.offer(38);
        System.out.println(q);

        // peek element
        System.out.println(q.peek());
        System.out.println(q.element());

        // remove element
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);

    }
}
