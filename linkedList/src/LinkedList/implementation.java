package LinkedList;


public class implementation {
    public static class Node {
        int data;
        Node next;

        Node() {

        }

        Node(int data) {
            this.data = data;
        }
    }


    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }
///

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        //////////
        int length() {

            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            // System.out.println(count);
            System.out.println();
            return count;
        }

        void insertAtHead(int val) {
            Node temp = new Node(val);

            if (head == null) {//empty list
                head = tail = temp;
            } else {//non-empty list
                temp.next = head;
                head = temp;
            }
        }

        ////////////////

        void insert(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;

            if (idx == 0) {
                insertAtHead(val);
                return;
            } else if (idx == length()) {
                insertAtEnd(val);
                return;
            } else if (idx < 0 || idx > length()) {
                System.out.println("invalid index!");
            } else {
                for (int i = 1; i <= idx - 1; i++) {
                    temp = temp.next;
                }
                t.next = temp.next;
                temp.next = t;

            }

        }

        int getVal(int idx) {

            if (idx < 0 || idx > length()) {
                System.out.println("invalid index");
            } else {
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
            return -1;
        }

        void deleteAt(int idx) {
            if (idx == 0) {
                head = head.next;
            }

            Node temp = head;

            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (idx == length()) {
                tail = temp;
            }
        }
    }


    public static void main(String[] args) {

        linkedlist ll = new linkedlist();
        ll.insertAtEnd(89);
        ll.insertAtEnd(59);
        ll.insertAtEnd(54);
        ll.insertAtEnd(12);
        ll.insertAtEnd(92);
//        ll.display();
//        ll.length();
        ll.insertAtHead(63);
//        ll.display();
        ll.insert(1, 44);
        ll.insert(5, 11);
        ll.display();
//        System.out.println(ll.getVal(12));
        ll.deleteAt(0);
        System.out.println(ll.tail.data);
        ll.display();

    }
}
