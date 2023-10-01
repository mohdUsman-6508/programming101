package queue;

public class implementation {

    public static class Queue {
        int[] queue = new int[10];
        int size = 0;

        Queue() {
        }

        int f = -1;
        int r = -1;

        void add(int value) {
            if (size >= queue.length) {
                System.out.println("Queue is full!");
                return;
            }
            if (f == -1) {
                queue[size++] = value;
                f = 0;
                r = 0;
            } else {
                queue[size++] = value;
                r++;
            }
        }

        int remove() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
           else {
                int val = queue[f];
                f++;
                size--;
                System.out.println(val);
                return val;
            }
        }

        int peek() {
           if(size==0) return -1;
            int val = queue[f];
            System.out.println(val);
            return val;
        }

        void size() {
            System.out.println(size);
        }

        void display() {
                   if (size==0) return;

            for (int i = f; i <= r; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(3);
        q.add(4);
        q.add(1);
        q.add(33);
        q.add(44);
        q.add(93);
        q.add(94);
        q.add(53);
        q.add(43);
        q.display();
        q.add(23);
        q.display();
        q.add(63);
        q.display();
        q.remove();
        q.display();
        q.peek();
        q.size();
    }
}
