package easyQuestions;

public class q4 {
    public static void main(String[] args) {
        int num=12020203;
        System.out.println( countZeroes(num,0));
    }

    private static int countZeroes(int num,int count){
        if(num==0) return count;
        int rem=num%10;
        if(rem==0) return countZeroes(num/10,++count);
        return countZeroes(num/10,count);
    }
}
