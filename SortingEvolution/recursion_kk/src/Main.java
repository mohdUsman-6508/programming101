public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        print1(1);
    }

    static void print1(int n){
        System.out.println(n);
        print2(2);
    }

    private static void print2(int n) {
        System.out.println(n);
        print3(3);
    }

    private static void print3(int n) {
        System.out.println(n);
    }
}

/*
 Fn Calls
 1. fn under execution, resting in the stack
 2. fn execution completed, removed from stack
 */