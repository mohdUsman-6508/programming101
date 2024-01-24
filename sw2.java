import java.util.ArrayList;
import java.util.List;

public class sw2 {
    public static void main(String[] args) {
//brute force for the first element in the window
        int arr[]={2,-3,-2,-4,6,3,2};
        int k=4;
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<arr.length-k+1;i++){
            boolean flag=true;
            for(int j=i;j<k+i;j++){
                if(arr[j]<0){
                    list.add(arr[j]);
                    flag=false;
                    break;
                }
            }
            if(flag) list.add(0);
        }

        for(int i:list) System.out.println(i);



    }
}
