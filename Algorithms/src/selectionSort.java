public class selectionSort {
//algo which selects the current element and compare with the remaining array after finding minimum element swap minumum element with current element
    static void sSortI(int[] array){

        for (int i=0;i<array.length-1;i++){
            int minIndex=i;
            for (int j=i+1;j<array.length;j++){
                if (array[minIndex]>array[j]){
                    minIndex=j;
                }
            }

    if (minIndex!=i) {
      int temp = array[minIndex];
      array[minIndex]=array[i];
      array[i] = temp;

            }
        }
    }


    //////////////////////////for decreasing order
    static void sSortD(int[] array){

        for (int i=0;i<array.length-1;i++){
            int minIndex=i;
            for (int j=i+1;j<array.length;j++){
                if (array[minIndex]<array[j]){
                    minIndex=j;
                }
            }

            if (minIndex!=i) {
                int temp = array[minIndex];
                array[minIndex]=array[i];
                array[i] = temp;

            }

        }

    }
    public static void main(String[] args) {

        int[] array={2,4,8,3,1,9};
       sSortI(array);

        for (int i:array
             ) {

            System.out.print(i+" ");

        }
        System.out.println("");
        sSortD(array);
        for (int i:array
        ) {

            System.out.print(i+" ");

        }

    }
}
