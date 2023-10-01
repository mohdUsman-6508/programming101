import java.util.Scanner;

public class problemsOnArray2 {

    //function to swap to values using temporary variable
    public static void swap(int a,int b){
        System.out.println("values before swapping:"+a+" "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("values after swapping:"+a+" "+b);

    }//////////////////////////////

    ///////////swap without using temp variable
    public static void swapEasy(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }//////////////////////////////////////////////////////////////////////////////////////

    /////////////////////////////////////reverse an array

    /////////////////////////printing all values in array
    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
    }

    ////////////////////////reverse an array
    public static void reverse(int[] array){

        int[] temparr=new int[array.length];
        int j=array.length-1;
        for (int i=0;i<array.length;i++){
            temparr[j]=array[i];
            j--;
        }
        printArray(temparr);
    }
    /////////////////////////////////////reverse an array method 2

    public static void reverseEasy(int[] array){
        int length=array.length;
        int i=0;
        int temp=0;
        int j=length-1;
        while (i<j){
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
        printArray(array);

    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////rotate an array******************
    public static void rotate(int[] array,int k){
        int length=array.length;
        k%=length;
        int[] ans=new int[length];

        for (int i=length-k;i<=length-1;i++){
            ans[i-(length-k)]=array[i];
        }
        for (int i=0;i<length-k;i++){
            ans[i+k]=array[i];
        }
//        for (int i=0;i<length;i++){
//            array[i]=ans[i];
//        }
        printArray(ans);
       // printArray(array);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=10,b=20;
        swap(a,b);
        swapEasy(a,b);
        int[] arr={1,3,4,5,7};
        printArray(arr);
        reverse(arr);
        reverseEasy(arr);
        rotate(arr,4);

    }
}
