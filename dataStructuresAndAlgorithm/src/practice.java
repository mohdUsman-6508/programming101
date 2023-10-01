import java.util.Scanner;

//import java.util.Scanner;
//
//
//
//public class practice {
//    
//
//        public static void main (String[] args){
//
//
//          //  Scanner sc = new Scanner(System.in);
////
////            int T=sc.nextInt();
////            while (T>0){
////
////                int N=sc.nextInt();
////                int[] array1=new int[N];
////                int[] array2=new int[N];
////
////                for (int i=0;i<array1.length;i++){
////
////                    array1[i]=sc.nextInt();
////                }
////
////                for (int i=0;i<array1.length;i++){
////
////                    array2[i]=sc.nextInt();
////                }
////                int n1=0,nz=0;
////
////                for (int i=0;i<array1.length;i++){
////                    if (array1[i]==1){
////                        n1++;
////                    }
////                    else {
////                        nz++;
////                    }
////
////                }
////
////                int n2=0,nz2=0;
////
////                for (int i=0;i<array2.length;i++){
////                    if (array1[i]==1){
////                        n2++;
////                    }
////                    else {
////                        nz2++;
////                    }
////
////                }
////          int ans=0;
////
////                if (n1==n2 && nz==nz2){
////                    for (int i=0;i<array1.length;i++){
////                        if (array1[i]==1 && array2[i]==1){
////                            ans=1;
////                            break;
////                        }
////                    }
////                }
////
////                else {
////
////                    ans=-1;
////                }
////
////                if (ans==1){
////                    System.out.println("YES");
////                }
////                else {
////                    System.out.println("NO");
////
////                }
////                T--;
////            }
////            System.out.println("array1 length");
////            int arrlen=sc.nextInt();
////            int[] arr1=new int[arrlen];
////            for (int i=0;i<arr1.length;i++){
////                arr1[i]=sc.nextInt();
////            }
////
////
////            System.out.println("before reversing:");
////            for (int i=0;i<arr1.length;i++){
////                System.out.println(arr1[i]);
////            }
////
//////             int[] ansarr=new int[arrlen];
//////            for (int i=0;i<arr1.length;i++){
//////                ansarr[i]=arr1[arrlen-1];
//////                arrlen--;
//////            }
////
////
////            System.out.println("after reversing:");
////          for (int i=0;i<arr1.length;i++){
////              System.out.println(arr1[i]);
////          }
////
//
//
//
////
////
////            Scanner sc=new Scanner(System.in);
////            int t=sc.nextInt();
////
////            while(t>0){
////
////                int size=sc.nextInt();
////                String sa=sc.next();
////
////                int num=Integer.parseInt(sa);
////                System.out.println("num: "+num);
////                int ans=0;
////                int tmul=1;
////                int mul=0;
////
////                while(num>0){
////                    mul=num%10;
////                    ans=ans+(mul*tmul);
////
////                    tmul*=2;
////                    num/=10;
////
////                }
////
////                System.out.println("ans:"+ans);
//
//
//
//            Scanner sc=new Scanner(System.in);
//            int t=sc.nextInt();
//
//            while(t>0){
//
//                int a=sc.nextInt();
//                int b=sc.nextInt();
//                int c=sc.nextInt();
//                int d=sc.nextInt();
//
//                int[] array1=new int[b-a+1];
//
//                for (int i=0;i<array1.length;i++){
//                    array1[i]=a;
//                    a++;
//                }
//
//                int[] array2=new int[d-c+1];
//
//                for (int i=0;i<array2.length;i++){
//                    array2[i]=c;
//                    c++;
//                }
//
//                int count=0;
//                int ans=array1.length+array2.length;
//
//                for (int i=0;i<array1.length;i++){
//                    for (int j=0;j<array2.length;j++){
//                        if(array1[i]==array2[j]){
//                            count++;
//                        }
//
//                    }
//                }
//
//                for (int i=0;i<array1.length;i++){
//                    System.out.println(array1[i]);
//                }
//
//                for (int i=0;i<array2.length;i++){
//                    System.out.println(array2[i]);
//                }
//
//                int fans=ans-count;
//                System.out.println(fans);
//                t--;
//                fans=0;
//
//            }
//            }
public class practice {

    public static int min(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
//////////////////////////////////////////////////////end of function min******************************

//////////////function to second minimum number****************

    public static int secondmin(int[] array) {
        // int smin=0;
        int min = min(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                array[i] = Integer.MAX_VALUE;
            }
        }
        int smin = min(array);
        return smin;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int s=sc.nextInt();
        int[] a=new int[s];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
       // System.out.println(min(a));
        System.out.println(secondmin(a));


    }
}/////////////////////////////////////
//
//
//
//
//
//
//        }
