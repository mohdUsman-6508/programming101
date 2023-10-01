import java.util.Scanner;


public class sumOfElementsInArray {



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        System.out.println("please enter number of elements:");
       int length;
       length=sc.nextInt();
        System.out.println("please enter "+length+" number consecutively: ");
        int[] num= new int[length];
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }

//       one way of taking input
//       num[0]=1;
//        num[1]=3;
//        num[2]=43;
      int sum=0;
        for(int i=0;i<num.length;i++){
            sum+=num[i];
        }

        System.out.println("sum of given elements in array:"+sum+":)");

    }

}
