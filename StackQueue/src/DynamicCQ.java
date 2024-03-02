public class DynamicCQ extends OsmanCircularQ {
    public DynamicCQ() {
        super();
    }

    public DynamicCQ(int size) {
        super(size);
    }

    @Override
    public boolean offer(int val) throws Exception {
        if (this.isFull()) {
            int temp[] = new int[2 * data.length];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }

        return super.offer(val);
    }
}
