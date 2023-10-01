import java.util.Scanner;


public class input {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String name,fieldOfInterest;
        int rollNo;

       name= sc.next();

       fieldOfInterest=sc.next();

       rollNo= sc.nextInt();

        System.out.println("name: "+ name);
        System.out.println("field Of Interest:" + fieldOfInterest);
        System.out.println("roll No. : " + rollNo);

        

    }
}
