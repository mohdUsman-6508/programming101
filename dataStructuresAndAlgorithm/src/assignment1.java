import java.util.Arrays;

public class assignment1 {
    public static void main(String[] args) {

        int[] array={3,4,6,5,2,7};
        Arrays.sort(array);
        for (int i=0;i<=(array.length);i++){
            if (array[i]!=i+1){
                System.out.println(i+1);
                break;
            }
        }

    }
}
