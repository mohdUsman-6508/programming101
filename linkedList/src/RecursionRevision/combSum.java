package RecursionRevision;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class combSum {

    public static ArrayList<ArrayList<Integer>> cs(int idx,int[] arr,int target,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> ans){

        if(idx==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));

            }
              return ans;

        }
        if(arr[idx]<=target){
            list.add(arr[idx]);
            cs(idx,arr,target-arr[idx],list,ans);
            list.remove(list.size()-1);
        }

        cs(idx+1,arr,target,list,ans);

       return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,3,6,7};
        int k=7;
        int sum=0;
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<ArrayList<Integer>> listlist=new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans=cs(0,arr,k, list,listlist);
        System.out.println(ans);
    }
}
