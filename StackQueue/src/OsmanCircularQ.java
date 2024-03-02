import javax.swing.plaf.PanelUI;

public class OsmanCircularQ {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int front = 0;
    protected int end = 0;
    protected int size = 0;

    public OsmanCircularQ() {
        this(DEFAULT_SIZE);
    }

    public OsmanCircularQ(int size) {
        this.data = new int[size];
    }

    public boolean offer(int val) throws Exception {
        if (isFull()) throw new Exception("Q is Full!");
        data[end++] = val;
        end = end % data.length;
        size++;
        return true;
    }

    public int poll() throws Exception {
        if (isEmpty()) throw new Exception("Q is Empty!");

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int peek() throws Exception {
        if (isEmpty()) throw new Exception("Q is Empty!");
        return data[front];
    }

    public void disp() throws Exception {
        if (isEmpty()) throw new Exception("Q is Empty!");
        int i = front;
        do {
            System.out.print(data[i++] + " ");
            i = i % data.length;
        } while (i != end);
        System.out.println();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size >= data.length;
    }
}
