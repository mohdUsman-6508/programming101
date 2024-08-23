public class r1 {
    public static void main(String[] args) {
        print(1);
        printr(5);
    }
    static void print(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }

    static void printr(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
//        printr(n-1);
        System.out.println(n);
        printr(n-1);
    }


}
