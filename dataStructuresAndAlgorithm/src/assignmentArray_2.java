import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays.*;
public class assignmentArray_2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
//question 1
//        int[] arr={1,2,-3,4,6,5};
//        int[] arr2={1,2,-3,4,6,5};
//        int count=0;
//
//        if(arr.length==arr2.length){
//
//            for (int i=0;i<arr.length;i++){
//
//                if(arr[i]!=arr2[i]){
////                    System.out.println("array 1 is not equal to array 2");
//                    count++;
//                }
//
//            }
//            if (count>0){
//                System.out.println("array 1 != array 2");
//            }
//
//            else {
//                System.out.println("array 1 == array 2");
//            }
//        }
//
//        else {
//            System.out.println("array 1 != array 2");
//        }
//********************************************************end of question 1******************************************************

  //question2

//        int[] arr={7,10,4,3,20,15};
//        int k=3;
//
//        Arrays.sort(arr);
//        System.out.println(arr[k-1]);

//  *******************************************************end of question 2***************************************************

//question 3

//no in either array should not be repeated ;limitation working on it

        int[] arr={5,5};
        int[] arr2={1,1};

        int count=0;
        int l1=arr.length;
        int l2=arr2.length;

        int union=l1+l2;

        for (int i=0;i<arr.length;i++){

            for (int j=0;j<arr2.length;j++){

                if (arr[i]==arr2[j]){
                    count++;
                   // break;
                }
            }

        }

        int ans=union-count;

        System.out.println("union:"+ans);






















    }
}
