public class OsmanQueue {
    protected int data[];
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    public OsmanQueue() {
        this(DEFAULT_SIZE);
    }
    public OsmanQueue(int size) {
        this.data = new int[size];
    }

    public boolean add(int val) throws Exception {
        if (isFull()) throw new Exception("Queue is Full! ");
        data[end++] = val;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) throw new Exception("Queue is Empty!");
        int removed = data[0];

        for (int i = 1; i < data.length; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }

    public int peek() throws Exception {
        if (isEmpty()) throw new Exception("Queue is Empty!");
        return data[0];
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean isFull() {
        return end >= data.length;
    }
    public void disp() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

}
