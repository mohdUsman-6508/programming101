import ArrayCalc.ArrayCal;

public class OOPS_is_fun {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 1, 6};
        ArrayCal ac = new ArrayCal(arr);
        ac.display();
        OOPS_is_fun o=new OOPS_is_fun();
        o.sum(arr);
    }
    static class Student{

    }
    void sum(int[] arr) {
        int sum = 0;
        for (int val : arr) sum += val;
        System.out.println("sum:" +sum);
    }
}

//static class Student{}