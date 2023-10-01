import java.util.Scanner;

public class swap_two_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num1,num2,temp_num;
        System.out.println("enter number 1:");
        num1=sc.nextInt();
        System.out.println("enter number 2:");
        num2=sc.nextInt();

        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
        System.out.println("swapping number .....");
        temp_num=num1;
        num1=num2;
        num2=temp_num;

        System.out.println("num1:"+num1);
        System.out.println("num2:"+num2);



    }
}
