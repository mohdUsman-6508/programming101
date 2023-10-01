package Stacks;

import org.w3c.dom.ls.LSOutput;

public class stackImplementationLinkedList {
    public static class Node {
        int val;
        Node next;

        Node() {

        }

        Node(int val) {
            this.val = val;
        }


    }

    public static class Stack {

        Node head = null;
        int size;

        Stack() {

        }


        void push(int data) {

            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            size++;

        }


        void displayR(Node h) {

            if (h == null) return;
            displayR(h.next);
            System.out.print(h.val + " ");

        }

        int peek() {

            System.out.println();
            System.out.print(head.val);
            return head.val;

        }

        int pop() {
            System.out.println();

            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            head = head.next;
            size--;
            return head.val;
        }


        int size() {
            System.out.println("");
            System.out.println(size);
            return size;
        }

        void display() {
            displayR(head);
        }


    }

    public static void main(String[] args) {

        Stack st = new Stack();
        st.push(2);
        st.push(4);
        st.push(7);
        st.push(9);
        st.push(12);
        st.display();
        st.peek();
        st.pop();
        st.display();
        st.size();
    }

}
