import java.util.Scanner;

public class frequencyArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number to find:");
        int num=sc.nextInt();
        int[] array={1,2,3,4,2,5};
        int[] freq=new int[100000];
        for (int i=0;i<array.length;i++){
            freq[array[i]]+=1;
        }

            if (freq[num]>0){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }

    }


}
