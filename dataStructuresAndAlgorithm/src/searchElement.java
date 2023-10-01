import java.util.Scanner;

public class searchElement
{

    static void ArrayOut(int[] arr ){

        for (int i=0;i<arr.length;i++){

            System.out.println(arr[i]);


        }


    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("please enter number of elements:");
        int length;
        length=sc.nextInt();
        System.out.println("please enter "+length+" number separated by a space: ");

        int[] num= new int[length];

        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }


        System.out.println("enter number to search/occurrence:");
        int snum=sc.nextInt();
        int ans=-1;
        int count=0;

        for (int i=0;i<num.length;i++){

            if (snum==num[i]){
                ans=num[i];
                count++;

                System.out.println(snum +" is present in the given list: "+ "at index "+i);
               // break;
            }
        }

        System.out.println("number of occurrence "+count);





    }
}
