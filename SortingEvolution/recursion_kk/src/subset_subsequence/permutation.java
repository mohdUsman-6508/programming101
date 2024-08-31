package subset_subsequence;

import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static void main(String[] args) {
//        System.out.println(permute("ABC"));
        String str="ABC";
        permuteSwap(str.toCharArray(),0);

    }

    static List<String> permute(String str) {

        if (str.length() == 1) {
            List<String> baseList = new ArrayList<>();
            baseList.add(str);
            return baseList;
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String subStr = str.substring(0, i) + str.substring(i+1);
            List<String> subPer = permute(subStr);

            for (String s : subPer) {
                list.add(ch + s);
            }
        }

        return list;

    }


    static void permuteSwap(char[] arr,int i){
        if(i==arr.length){
            System.out.println(arr);
            return;
        }

        for(int j=i;j<arr.length;j++){
            swap(arr,j,i);
            permuteSwap(arr,i+1);
            swap(arr,i,j);
        }

    }

    static void swap(char[] arr,int i, int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
