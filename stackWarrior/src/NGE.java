import java.util.Stack;

public class NGE {
    public static void main(String[] args) {

        int[] elements = {4, 5, 2, 10, 8};

        int[] nge = new int[elements.length];
        display(elements);
//        nextGreaterElement(elements, nge);
//        display(nge);
//        nextGreater(elements, nge);
//        display(nge);
//        nextGreaterToLeft(elements,nge);
//        nextSmallerToLeft(elements, nge);
        nextSmallerToRight(elements,nge);
        display(nge);
    }


    //brute force


    //here inner loop is depending on i so,O(n2) can be improved to O(n) using stack
    public static void nextGreaterElement(int[] elem, int[] nge) {
        int n = elem.length;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = i + 1; j < n; j++) {
                if (elem[j] > elem[i]) {
                    nge[i] = elem[j];
                    flag = false;
                    break;
                }
            }
            if (flag) {
                nge[i] = -1;
            }
        }
    }

    //optimised approach
    public static void nextGreater(int[] elem, int[] nge) {
        int n = nge.length;
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            //O(n2) to O(n)

            if (st.isEmpty()) {
                nge[i] = -1;
            } else if (elem[i] < st.peek()) {
                nge[i] = st.peek();
            } else if (elem[i] >= st.peek()) {
                while (elem[i] >= st.peek() && !st.isEmpty()) {
                    st.pop();
                }
                if (!st.isEmpty())
                    nge[i] = st.peek();
                else nge[i] = -1;
            }
            st.push(elem[i]);
        }
    }

    //nearest greater to left

    public static void nextGreaterToLeft(int[] elem, int[] nge) {
        int n = elem.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (st.isEmpty()) {
                nge[i] = -1;
            } else if (st.peek() > elem[i]) {
                nge[i] = st.peek();
            } else if (st.peek() <= elem[i]) {
                while (!st.isEmpty() && st.peek() <= elem[i]) {
                    st.pop();
                }

                if (st.isEmpty()) {
                    nge[i] = -1;
                } else {
                    nge[i] = st.peek();
                }
            }
            st.push(elem[i]);
        }

    }


    public static void nextSmallerToLeft(int[] arr, int[] ans) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {

            if (st.isEmpty()) {
                ans[i] = -1;
            } else if (st.peek() < arr[i]) {
                ans[i] = st.peek();
            } else if (st.peek() >= arr[i]) {
                while (!st.isEmpty() && st.peek() >= arr[i]) {
                    st.pop();
                }
                if (st.isEmpty()) ans[i] = -1;
                else ans[i] = st.peek();
            }
            st.push(arr[i]);
        }

    }

    public static void nextSmallerToRight(int[] arr, int[] ans) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {

            if (st.isEmpty()) {
                ans[i] = -1;
            } else if (st.peek() < arr[i]) {
                ans[i] = st.peek();
            } else if (st.peek() >= arr[i]) {
                while (!st.isEmpty() && st.peek() >= arr[i]) {
                    st.pop();
                }
                if (st.isEmpty()) ans[i] = -1;
                else ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
    }

    //display arr
    private static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }


}
