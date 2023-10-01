import java.util.Scanner;

public class oddPairs {
    public static void main(String[] args) {

        //////////////////your code goes here

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while (t-->0){

            int n=sc.nextInt();

            int[] array=new int[n];

            for (int i=0;i<array.length;i++){
                array[i]=i+1;
            }

            ///////////////////////////////
            int count=0;
            for (int i=0;i<array.length;i++){

                for (int j=0;j<array.length;j++){

                    if (array[i]>=1 && array[i]<=n && array[j]>=1 && array[j]<=n && (array[i]+array[j])%2==1){
                        count++;
                    }

                }
            }

            System.out.println(count);
            count=0;

        }
        
    }


}
