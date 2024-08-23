package easyQuestions;

public class q1 {
    public static void main(String[] args) {
        int n=5;
        printRev(n);
        System.out.println();
        print(n);
        System.out.println();
        printBoth(n);
    }

//    n to 1;
    private static void printRev(int n){

        if(n==0) return;
        System.out.print(n+" ");
        printRev(n-1);
    }

//    1 to n

    private static void print(int n){
        if(n==0) return;
        print(n-1);
        System.out.print(n+" ");
    }

//    n to 1 to n

    private static void printBoth(int n){
        if(n==0) return;

        System.out.print(n+" ");
        printBoth(n-1);
        System.out.print(n+" ");

    }
}
