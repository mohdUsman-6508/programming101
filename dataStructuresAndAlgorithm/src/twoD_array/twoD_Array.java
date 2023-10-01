
package twoD_array;

import java.util.Scanner;

public class twoD_Array {

    //////////print a 2d array
    public static void printArray(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        System.out.println("your array is here:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " " + "\t");
            }
            System.out.println("");
        }//////////////////////////////////////////////
        // ////////////////////
    }


    //////////////////////////inputArray
    public static int[][] inputArray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter no.of rows:");

        int rows = sc.nextInt();
        System.out.println("please enter no.of column:");
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];
        int total = rows * cols;
        System.out.println("please enter " + total + " elements: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return array;
    }///////////////////////////////////////

    public static void main(String[] args) {

        //int[][] arr={{1,2,3},{3,2,1},{4,5,6}};

        int[][] a = inputArray();

        printArray(a);

    }
}
