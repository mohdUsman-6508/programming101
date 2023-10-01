import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);

      int num=1;
//while(num<100)
      for (;num<=100;num++)

      {
          if (num%5==0 && num%3==0) {
        //  num+=1;
          System.out.println("Buzz");
          continue;
      }
         else if (num%3==0)
          {
             //num+=1;
              System.out.println("Fizz");
              continue;
          }


          else if (num%5==0) {

              // num+=1;
              System.out.println("fizzbuzz");
              continue;
          }

          else
          {
              System.out.println(num);
             // num+=1;
          }

        //num+=1;
      }









    }
}
