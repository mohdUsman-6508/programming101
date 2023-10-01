package RecursionRevision;

import java.util.ArrayList;

public class practice {
    public static ArrayList<Integer> sub(int idx,int[] arr,ArrayList<Integer> list,int k,ArrayList<Integer> sum){

        if(idx==arr.length){
            int s=0;
            if(list.size()==k) {
                System.out.println(list.toString());
                for(int i=0;i<list.size();i++){
                    s+=list.get(i);
                }
                sum.add(s);
            }
            return sum;
        }

        list.add(arr[idx]);
        sub(idx+1,arr,list,k,sum);

        list.remove(list.size()-1);
        sub(idx+1,arr,list,k,sum);


        return sum;

    }
    public static void main(String[] args) {
        int[] arr={2,1,3,3};
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> sum=new ArrayList<>();
        int k=2;

      ArrayList<Integer> l= sub(0,arr,list,k,sum);
        System.out.println();
//        System.out.print(sub(0,arr,list,k,sum));
        int max=Integer.MIN_VALUE;
        for (int i=0;i<l.size();i++){
            if(max<l.get(i)){
                max=l.get(i);
            }
        }


//        System.out.println(max);

    }
}
