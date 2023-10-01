import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
//         int i=1,j=0;
//
//        while (i<=n){
//            if (n%i==0){
//                j+=1;
//                i++;
//                if (j>=3){
//                    System.out.println(n+" is not a prime number:");
//                    break;
//                }
//
//
//
//            }
//
//          else{  i++;}
//
//        }
//        if (j<=2)
//            System.out.println(n+" is a prime number");
//
//
        if (n<0)
        {
            n=n*(-1);
        }

//          int a,b=0,c=n;
//          int sum=0;
//
//          while (n>0)
//          {
//              a=n%10;
//              sum+=a;
//
////              if (n>0)
////              {
////                  b++;
////              }
//            n=n/10;
//          }
//
////        System.out.println("number of digits in " +c+ " are: "+ b);
//
//
//
//        System.out.println("sum of digits in " +c+ " is : "+ sum);


//reverse a number

//    int a,b=0,c=n;
//    int sum=0;

//to count the digit
//        while (n>0)
//    {
//        sum++;
//        n=n/10;
//    }
//        System.out.println( "nod "+ sum);
//
////        to get the multiplier
//
//    int multiplier=1;
//    sum-=1;
//          while (sum>0)
//          {
//              multiplier*=10;
//              sum--;
//          }
//
//        System.out.println("multi "+multiplier);
//
//          int e=c;
//          int revnum=0,d;
//          while (c>0)
//          {
//              d=c%10;
//            revnum=d*multiplier+revnum;
//            multiplier/=10;
//            c=c/10;
//          }
//
////        System.out.println("number of digits in " +c+ " are: "+ b);
//        System.out.println("reverse of digits in " +e+ " is : "+ revnum);
//


//            int i,j,k=0;
//        for (i=1;n>=i;i++)
//
//        {
//            if (i%2==0){
//                k-=i;
//            }
//
//            else
//
//            {
//                k+=i;
//
//            }
//        }
//        System.out.println("sum of the series: 1-2+3-4+5-6+......n = "+ k);

//        int i=1,factorial=1,k;
//    if (n==0){
//        //System.out.println("factorial of " +n+ " is = "+factorial);
//    }
//        while (i<=n){
//
//            factorial*=i;
//            i++;
//        }
//        System.out.println("factorial of " +n+"!"+ " is = "+factorial);
        System.out.println("enter power:");
        int n2=sc.nextInt();
        int i=0,result=1;
        while (i<n2){
            result*=n;
            i++;
        }
        System.out.println(result);






















}


}
