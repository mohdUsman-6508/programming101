package queue;

public class circularQueue {

    public static class Queue {
        int f = -1;
        int r = -1;
        int[] q = new int[10];
        int size = 0;

        Queue() {

        }

        void add(int val) throws Exception {

            if (size == 0) {
                f = r = 0;
                q[0] = val;
                size++;
            } else if (size == q.length) {
                throw new Exception("Queue is full!");

            } else if (r < q.length - 1) {
                q[++r] = val;
                size++;
            } else if (r == q.length - 1) {
                r = 0;
                q[0] = val;
                size++;
            }
        }

        int remove() throws Exception {
            if (size == 0) {
                throw new Exception("queue is empty!");
            } else if (f == q.length - 1) {
                int val = q[f];
                f = 0;
                System.out.println(val);
                size--;
                return val;
            } else {
                int val = q[f];
                f++;
                System.out.println(val);
                size--;
                return val;
            }
        }

        int peek() throws Exception {
            if (size == 0) throw new Exception("Queue is empty!");
            else {
                System.out.println(q[f]);
                return q[f];
            }
        }

        void display() {
            if (size == 0) {
                System.out.println("queue is empty!");
            } else if (f <= r) {
                for (int i = f; i <= r; i++) {
                    System.out.print(q[i] + " ");
                }
            } else if (r < f) {
                for (int i = f; i < q.length; i++) {
                    System.out.print(q[i] + " ");
                }
                for (int i = 0; i <= r; i++) {
                    System.out.print(q[i] + " ");
                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws Exception {
        Queue cqa = new Queue();
        cqa.add(3);
        cqa.add(19);
        cqa.add(41);
        cqa.add(93);
        cqa.add(59);
        cqa.add(14);
        cqa.display();
        cqa.peek();
        cqa.remove();
        cqa.display();
        cqa.add(33);
        cqa.add(39);
        cqa.add(42);
        cqa.remove();
        cqa.add(13);
        cqa.peek();
        cqa.add(411);
        cqa.add(913);
        cqa.remove();
        cqa.display();
        cqa.add(90);
        cqa.display();
    }
}
