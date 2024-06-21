import java.util.Stack;

public class stockSpan {

    static class Pair {
        int first;
        int second;

    }

    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        int[] ans = new int[arr.length];
        Stack<Pair> st = new Stack<>();


        for (int i = 0; i < arr.length; i++) {
            Pair p = new Pair();
            if (st.isEmpty()) {
                ans[i] = -1;
            } else if (st.peek().first > arr[i]) {
                ans[i] = st.peek().second;
            } else if (st.peek().first <= arr[i]) {
                while (!st.isEmpty() && st.peek().first <= arr[i]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    ans[i] = -1;
                } else {
                    ans[i] = st.peek().second;
                }
            }

            p.first = arr[i];
            p.second = i;
            st.push(p);
        }

        for(int i=0;i<ans.length;i++){
            ans[i]=i-ans[i];
        }
        dis(ans);
    }

    public static void dis(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
