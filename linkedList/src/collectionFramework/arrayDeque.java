package collectionFramework;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        adq.add(10);
        adq.offerFirst(29);
        adq.add(93);
        adq.addLast(99);
        adq.add(30);
        System.out.println(adq);

        adq.poll();
        System.out.println(adq);
        adq.pollLast();
        System.out.println(adq);

        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

    }
}
