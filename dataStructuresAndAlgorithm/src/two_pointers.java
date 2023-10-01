import java.util.Scanner;

public class two_pointers {
   ///////////////print array
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
    ////////////////////////

    public static int[] sort0and1(int[] array){

        int m=0;
        int n=array.length-1;
        while (m<n){

            if(array[m]==1 && array[n]==0){

                array[m]=0;
                array[n]=1;
                m++;n--;

            }
            if (array[m]==0){
                m++;
            }
            if (array[n]==1){
                n--;
            }

        }

        return array;

    }

    public static int[] sortOddAndEven(int[] array){

        int m=0;
        int n=array.length-1;
        while (m<n){

            if(array[m]%2==0 && array[n]%2==1){
                int temp=array[m];
                array[m]=array[n];
                array[n]=temp;
                m++;n--;

            }
            if (array[m]%2==1){
                m++;
            }
            if (array[n]%2==0){
                n--;
            }

        }

        return array;

    }






    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("length: ");
        int n=sc.nextInt();
        System.out.println("enter values:");
        int[] array=new int[n];
        array=inputArray(n);
       // sort0and1(array);
        //sortOddAndEven(array);

        printArray(array);



    }
}
