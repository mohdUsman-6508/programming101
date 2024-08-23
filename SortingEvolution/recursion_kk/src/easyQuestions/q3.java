package easyQuestions;

public class q3 {
    public static void main(String[] args) {
        int num = 1234;
        int temp = num;
        int n = getLen(temp);
        System.out.println(reverse(num, n));
        System.out.println(isPalindrome(131));
    }

    private static int reverse(int num, int n) {
        if (num == 0) return 0;
        return num % 10 * (int) (Math.pow(10, n - 1)) + reverse(num / 10, n - 1);
    }

    private static boolean isPalindrome(int num) {
        int temp = num;
        int n = getLen(temp);
        int rtemp = reverse(num, n);
        if (rtemp == num) return true;
        return false;
    }

    private static int getLen(int num) {
        int temp = num;
        int n = 0;
        while (temp > 0) {
            temp /= 10;
            n++;
        }

        return n;
    }
}
