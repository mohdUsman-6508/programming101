import java.util.Scanner;

public class codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int x, y, z;
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();


            int ans = 0;

            if (x/3>= 1 && x%3 != 0) {
                ans = (x * y) + (x / 3) * z;
            }
            else if (x < 3) {
                ans = x * y;

            } else {
                ans = (x * y)+ ((x / 3) - 1) * z ;
            }
            System.out.println(ans);
        }
    }
}
