import java.util.Scanner;

public class taking_input {

    public static void main(String[] args){
//     for input string
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter your name:");
        String firstName=sc.nextLine();
        System.out.println(firstName);
// for sentences
        System.out.println("what is your name");
//        sc.nextLine();
        String fullName=sc.nextLine();
        System.out.println("name is "+ fullName);

//        for integer
        System.out.println("enter your number:");
        int number=sc.nextInt();
       System.out.println(number);



    }

}
