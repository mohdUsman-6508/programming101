import java.util.Scanner;

public class problemsOnArray1 {

 ////////////////////function to find unique number
    public static int uniqueNum(int[] array){

        //int length=array.length;
        int uniqueNum=0;
       //manipulating array
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++) {
                if (array[i] == array[j]) {
                    array[i] = array[j] = -1;
                }
            }
            }

        /////////////////////////////////////////////finding unique num ********************************
        for (int m=0;m<array.length;m++){
            if (array[m]>0){
                uniqueNum=array[m];
            }

        }
        return uniqueNum;

    }
    /////////////////////////////////////////////////////////end of a function ************************

    //******************************************************************************************************

    //////////////////function to find max in an array **********************
    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
    //////////////////////////////////////////////////////end of function max******************************

    //////////////function to second maximum number****************

    public static int secondMax(int[] array){
       // int smax=0;
        int max=max(array);

        for (int i=0;i<array.length;i++){
            if (array[i]==max){
                array[i]=Integer.MIN_VALUE;
            }
        }
        int sMax=max(array);
        return sMax;
    }//////////////////////////////////////////////end of function

///////////function to find first repeating value **************************
    public static int firstRepeat(int[] array){
        int fR=-1;
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]==array[j]){
                    return array[i];
                }
            }
        }

        return fR;
    }////////////////////////////////**********************////////////////////////////********************//////////////


/////start of psvm
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr={1,21,-3,-2,-3,0,5};

        //  System.out.println(uniqueNum(arr));
        //  System.out.println(max(arr));
        //  System.out.println(secondMax(arr));
        //  System.out.println(firstRepeat(arr));


    }
}
