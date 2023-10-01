import java.util.function.DoubleToLongFunction;

public class arraymanipulation {

  static int sMin(int[] array){

            int length= array.length;
            int min=Integer.MAX_VALUE;
            for (int i=0;i<array.length;i++){
                if (min>array[i]){
                    min=array[i];
                }
            }

            for (int j=0;j<array.length;j++){
                if (min==array[j]){
                    array[j]=Integer.MAX_VALUE;
                }
            }

            int fmin=Integer.MAX_VALUE;
            for (int k=0;k<array.length;k++){
                if (fmin>array[k]){
                    fmin=array[k];
                }
            }

            return fmin;
        }

        public static void main(String[] args) {

            int[] arr={1,-9,7,-4,3};

            System.out.println(sMin(arr));

            System.out.println(Double.MAX_VALUE);
            System.out.println(Double.MIN_VALUE);

        }
    }


