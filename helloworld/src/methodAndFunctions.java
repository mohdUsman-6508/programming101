public class methodAndFunctions {

    static void Welcome(){
       System.out.println("Welcome to our Amu");
    }

      //function to find hcf of two numbers

    public int hcf(int a,int b){
        int hcf=1;

        int max=1;
        if (a>b){
            max=a;
        }
        else {
            max=b;
        }

        int div=max;
        ////////////////////////////////////////////////////////

            while (div>0){
                if (a%div==0 && b%div==0){
                     hcf=div;
                     break;

                }
                div--;
            }
        return hcf;
    }


    //////////////////////////////////////////////////////////////////////////////

    public  float average(float a, float b){
        float average=(a+b)/2;
        return average;
    }

    public static void main(String[] args) {
//        Welcome();
//        float num,num1;
//        num=10;
//        num1=1223;
//        methodAndFunctions obj=new methodAndFunctions();
//
//        float avg=obj.average(num,num1);
//        System.out.println(avg);
        methodAndFunctions obj=new methodAndFunctions();
        int a=96;
        int b=112;
        int hcf=obj.hcf(a,b);
        System.out.println("hcf of given numbers "+hcf);


    }
}
