package LinkedList;

public class LinkedListQuestions {
    public static class Node {
        int data;
        Node next;

        Node() {

        }

        Node(int data) {
            this.data = data;
        }
    }


    public static int length(Node a){
        Node temp=a;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static void display(Node a) {
        Node temp = a;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    /////////////////find nth node from end
/////////////slow and fast pointer
    public static int findNode(Node head,int index){
        Node fast=head;
        Node slow=head;

        for (int i=1;i<=index;i++){
            fast=fast.next;
        }

        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow.data;
    }

    ////////////////removing nth node from end;

    public static Node delete(Node head,int idx){
        Node fast=head;
        Node slow=head;
        for (int i=1;i<=idx;i++){
            fast=fast.next;
        }

        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        if (fast==null){
            head=head.next;
            return head;
        }
        slow.next=slow.next.next;
        return slow;
    }
    public static void main(String[] args) {
        Node a = new Node(22);
        Node b = new Node(12);
        Node c = new Node(26);
        Node d = new Node(28);
        Node e = new Node(62);
        Node f = new Node(52);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        display(a);
        System.out.println();

        int n=3;
//        int idx=length(a)-n+1;
//        System.out.println(idx);
//
//        Node temp=a;
//        for (int i=1;i<=idx-1;i++){
//            temp=temp.next;
//        }
//        System.out.println(temp.data);
        System.out.println(findNode(a,4));
        delete(a,3);
        display(a);
//        System.out.println(delete(a,3));
    }
}
