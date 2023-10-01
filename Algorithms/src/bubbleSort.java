import java.util.*;
public class bubbleSort {

//   bubble sort is an algorithm which is based on the principle of swapping
//   of adjacent elements until it is sorted.
    static void bSortI(int[] array){
/////algo which sorts the 1D array in increasing order


        for(int i=0;i<array.length;i++){
            boolean flag=false;

            for (int j=0;j<array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    flag=true;
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }
            }

            if (!flag){
                return;
            }
        }


    }

    static void bSortD(int[] array){
/////algo which sorts the 1D array in decreasing order


        for(int i=0;i<array.length-1;i++){
            //////n-1 operations
            for (int j=0;j<array.length-1-i;j++){
                if (array[j]<array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }

            }


        }
        System.out.println("Sorted Array in Decreasing order :)");

        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
    }



    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

        System.out.println("Please enter array length:");
        int arrayLength=sc.nextInt();
        System.out.println("enter "+arrayLength+" elements: ");


        /////taking user input

        int[] arr=new int[arrayLength];
        //int[] array={2,3,1,8,4,9};
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        /////////////
        bSortI(arr);
        System.out.println("Sorted Array in Increasing order :)");

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

      ////calling a function
        bSortD(arr);////calling a function
    }
}
