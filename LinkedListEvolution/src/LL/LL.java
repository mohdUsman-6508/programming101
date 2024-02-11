package LL;

public class LL {

    Node head;
    Node tail;
    private int size;

//    static {
//        System.out.println(head);
//        System.out.println(tail);
//    }

    public LL() {
        this.size = 0;
    }

    class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    // insert functionality
    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertAtLast(int val) {
        Node node = new Node(val);
        if (tail == null) {
//            node.next = tail;
//            head = node;
//            tail = node;
////
            insertAtFirst(val);
        } else {
            tail.next = node;
        }
        tail = node;
        size++;

    }

    public void insertAt(int index, int val) {
        if (index == 0) {
            insertAtFirst(val);
            return;
        } else if (index == size - 1) {
            insertAtLast(val);
            return;
        } else {
            Node node = new Node(val);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }

        size++;

    }

    /// deletion functionality

    public Node deleteFirst() {
        if (head == null) {
            return null;
        }
        Node first = head;
        head = head.next;
        size--;
        return first;
    }

    public Node deleteLast() {
        if (head == null) return null;

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
        return tail;
    }

    public Node deleteAt(int index) {
        if (head == null) return null;
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size) {
            return deleteLast();
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return temp.next;

    }

    //displaying functionality
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //getsize

    public void size() {
        System.out.println("size: " + size);
    }

}
