package RecursionRevision;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class subset {
    private static ArrayList<ArrayList<Integer>> subSum(int id, int sum, int[] arr, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans) {

        if (id == arr.length) {
            ans.add(new ArrayList<>(list));
            return ans;
        }

        list.add(arr[id]);
        subSum(id + 1, sum + arr[id], arr, list, ans);//pick

        list.remove(list.size() - 1);
        subSum(id + 1, sum, arr, list, ans);// not  pick

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> listans=new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = subSum(0, sum, arr, list,listans);

        System.out.println(ans.toString());

    }
}
