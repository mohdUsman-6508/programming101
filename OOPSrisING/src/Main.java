import arrayAutomate.ArrayO;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr1={-1,-2,-3,3,2,1};
        ArrayO arr=new ArrayO(arr1);
        arr.display();
        arr.info();
        arr.displayR();

        int[] b={1,2,3,4,5};
        ArrayO obj=new ArrayO(b);
        obj.info();


//        for (int i=0;i<1000000;i++){
//            obj=new ArrayO();
//            //garbage collection
//        }

//        final int a=10;
//        a=11;

//        final int[] z={10};
//        int[] x=z;
//        z=new int[1];
//        x[0]=100;
        //for primitive datatype we cannot change values but for object we can change value ,but for objects we cannot reassign them to another object

//        System.out.println(x[0] +" "+ z[0]);
    }
}