import java.util.ArrayList;

public class josephus {
    public static void main(String args[]){
        int n=40;
        int k=7;
        ArrayList<Integer> list =new ArrayList<>();
        int[] ans={-1};
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        solve(list,k-1,0,ans);
        System.out.println("ans: "+ans[0]);
    }

    static int solve(ArrayList<Integer> list,int k,int index,int[] ans){
        if(list.size()==1) {
            ans[0] = list.get(0);
            System.out.println("soldier no:" + ans[0]);
            return ans[0];
        }

        index=(index+k)%list.size();
        list.remove(index);
        solve(list,k,index,ans);
        return list.get(0);
    }
}
