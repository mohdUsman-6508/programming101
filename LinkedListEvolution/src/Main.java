import LL.*;

public class Main {


    public static void main(String[] args) {
//

        LL list = new LL();

        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtFirst(3);
        list.insertAtLast(4);
        list.insertAtLast(5);
        list.insertAt(2, 10);
        list.insertAt(6, 20);
        list.insertAt(0, 30);
        list.display();
        list.size();

        list.insertRec(5,2);
        list.display();
        list.size();
////        list.deleteFirst();
////        list.deleteLast();
////        list.deleteLast();
////        list.display();
////        list.size();
////        list.deleteAt(0);
////        list.display();
////        list.size();
////        System.out.println(list.get(2));
////        System.out.println(list.find(1));
////        System.out.println(11);
//
//
//        ///doubly linked list
////        DLL list = new DLL();
////        list.insertAtFirst(2);
////        list.insertAtFirst(12);
////        list.insertAtFirst(21);
////        list.insertAtFirst(22);
////        list.insertAtFirst(24);
////
////        list.display();
////        list.deleteLast();
////        list.deleteFirst();
////        list.display();
//
//        /// circular linked list
//
////        CLL list = new CLL();
////        list.insert(2);
////        list.insert(3);
////        list.insert(12);
////        list.insert(31);
////        list.insert(23);
////        list.insert(53);
////        list.display();
////        list.size();
////        list.delete();
////        list.display();
//
//
    }
}


