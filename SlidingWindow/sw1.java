import java.util.ArrayList;
import java.util.List;

public class sw1 {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,-2};
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        List<List<Integer>> list = new ArrayList<>();
        int k=4;

        for (int i = 0; i < arr.length-k+1; i++) {

            List<Integer> list1 = new ArrayList<>();
            sum=0;
            for (int j = i; j < i + k; j++) {
                list1.add(arr[j]);
                sum+=arr[j];
            }
            if(maxSum<=sum) maxSum=sum;
            list.add(list1);
        }

        System.out.println(list);
        System.out.println("Maximum Sum:" + maxSum);

        for (List<Integer> l : list) {
            System.out.println(l);
        }

        int initialSum=0;
        for(int i=0;i<k;i++){
            initialSum+=arr[i];
        }
        int max=Integer.MIN_VALUE;
        int min=initialSum;
        int j=0;
        for(int i=k;i<arr.length;i++){
            max=Math.max(max,initialSum);
            min=Math.min(initialSum,min);
            initialSum+=arr[i]-arr[j];
            j++;
        }

        System.out.println("sliding window max-sum:"+ max);
        System.out.println("sliding window min-sum:"+ min);
    }
}
