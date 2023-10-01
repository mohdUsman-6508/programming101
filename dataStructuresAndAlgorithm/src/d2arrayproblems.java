import twoD_array.*;
public class d2arrayproblems {

    /////////////////brute force approach
    public static void sumArray(int[][] array,int i1,int i2,int j1,int j2){
        int sum=0;
        int r=array.length;
        int c=array[0].length;
        for (int i=i1;i<=i2;i++){
            for (int j=j1;j<=j2;j++){
                sum+=array[i][j];
            }
        }
        System.out.println(sum);

    }
//////////////////////////////////////////********************************************
    /////////// prifix array ***********************
    public static int[][] preSumRow(int[][] array){
        int r1=array.length;
        int c1=array[0].length;

        for (int i=0;i<array.length;i++){
            for (int j=1;j<array[0].length;j++){
                array[i][j]+=array[i][j-1];
            }
        }
        return array;
    }//////////////////////////

    ////////////////////////preSumCol*********************************
    public static int[][] preSumCol(int[][] array){
        for (int j=0;j<array[0].length;j++){
            for (int i=1;i<array.length;i++){
                array[i][j]+=array[i-1][j];
            }
        }
        return array;
    }
///////////////////////////////////////////////////////***********************************

    ////////////////////////////more efficient way to calculate rectangle sum


    public static int rectESum(int[][] array,int r1,int r2,int l1,int l2){
        array=preSumRow(array);
        array=preSumCol(array);
        twoD_Array.printArray(array);
        int sum=0;

    int left = 0, up = 0, leftup = 0;
 if(l1 >= 1) up = array[l1-1][r2];
 if(r1 >= 1) left = array[l2][r1-1];
 if(l1 >= 1 && r1 >= 1) leftup = array[l1-1][r1-1];
   sum = array[l2][r2] - left - up + leftup;

        //sum+=array[r2][l2]-array[r1-1][l2]-array[r2][l1-1]+array[r1-1][l1-1];
        return sum;
    }

    public static int rectSum(int[][] array,int r1,int r2,int c1,int c2){
        array=preSumRow(array);
        int sum=0;
        for (int i=r1;i<=r2;i++){
            if(c1>0){
                sum+=array[i][c2]-array[i][c1-1];}
            else {
                sum+=array[i][c2];
            }

        }
        return sum;

    }

    public static void main(String[] args) {
        int[][] array= twoD_Array.inputArray();
        twoD_Array.printArray(array);
       // sumArray(array,0,2,0,1);

//        twoD_Array.printArray(preSumRow(array));
//        twoD_Array.printArray(preSumCol(array));
        int sum=rectESum(array,0,2,2,2);
        System.out.println(sum);
    }
}
