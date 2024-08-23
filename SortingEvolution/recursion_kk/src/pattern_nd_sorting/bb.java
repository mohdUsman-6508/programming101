package pattern_nd_sorting;

public class bb {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, -1, 8};
//        bbs(arr);
//        rbbs(arr,arr.length,0);
//        ss(arr);/**/
          rss(arr,arr.length,0,0);
          p(arr);

    }

    private static void rss(int[] arr, int r, int c, int max){

        if(r==0) return ;

        if(c<r){
            if(arr[c]>arr[max]){
                rss(arr,r,c+1,c);
            }else{
                rss(arr,r,c+1,max);
            }
        }else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            rss(arr,r-1,0,0);
        }
    }
    private static void ss(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    private static void rbbs(int[] arr, int r, int c) {
        if (r == 0) return;

        if (c < r - 1) {
            if (arr[c] > arr[c + 1]) {
                swap(arr, c);
            }
            rbbs(arr, r, c + 1);
        } else {
            rbbs(arr, r - 1, 0);
        }
    }

    private static void bbs(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }

    private static void p(int[] arr) {
        for (int val : arr) System.out.print(val + " ");
    }
}
