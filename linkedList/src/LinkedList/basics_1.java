package LinkedList;

public class basics_1 {

    /////////////defining Node

    public static class Node {
        int data;
        Node next;

        Node() {

        }

        Node(int data) {
            this.data = data;
        }
    }

    //////////display
    public static void display(Node a) {
        Node temp = a;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    /////////////////iterative approach
    public static int displayLength(Node a) {
        int count = 0;
        Node temp = a;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println(count);
        return count;
    }

    ////////recursive approach

    public static int displayLengthr(Node a,int count){
        if (a==null) return 0;
        count++;
        displayLengthr(a.next,count);
        return count;
    }

    ///////////////displaying recursively
    public static void displayr(Node a) {
        if (a == null) return;
        System.out.print(a.data + " ");
        displayr(a.next);

    }

public static void addEnd(Node a,int val){
        Node temp=new Node(val);
        Node t=a;

        while(t.next!=null){
            t=t.next;
        }
        t.next=temp;
}


    public static void main(String[] args) {

        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(6);
        Node d = new Node(9);
        Node e = new Node(11);
        Node f = new Node();
        f.data = 7;

        a.next = b;
        a.next.next = c;
        c.next = d;
        d.next = e;
        e.next = f;


//        System.out.println(a.next.data);
//        System.out.println(b);
//        System.out.println(c.data);

        //////////////displaying using loops

//        displayr(a);
//        System.out.println();
//        displayLength(a);
//        System.out.println();
//        System.out.println( displayLengthr(a,0));

        addEnd(a,45);
        addEnd(a,64);
        display(a);
    }
}
