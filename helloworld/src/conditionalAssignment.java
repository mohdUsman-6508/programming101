import java.util.Scanner;

public class conditionalAssignment {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
//question 1
//        System.out.println("enter length:");
//        int length=sc.nextInt();
//        System.out.println("enter breadth");
//        int breadth=sc.nextInt();
//
//
//        if(length==breadth)
//        {
//            System.out.println("given shape is a square:");
//    }
//
//        else {
//            System.out.println("given shape is a rectangle:");
//
//        }

//        absolute value of given number

//        System.out.println("enter a number:");
//        int num=sc.nextInt();

//        if (num<0)
//        {
//            num=num*(-1);
//        }
//
//        else{
//         num=num;
//        }
//
//
//
//
//        System.out.println("absolute value:"+num);

//        System.out.println("enter  cost price:");
//        int costPrice=sc.nextInt();
//        System.out.println("enter  selling price:");
//        int sellingPrice=sc.nextInt();
//
//        int profit=sellingPrice-costPrice;
////         int result=profit+costPrice;
//
//        if (costPrice<sellingPrice) {
//            System.out.println("you made some profit:"+profit);
//        }
//
//        else{
//            System.out.println("you are in loss of Rupees :"+(-1*(profit)));
//        }
//
//calculator
        System.out.println("enter an operator + - / *");

        String symbol=sc.nextLine();

        System.out.println("enter a number:");
        int num1=sc.nextInt();

        System.out.println("enter another number:");
        int num2=sc.nextInt();
       int result=0;
        switch(symbol) {

            case "+":
                result=num1+num2;
                break;

            case "-":
                result=num1-num2;
                break;
            case "/":
                result=num1/num2;
                break;
            case "*":
                result=num1*num2;
                break;

            default:
                System.out.println("enter a valid operator:");

        }

        System.out.println("Result:"+result);
        }

    }

