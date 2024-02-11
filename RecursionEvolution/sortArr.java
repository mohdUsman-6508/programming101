import java.util.ArrayList;

public class sortArr {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        int arr[]={-20,4,-3,51,10,-6,7,10,8,-9};

        for (int val:arr){
            list.add(val);
        }

//        for (int val:arr){
//            System.out.print(val+" ");
//        }
        sortR(list);
        System.out.println(list);
    }

    private static void sort(int[] arr){

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

    }

    private static void sortR(ArrayList<Integer> list){
        if(list.size()==1) return;
        int temp=list.remove(list.size()-1);
        sortR(list);
        insert(list,temp);
    }

    private static void insert(ArrayList<Integer> list,int temp){
        if(list.size()==0 || list.get(list.size()-1)<=temp){
            list.add(temp);
            return;
        }
        int val=list.remove(list.size()-1);
        insert(list,temp);
        list.add(val);
    }

//    private static void insert(ArrayList<Integer> list, int temp) {
//        if (list.size() == 0 || list.get(0) >= temp) {
//            list.add(0, temp);
//            return;
//        }
//        int val = list.remove(0);
//        insert(list, temp);
//        list.add(0, val);
//    }

}
