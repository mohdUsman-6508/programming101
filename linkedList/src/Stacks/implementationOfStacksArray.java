package Stacks;

public class implementationOfStacksArray {

    public static class Stack {
        int[] arrStk = new int[10];
        int size;

        Stack() {

        }

        int count = 0;

        void push(int val) {
            if (size >= arrStk.length) {
                System.out.println("Stack is full!");
                return;
            } else arrStk[size++] = val;

        }

        int peek() {
            System.out.println(arrStk[size - 1]);
            return arrStk[size - 1];
        }

        int pop() {

            if (size == 0) System.out.println("Stack is empty");
            else {
                int val = arrStk[size - 1];
                arrStk[size - 1] = 0;
                size--;
                System.out.println(val);
                return val;
            }
            return -1;
        }

        int size() {
            System.out.println(size);
            return size;
        }

        void reverse() {

            for (int i = size - 1; i >= 0; i--) {
                System.out.print(arrStk[i] + " ");
            }


            System.out.println("");
        }

        void display() {
            int i = 0;
            int count = size;
            while (count-- > 0) {
                System.out.print(arrStk[i++] + " ");
            }
            System.out.println(" ");
        }

        boolean isStackFull() {
            if (arrStk.length == size) {
                System.out.println("Stack is full");
                return true;
            } else System.out.println("Stack is not full");
            return false;
        }

    }


    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(2);
        stk.push(4);
        stk.push(9);
        stk.push(1);
        stk.push(8);
        stk.push(99);
        stk.display();
        stk.peek();
        stk.pop();
        stk.display();
        stk.peek();
        stk.push(23);
        stk.push(12);
        stk.pop();
        stk.display();
        stk.size();
        stk.push(49);
        stk.push(81);
        stk.push(38);
        stk.push(99);
        stk.display();
        stk.isStackFull();
        stk.pop();
        stk.push(21);
        stk.display();

        stk.reverse();
        stk.display();
        stk.pop();


    }
}
