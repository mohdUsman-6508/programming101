package specialQuestions;

import java.util.Stack;

public class slidingWindow_Celebrity {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int[] nums = {1, 2, 4, 5, 6};//2 4 5 6 -1
        int n = nums.length;
        int[] nge = new int[n];
        nge[n - 1] = -1;
        st.push(nums[n-1]);

        for (int i = n - 2; i >= 0; i--) {

            while (st.size() > 0 && nums[i] > st.peek()) {
                st.pop();
            }

            if (st.size() == 0) nge[i] = -1;
            else nge[i] = st.peek();

            st.push(nums[i]);
        }

        for(int val:nge){
            System.out.print(val+" ");
        }
    }
}
