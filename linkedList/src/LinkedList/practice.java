package LinkedList;

public class practice {

    public static void mergeTwoSortedArray(int[] a, int[] b) {
        int la = a.length;
        int lb = b.length;
        int[] c = new int[(la + lb)];
        int i, j, k;
        i = j = k = 0;
        while (i < la && j < lb) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else if (b[j] < a[i]) {
                c[k] = b[j];
                j++;
                k++;
            } else if (a[i] == b[j]) {
                c[k] = a[i];
                c[k + 1] = b[j];
                i++;
                j++;
                k += 2;
            }
        }
//
//        System.out.println(i+" "+ j);
//        System.out.println(la+" "+lb);
        if (i < la) {
            for (int m = i; m < la; m++) {
                c[k++] = a[m++];
            }
        } else if (j < lb) {
            for (int m = j; m < lb; m++) {
                c[k++] = b[m++];
            }
        }

        for (int val : c
        ) {
            System.out.print(val + " ");
        }
//        return c;

    }
/////////////////////////////////////////////

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {

        }

        ListNode(int val) {
            this.val = val;
        }

    }

    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }


    public static ListNode reverse(ListNode h) {

        if (h.next == null) return h;

        ListNode nHead = reverse(h.next);

        h.next.next = h;
        h.next = null;

        return nHead;

    }

    public static void main(String[] args) {

        //....merge two sorted array

//        mergeTwoSortedArray(a, b);

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(7);
        ListNode h = new ListNode(8);


        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

display(reverse(a));


//        ListNode temp=a;
//
//        while (temp.next.next!=null){
//
//            if(temp.val==temp.next.val){
//
//                temp.next=temp.next.next;
//                temp=temp.next.next;
//            }
//
//            else{
//                temp=temp.next;
//            }
//        }
//
//        display(a);

//        ListNode h1 = new ListNode(0);
//        ListNode h2 = new ListNode(1);
//
//
//        ListNode head = a;
//        ListNode t1 = h1;
//        ListNode t2 = h2;
//
//        while ((head != null)) {
//            if (head.val % 2 == 0) {
//                ListNode v = new ListNode(head.val);
//                t1.next = v;
//                t1 = v;
//                head = head.next;
//
//            } else {
//                ListNode v = new ListNode(head.val);
//                t2.next = v;
//                t2 = v;
//                head = head.next;
//
//            }
//        }
//
//        t1.next=h2.next;

//        display(h1.next);
//        System.out.println("");
//        display(h2.next);

    }
}

