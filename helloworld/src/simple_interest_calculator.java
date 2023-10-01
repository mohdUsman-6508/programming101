import java.util.Scanner;
public class simple_interest_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        char a=sc.next().charAt(0);
        System.out.println(a);

        float principal,rate,time,interest;
        System.out.println("enter Principal:");
        principal=sc.nextFloat();

        System.out.println("enter rate:");
        rate=sc.nextFloat();

        System.out.println("enter time:");
        time=sc.nextFloat();

        interest= (principal*rate*time)/100;

        System.out.println("Interest is :  "+ interest);








    }
}
