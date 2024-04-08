import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class ideoffline {
    public static class Stacks {
        int[] st = new int[1000];
        int top = -1;

        Stacks() {
        }

        void push(int value) {
            top++;
            st[top] = value;
        }

        int pop() {
            int deleted_top = st[top];
            top--;
            return deleted_top;
        }

        int size() {
            int size = top + 1;
            System.out.println("size:" + size);
            return top + 1;
        }

        void display() {
            for (int i = 0; i <= top; i++) {
                System.out.print(st[i] + " ");
            }
            System.out.println();
        }

        boolean isEmpty() {
            if (top == -1) return true;
            return false;
        }


    }

    public static class Queues {
        int[] capacity = new int[1];
        int first = 0;
        int last = 0;

        Queues() {
        }

        ;

        void push(int value) {
            if(last>=capacity.length){
                System.out.println("queue overflow");
                return;
            }
            capacity[last] = value;
            last++;
        }

        int pop() {
            if(last==0){
                System.out.println("Queue is empty:");
                return -1;
            }
            int topElement = capacity[first];
            first++;
            return topElement;
        }

        int size() {
            System.out.print("Size:");
            System.out.println(last - first );
            return last - first ;
        }

        void display() {
            for (int i = first; i < last; i++) {
                System.out.print(capacity[i] + " ");
            }
            System.out.println();
        }
          //in all the above method we can handle edge cases like size should not exceed etc.
    }

   public static class StackII{

        ;
    }

    public static void main(String[] args) {


    }


}

