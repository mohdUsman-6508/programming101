package bitManupulation;
import java.util.Scanner;

public class bitMasking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bit=15^9;
        System.out.println(bit);
        int count=0;
        while(bit!=0){
            bit=bit&(bit-1);
            count++;
        }
        System.out.println(count);
    }
}
