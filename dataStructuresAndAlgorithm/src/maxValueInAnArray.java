import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
import javax.crypto.spec.PSource;
import java.util.Scanner;

public class maxValueInAnArray {

    public static void main(String[] args) {


//
//    traditional and limited method to find max among numbers
//        int max;
//        int[] number={92,4,-130};
//        if (number[0]>number[1]) {
//
//            if (number[0]>number[2]) {
//
//                max=number[0];
//            }
//            else {
//                max=number[2];
//            }
//
//        }
//
//        else if(number[1]>number[2]){
//            max=number[1];
//
//            }
//        else{
//            max=number[2];
//        }
//
//        System.out.println("maximum number is: "+max);



        Scanner sc=new Scanner(System.in);
//for input
        System.out.println("please enter number of elements:");
        int length;
        length=sc.nextInt();
        System.out.println("please enter "+length+" number consecutively: ");
        int[] numbers= new int[length];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
//...
        int max=0;
        int p=0;
        int j= numbers.length;

//logic
        if (numbers[0]>numbers[1]){
            max=numbers[0];
        }
        else {
            max=numbers[1];
        }

        for (int i=0;i<numbers.length;i++){

            while(p+1<j)
            {


              if (max>numbers[p+1]){
                  max=max;
              }
              else {
                  max=numbers[p+1];
              }

              p++;
        }}

        System.out.println("maximum: "+max);

    }

}
