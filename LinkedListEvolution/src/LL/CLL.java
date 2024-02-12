package LL;

public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public class Node {
        private int val;
        private Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }

    //insert
    public void insert(int val) {
        Node node = new Node(val);
        if (head == null && tail == null) {
            head = node;
            tail = node;
            tail.next = head;
        }
        node.next = head;
        tail.next = node;
        tail = node;
        size++;
    }
    //delete

    public void delete() {
        tail.next = head.next;
        head = head.next;
        size--;
    }

    //display

    public void display() {
        Node node = head;
        do {
            System.out.print(node.val + "->");
            node = node.next;
        } while (node != head);
        System.out.print("START");
        System.out.println();
    }

    //display size

    public void size() {
        System.out.println("size:" + size);
    }
}
