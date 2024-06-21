import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] arr={1,2,3,4,5,4,2,3,2};

        int i=0,j=0;
        int sum=0,k=4;
        int m=0,n=0;


        while(j<arr.length){
            sum+=arr[j];
            if(sum<k){
                j++;
            }
            else if(sum==k){
                m=i;
                n=j;
                System.out.println("sum;"+sum);
            }
            else{
                while(sum>k){
                    sum-=arr[i];
                    i++;
                }
                j++;
                if(sum==k){
                    m=i;
                    n=j;

                }
            }

        }

        for(int l=m;l<n;l++){
            System.out.print(arr[l]+" ");
        }
    }

    static int[] delete(int arr[], int ind) {

        for (int i = ind; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr = Arrays.copyOfRange(arr, 0, arr.length - 1);
        return arr;
    }

    static int[] insert(int arr[], int ele, int ind) {
        int narr[] = new int[arr.length + 1];
        narr[ind] = ele;
        for (int i = 0; i < ind; i++) {
            narr[i] = arr[i];
        }

        for (int i = ind; i < arr.length; i++) {
            narr[i + 1] = arr[i];
        }
        return narr;
    }
}