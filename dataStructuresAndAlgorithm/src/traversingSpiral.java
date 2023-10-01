import twoD_array.*;

public class traversingSpiral {
    //////////////spiral array
    public static void spiralArray(int[][] array) {
        int tr = 0;
        int br = array.length - 1;
        int lc = 0;
        int rc = array[0].length - 1;
        int loop = (br + 1) * (rc + 1);
        int[] a = new int[loop];
        int k = 0;
        while (k < loop){
            for (int i = lc; i <= rc && k < loop; i++) {
                a[k++] = (array[tr][i]);


            }
//       tr++;

        for (int i = tr+1; i <= br-1 && k < loop; i++) {
            a[k++] = (array[i][rc]);


        }
//        rc--;


        for (int i = rc; i >= lc && k < loop; i--) {
            a[k++] = (array[br][i]);
        }
//        --br;

        for (int i = br-1; i >=tr+1  && k < loop; i--) {
            a[k++] = (array[i][lc]);


        }
//        lc++;
            lc++;rc--;tr++;br--;
    }

        for (int i=0;i<a.length;i++){
            System.out.print(a[i]);
            System.out.print(" ");

        }

    }

    public static void gspiralArray(int n) {
        int tr = 0;
        int br = n- 1;
        int lc = 0;
        int rc = n - 1;
        int loop = (br + 1) * (rc + 1);
        int[][] array = new int[n][n];
        int k = 1;

        while (k <=loop){
            for (int i = lc; i <= rc && k <=loop; i++) {
                (array[tr][i])=k++ ;


            }
//       tr++;

            for (int i = tr+1; i <= br-1 && k <=loop; i++) {
                (array[i][rc])=k++ ;


            }
//        rc--;


            for (int i = rc; i >= lc && k <= loop; i--) {
                  (array[br][i])=k++ ;
            }
//        --br;

            for (int i = br-1; i >=tr+1  && k <= loop; i--) {
                (array[i][lc])=k++ ;


            }
//        lc++;
            lc++;rc--;tr++;br--;
        }
        twoD_Array.printArray(array);

        }





    public static void main(String[] args) {

//        twoD_Array ta = new twoD_Array();
//        int[][] array = ta.inputArray();
//        ta.printArray(array);
        gspiralArray(5);


    }
}
