package pattern_nd_sorting;

public class q1 {
    public static void main(String[] args) {
//        int j=7;
//        pattern(j);

        triangle(5, 0);
        simpleTriangle(1, 0, 5);
    }

    private static void pattern(int j) {
        if (j == 0) return;

        int n = 0;
        while (n != j) {
            System.out.print("* ");
            n++;
        }
        System.out.println();
        pattern(j - 1);

    }


    private static void triangle(int r, int c) {

        if (r == 0) return;

        if (c < r) {
            System.out.print("* ");
            triangle(r, c + 1);

        } else {
            System.out.println();
            triangle(r - 1, 0);
        }
    }

    private static void simpleTriangle(int r, int c, int n) {
        if (r == n) {
            return;
        }

        if (c <= r) {
            System.out.print("* ");
            simpleTriangle(r, c + 1, n);
        } else {
            System.out.println();
            simpleTriangle(r + 1, 0, n);
        }

    }
}
