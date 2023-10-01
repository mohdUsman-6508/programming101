package queue;

public class LLimplementation {
    public static class Node {
        int val;
        Node next;

        Node() {

        }

        Node(int val) {
            this.val = val;
        }
    }

    ///////////////////////////////////////////////////////

    public static class queue {

        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int val) {

            Node temp = new Node(val);
            if (head == null && tail == null) {
                head = tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
                size++;
            }
        }
        ///////////////////////////////////////////////////

        int peek() {
            System.out.println(head.val);
            return head.val;
        }
        ///////////////////////////////////////////////////

        int remove() {
            if (size == 0) {
                System.out.println("queue is empty!");
                return -1;
            }
            int val = head.val;
            head = head.next;
            size--;
            System.out.println(val);
            return val;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {

        queue q = new queue();
        q.add(3);
        q.add(8);
        q.add(9);
        q.add(13);
        q.add(18);
        q.add(19);
        q.display();
        q.peek();
        q.display();
        q.remove();
        q.display();


    }
}
