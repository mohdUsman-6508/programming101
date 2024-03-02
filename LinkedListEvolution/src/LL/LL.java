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

    // insert recursively

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
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
        size--;
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

    //get functionality

    public void size() {
        System.out.println("size: " + size);
    }

    public int get(int index) {
        Node node = head;
        if (head == null) return head.value;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.value;
    }

    public boolean find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    /// remove duplicates

    public void removeDuplicate() {
        Node temp = head;
        while (temp.next != null) {
            if (temp.value == temp.next.value ) {
                    temp.next = temp.next.next;
                    size--;
            }
            else{
                temp = temp.next;
            }
        }

//        Node temp1 = head;
//        while (temp != null) {
//            if (temp1.value != temp.value) {
//                temp1.next = temp;
//                temp1 = temp;
//                size--;
//            }
//            if (temp1.value == temp.value && temp.next == null) {
//                temp1.next = null;
//                size--;
//            }
//            temp = temp.next;
//        }
    }


    /// merge list





}
