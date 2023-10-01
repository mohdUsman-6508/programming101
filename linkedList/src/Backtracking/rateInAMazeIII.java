package Backtracking;

import java.util.ArrayList;

public class rateInAMazeIII {
    public static void main(String[] args) {

        int[][] arr={{4,9,8},{15,17,18},{7,10,12}};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
//        int[][] arrCpy=new int[arr.length][arr[0].length];
//        arrCpy=arr.clone();

//        for (int i=0;i<arrCpy.length;i++){
//            for (int j=0;j<arrCpy[0].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

        ArrayList<Integer> ans=new ArrayList<>();
        for (int i=0;i<arr.length;i++){

            int min=Integer.MAX_VALUE;
            int idx=0;
            for (int j=0;j<arr[0].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                    idx=j;
                }

            }
            System.out.println(min);
            System.out.println(idx);

            int max=Integer.MIN_VALUE;
            for (int k=0;k<arr.length;k++){
                if(arr[k][idx]>max){
                    max=arr[k][idx];
                }
            }
            System.out.println(max);

            if(max==min) ans.add(max);

        }

        System.out.println(ans);
    }
}
