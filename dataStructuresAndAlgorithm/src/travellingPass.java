import java.util.Scanner;

public class travellingPass {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while (t-->0){

            int length=sc.nextInt();
            String str=sc.next();
            int n1=0;
            int n0=0;
            int i=0;
            int ans=0;

            while (length>0){
/////////////////////////////////

                char a=str.charAt(i);
                if (a=='1'){
                    n1++;
                }
                else {
                    n0++;
                }
////////////////////////////////////

                length--;
                i++;

         }

            if (n1>n0){
                ans=n0+1;
            }
            else {
                ans=n1;
            }

            System.out.println(ans);
            ans=0;n1=0;n0=0;

      

        }
    }
}
