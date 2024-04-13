import java.util.Stack;

public class NGE {
    public static void main(String[] args) {

        int[] elements = {1, 3, 2, 4};

        int[] nge = new int[elements.length];
        display(elements);
//        nextGreaterElement(elements, nge);
//        display(nge);

        nextGreater(elements, nge);
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
        for (int i = 0; i < elem.length; i++) {
            st.push(elem[i]);
        }
        nge[n - 1] = -1;
        int tempGreater = -1;
        for (int i = n - 1; i > 0; i--) {
            //O(n2) to O(n)
            int peek = st.peek();
            if (elem[i - 1] < peek) {
                tempGreater = peek;
                nge[i - 1] = tempGreater;
            }
            else if(elem[i-1]>peek && elem[i-1]>tempGreater){
                nge[i-1]=-1;
            }
            else {
                nge[i - 1] = tempGreater;
            }
            st.pop();
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
