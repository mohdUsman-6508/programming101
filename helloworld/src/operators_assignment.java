
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Scanner;
public class operators_assignment {
    public static void main(String[] args) {
        //question 1

      Scanner sc=new Scanner(System.in);
//        int num1=sc.nextInt();
//
//        int result=(((8+num1)/3)%5)*5;
//        System.out.println("number: "+ result);
//



//question 2

//        int num1,num2;
//        System.out.println("Before swapping :");
//
//         num1= sc.nextInt();
//         num2= sc.nextInt();
//
//
//         num1=num1+num2;
//         num2=num1-num2;
//         num1=num1-num2;
//        System.out.println("After swapping: ");
//        System.out.println(num1);
//        System.out.println(num2);


        //question 3

        int num;

        num=sc.nextInt();
        int digit1=(num%10);
        int digit2=((num/10)%10);
        int digit3=((num/100))%10;

        int sum=digit3+digit1+digit2;

        System.out.println(sum);
    }
}
