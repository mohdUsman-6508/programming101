public class osmancq {
    public static void main(String args[]) throws Exception {
        OsmanCircularQ cq = new DynamicCQ(5);
        System.out.println(cq.isEmpty());

        for (int i = 1; i <= 5; i++) cq.offer(i);
        cq.disp();
        cq.offer(6);
        System.out.println(cq.poll());
        cq.disp();
        System.out.println(cq.peek());

    }
}
