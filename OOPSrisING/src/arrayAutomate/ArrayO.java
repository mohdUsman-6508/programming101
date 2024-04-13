package arrayAutomate;

public class ArrayO {
    int[] arr;
    public ArrayO() {

    }
    public ArrayO(int[] arr) {
        this.arr = arr;
    }
    public void display() {
        for (int val : this.arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    public void displayR() {
        for (int i = this.arr.length; i > 0; i--) {
            System.out.print(this.arr[i - 1] + " ");
        }
        System.out.println();
    }
    public int sum() {
        int total = 0;
        for (int val : this.arr) {
            total += val;
        }

        return total;
    }
    public int[] maxAndMin() {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] maxAndMin = new int[2];
        for (int val : this.arr) {
            if (val > max) max = val;
            if (val < min) min = val;
        }
        maxAndMin[0] = max;
        maxAndMin[1] = min;

        return maxAndMin;
    }
    public int[] oddAndEven() {
        int[] oddAndEven = new int[2];
        int odd = 0;
        for (int val : this.arr) {
            if (val % 2 != 0) odd++;
        }
        oddAndEven[0] = odd;
        oddAndEven[1] = this.arr.length - odd;

        return oddAndEven;
    }
    public int[] positiveAndNegative() {
        int[] positivesAndNegatives = new int[2];
        int positiveCount = 0;
        for (int val : this.arr) {
            if (val > 0) positiveCount++;
        }

        positivesAndNegatives[0] = positiveCount;
        positivesAndNegatives[1] = this.arr.length - positiveCount;
        return positivesAndNegatives;
    }
    public float average() {
        int total = this.sum();
        float avg = total / this.arr.length;
        return avg;
    }
    public void info() {
        this.display();
        System.out.println("sum of all elements: " + this.sum());
        System.out.println("average: " + average());
        int[] maxMin = maxAndMin();
        System.out.println("max and min value: " + maxMin[0] + " " + maxMin[1]);
        int[] oddEven = oddAndEven();
        System.out.println("odd-count and even-count: " + oddEven[0] + " " + oddEven[1]);
        int[] positiveNegative = positiveAndNegative();
        System.out.println("positive count and negative-count: " + positiveNegative[0] + " " + positiveNegative[1]);
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Automating garbage collection in progress....");
    }
}
