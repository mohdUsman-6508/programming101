package LL;

public class DLL {
    private Node head;
    private int size;

    public class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    //insert
    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) head.prev = node;
        head = node;
        size++;
    }

    //display

    public void display() {
        Node node = head;
        Node last = head;
        while (node != null) {
            System.out.print(node.val + "->");
            last = node;
            node = node.next;
        }
        System.out.println("END");
//        System.out.println("REVERSE ORDER:");
//
//        Node tempLast = last;
//        while (tempLast != null) {
//            System.out.print(tempLast.val + "->");
//            tempLast = tempLast.prev;
//        }
//        System.out.print("START");

    }

    //delete

    public Node deleteLast() {
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.prev.next = null;
        node.prev = null;
        size--;
        return node;
    }

    public Node deleteFirst() {
        Node val = head;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

}
