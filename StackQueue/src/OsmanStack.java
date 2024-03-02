public class OsmanStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public OsmanStack() {
        this(DEFAULT_SIZE);
    }

    public OsmanStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int val) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is full!");
        }
        ptr++;
        data[ptr] = val;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) throw new Exception("Stack is Empty!");
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws Exception {
        if (isEmpty()) throw new Exception("Stack is Empty!");
        return data[ptr];
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean isFull() {
        return ptr >= data.length - 1;
    }

    public void disp() {
        for (int i = 0; i <= ptr; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

}
