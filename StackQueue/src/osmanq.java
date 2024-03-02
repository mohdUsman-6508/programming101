public class osmanq {
    public static void main(String[] args) throws Exception {
        OsmanQueue q = new OsmanQueue();

        for (int i = 0; i < 5; i++) q.add(i);
        q.disp();
        System.out.println(q.peek());
        System.out.println(q.remove());

    }
}
