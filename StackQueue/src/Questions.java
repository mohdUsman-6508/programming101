import java.util.Stack;

public class Questions {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        st1.push(2);
        st1.push(1);
        st1.push(8);
        st1.push(5);
        st2.push(4);
        st2.push(2);
        st2.push(4);
        st2.push(6);
        st2.push(1);


        int count = gos(st1, st2, 10, 0, 0);
        System.out.println("count:"+ count);
    }

    private static int gos(Stack<Integer> st1, Stack<Integer> st2, int sum, int cnt, int rs) {
        if (st1.isEmpty() || st2.isEmpty() || rs >=sum) {
            return cnt;
        }
        int rs1 = st1.pop();
        int count1 = gos(st1, st2, sum, cnt + 1, rs + rs1);
        int rs2 = st2.pop();
        int count2 = gos(st1, st2, sum, cnt + 1, rs + rs2);
        return Math.max(count1, count2);

    }
}
