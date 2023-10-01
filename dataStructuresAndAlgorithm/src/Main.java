import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
      //  System.out.println("Hello world!");

        System.out.println("no.of elements: ");
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();

        int[] arr=new int[length];

//  input elements
        System.out.println("enter each element separated by space:");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
//
//        System.out.println("enter no.to check: ");
//        int num=sc.nextInt();
        int count=0;
//        int[] arr2=new int[length];
//        int j=0;

        for (int i=0;i<(arr.length)-1;i++){

            if(arr[i]<=arr[i+1]){
                count++;
//                arr2[j]=i;
//                j++;
            }

        }

        if (count+1==arr.length){
            System.out.println("array is sorted:");
        }

        else {
            System.out.println("Array is not sorted:");
        }
//         int length2=arr2.length;
//        for (int i:arr2
//             ) {
//            System.out.println(i);
//        }
        //System.out.println(length2);

       // System.out.println("last occurrence:"+arr2[count-1]);






    }

}