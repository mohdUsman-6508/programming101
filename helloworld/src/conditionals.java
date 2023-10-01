import java.util.Scanner;
public class conditionals {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num=sc.nextInt();
//        int temp=num;
//        if (num%2==0){
//            System.out.println(temp +" is an even number");}
//        else{
//            System.out.println( temp +" is an odd number");}
//


//        System.out.println("Enter your age:");
//        int age=sc.nextInt();
//
//        if (age<12){
//            System.out.println("you are a child ");
//        }
//        else if (age>=12 && age<=18) {
//            System.out.println("you are teenager");
//
//        }
//
//        else{
//
//            System.out.println("you are an adult ");
//        }

//        System.out.println("enter a number ");
//        int num=sc.nextInt();
//        String ans;
//        ans=num%2==0?"even":"odd";
//        System.out.println(ans);

        System.out.println("Please enter a day number:");
        int num=sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                 break;

            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid day number");
        }
        }


    }

