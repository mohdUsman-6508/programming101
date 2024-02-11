package ArrayCalc;

public class ArrayCal {
    int[] array;
    final double pi = 3.1428571;

    ///run only once
    static {
        System.out.println("value of pi:" + 3.142);
    }

    public ArrayCal() {
    }

    public ArrayCal(int[] array) {
        this.array = array;
    }


    public void display() {
        for (int val : array) {
            System.out.print(val + " ");
        }
    }

    public int max() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        System.out.println("max: " + max);
        return max;
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        System.out.println("min: " + min);
        return min;
    }

    public int avg() {
        int avg = 0;
        int sum = 0;
        for (int val : array) {
            sum += val;
        }
        avg = sum / array.length;
        System.out.println("average: " + avg);
        return avg;
    }

    public int mid() {
        int len = array.length;
        int mid = (len / 2);
        System.out.println("mid: " + array[mid]);
        return array[mid];
    }

    public void pi() {
        System.out.println("pi:" + pi);
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected:)");
    }
}
