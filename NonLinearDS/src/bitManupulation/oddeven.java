package bitManupulation;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = 5;
        while (t-- > 0) {
            int n = sc.nextInt();
            if ((n & 1) == 0) System.out.println("even");
            else System.out.println("odd");
        }
    }
}
