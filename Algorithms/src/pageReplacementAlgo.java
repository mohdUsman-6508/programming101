import java.util.Stack;

public class pageReplacementAlgo {
    public static void main(String[] args) {

        int[] pageNumber = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2, 1, 2, 0, 1, 7, 0, 1};
        Stack<Integer> runningPages = new Stack<>();
        Stack<Integer> helper = new Stack<>();
        int size = 3;
        int pageFault = 0;

        for (int i = 0; i < pageNumber.length; i++) {
            if (i < size) {
                runningPages.push(pageNumber[i]);
                pageFault++;
            }
            if (i >= size) {
                boolean flag = true;
                while (!runningPages.isEmpty()) {
                    if (runningPages.peek() == pageNumber[i]) {
                        flag = false;
                        runningPages.pop();
                        break;
                    }
                    helper.push(runningPages.pop());
                }
                if (flag) pageFault++;
                if (!helper.isEmpty() && flag) helper.pop();
                while (!helper.isEmpty()) runningPages.push((helper.pop()));
                runningPages.push(pageNumber[i]);
            }
        }

        System.out.println("Total Page Faults: " + "" + pageFault);

    }
}
