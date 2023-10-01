import twoD_array.*;

import java.util.Scanner;


public class sumOfTwoArray {

    public static void sumOfTwoArray(int[][] a,int[][] b) {
        twoD_Array ta=new twoD_Array();
        int r = a.length;
        int c = a[0].length;
        int m = b.length;
        int n = b[0].length;
        int[][] ans=new int[r][c];

        if ((r!=m) ||(c!=n)){
            System.out.println("invalid! array");

        }
        else {
            for (int i=0;i<r;i++){
                for (int j=0;j<c;j++){
                    ans[i][j]=a[i][j]+b[i][j];
                }
            }
            ta.printArray(ans);
        }
    }//////////////////// /

  /////////////////////////////transpose of a matrix
    public static int[][] transpose(int[][] a){
        twoD_Array ta=new twoD_Array();
        int m=a.length;
        int n=a[0].length;
        int[][] b=new int[n][m];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                b[j][i]=a[i][j];
            }
        }
//        System.out.println("matrix");
//        ta.printArray(a);
//        System.out.println("transpose of the given matrix :");
//        ta.printArray(b);
        return b;
    }///////////////////////////////////******************************


    //transpose without using extra space possible only for square matrix
    public static void transposeE(int[][] a) {
        twoD_Array ta = new twoD_Array();
        int m = a.length;
        int n = a[0].length;
        //int[][] b=new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = i; j < n; j++) {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i] = temp;
            }
        }
        System.out.println("matrix");
        ta.printArray(a);
        System.out.println("transpose of the given matrix :");
        ta.printArray(a);
    }////////////////////////////////////////***************************

    //////////////////reverse of a matrix
    public static int[][] reverse(int[][] array){
        twoD_Array ta=new twoD_Array();
        int m=array.length;
        int n=array[0].length;

        for(int i=0;i<array.length;i++) {
            int t=n-1;
            int j=0;
            while (j < t) {
                int temp=array[i][j];
                array[i][j] = array[i][t];
                array[i][t]=temp;
                j++;
                t--;
            }


        }
        return array;


    }///////////////////////////////////**************************************/////////////////////////////


    /////////////////////////////rotate by 90' clockwise

    public static void rotate(int[][] array){
        twoD_Array ta=new twoD_Array();
        array=transpose(array);/////////////////transpose + reverse=rotate;
        array=reverse(array);
        ta.printArray(array);

    }

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        twoD_Array ta = new twoD_Array();
//      //  System.out.println("array1 :");
//        int[][] a ={{1,2,3,},{3,4,5}};
//       // System.out.println("array 2:");
//
//        sumOfTwoArray(a,b);
        int[][] b =ta.inputArray();
      // transposeE(b);
        rotate(b);


    }
}
