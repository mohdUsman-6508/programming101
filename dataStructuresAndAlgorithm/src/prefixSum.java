import java.util.Scanner;

public class prefixSum {
    //sum of array element
    static int sumArray(int[] array){
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }
    /////////////////////////////

    //////////////////partition array
    static boolean partionArray(int[] array){
        int total=sumArray(array);
        int pref=0;int suffix=0;
        for (int i=0;i<array.length;i++){
            pref+=array[i];
            suffix=total-pref;
            if (suffix==pref){
                return true;
            }
        }
        return false;
    }
    static void printArray(int[] array){

        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }////////////////////

    ///////////////input array
    static int[] inputArray(int size){

        Scanner sc=new Scanner(System.in);
        int[] array=new int[size];
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }

        return array;
    }

    ///prefixSum
    static int[] prefixSum(int[] array){

        int length=array.length;
        for (int i=1;i<array.length;i++){
            array[i]+=array[i-1];
        }
        return array;
    }
///////////////////////////////////////

    /////suffix sum
    static int[] suffixSum(int[] array){

        int length=array.length;
        for (int i=length-1;i>0;i--){
            array[i-1]+=array[i];
        }
        return array;
    }//////////////////////

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of array:");
        int length=sc.nextInt();
        System.out.println("enter elements in array:");

       int[] array=new int[length+1];

       for (int i=1;i<=length;i++){
           array[i]=sc.nextInt();
       }
       for (int i=1;i<=length;i++){
           array[i]+=array[i-1];
       }
       printArray(array);
        System.out.println("no. of testcases:");
       int t=sc.nextInt();

       int ans=0;
       while (t-->=0){
           System.out.println("enter l:");
           int l=sc.nextInt();
           System.out.println("enter r:");
           int r=sc.nextInt();

           ans=array[r]-array[l-1];
           System.out.println("ans:"+ans);

       }


       //suffixSum(array);
        //System.out.println(partionArray(array));
       //printArray(array);


    }
























}
