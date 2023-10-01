import twoD_array.*;

import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        twoD_Array ta=new twoD_Array();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int col=1;
        int[][] ans=new int[n][];

        for (int i=0;i<n;i++){
            ans[i]=new int[col];
            for (int j=0;j<col;j++){

                if (j==0){
                    ans[i][j]=1;
                }
                else if(j==col-1){
                    ans[i][j]=1;
                }
                else {
                    ans[i][j]=ans[i-1][j-1]+ans[i-1][j];
                }
            }
            col++;
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<ans[i].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
