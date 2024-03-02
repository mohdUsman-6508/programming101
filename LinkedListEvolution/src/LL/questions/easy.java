package LL.questions;

import LL.*;



public class easy {

    public static class Node{
        int val;
        Node next;

        Node(){}
        Node (int val){
            this.val=val;
        }
    }

    public static void main(String[] args) {
        LL l1 = new LL();

        l1.insertAtFirst(4);
        l1.insertAtFirst(2);;
        l1.insertAtFirst(1);
        l1.display();

        LL l2=new LL();
        l2.insertAtFirst(4);
        l2.insertAtFirst(3);
        l2.insertAtFirst(1);
        l2.display();


    }


}
