import java.util.*;

public class Main {

    public static int[] nG(int[] a) {
        int n = a.length;
        Stack<Integer> st = new Stack<>();
        int[] b = new int[n];
        st.push(a[n - 1]);
        b[n - 1] = -1;
        for (int i = 2*n - 2; i >= 0; i--) {

            while (st.size() > 0 && st.peek() <=a[i%a.length]) {
                st.pop();
            }

            if (st.size() == 0) b[i%a.length] = -1;
            else b[i%a.length] = st.peek();

            st.push(a[i%a.length]);
        }
        return b;
    }



        private static List<List<Integer>> subSum(int id,int[] arr, List<Integer> list, List<List<Integer>> ans) {

            if (id == arr.length) {
                ans.add(new LinkedList<>(list));
                return ans;
            }

            list.add(arr[id]);
            subSum(id + 1, arr, list, ans);//pick

            list.remove(list.size() - 1);
            subSum(id + 1, arr, list, ans);// not  pick

            return ans;
        }








    public static void main(String[] args) {
//        System.out.println("Hello world!");

//                   5 6 6 6 6 -1 4 -1
//       int[] arr = {1,8,-1,-100,-1,222,1111111,-111111};
////        {1, 5, 3, 2, 1, 6, 3, 4};
//
////        int[] ans = nextG(arr);
//        int[] ans = nG(arr);
//        for (int val : ans) {
//            System.out.print(val + " ");
//        }

        int[] arr={4,4,4,1,4};
        List<Integer> list = new LinkedList<>();
        List<List<Integer>> listans=new LinkedList<>();
        List<List<Integer>> ans = subSum(0, arr, list,listans);

        for(List val:ans){
            System.out.println(val);
        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        HashSet<List<Integer>> set=new HashSet<>();
        for (List val:ans){
            set.add(val);
        }
        System.out.println(set);

        List<List<Integer>> finalAns=new LinkedList<>();
        for (List<Integer> hs:set){
            finalAns.add(new ArrayList<>(hs));
        }

        for (List val:finalAns){
            System.out.println(val+" ");
        }


    }
}