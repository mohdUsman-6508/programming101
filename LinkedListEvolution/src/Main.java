import LL.LL;

public class Main {
    public static void main(String[] args) {


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
        list.deleteFirst();
        list.deleteLast();
        list.deleteLast();
        list.display();
        list.size();
        list.deleteAt(0);
        list.display();


    }
}