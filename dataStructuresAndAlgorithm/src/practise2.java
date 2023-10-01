import java.util.*;

public class practise2 {

    //////max
    public static int maxA(int[] array){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){
            if (max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
    ////////////////////////



    public static void main(String[] args) {

//        int[] array={3,3,2,1};
//        int[] freq=new int[1000];
///////frequency array
//        for (int i=0;i<array.length;i++){
//            freq[array[i]]+=1;
//        }
//        System.out.println(maxA(freq));
//        System.out.println(freq[2]);

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            //System.out.println("length:");
            int length=sc.nextInt();
            int[] array=new int[length];
           // System.out.println("enter elements:");
            for (int i=0;i<array.length;i++){
                array[i]=sc.nextInt();
            }

            int[] freq=new int[1002];
/////frequency array
            for (int i=0;i<array.length;i++){
                freq[array[i]]+=1;
            }


            int max=Integer.MIN_VALUE;
            for (int i=0;i<freq.length;i++){
                if (max<freq[i]){
                    max=freq[i];
                }
            }


            //System.out.println("max:"+max);

            int count=0;
            for(int i=0;i<freq.length;i++){
                if(max==freq[i]){
                    count++;
                }
            }
           // System.out.println(count);

            if(count==1){
                System.out.println("yes");

            }
            else{
                System.out.println("no");
            }

        }
    }


}

