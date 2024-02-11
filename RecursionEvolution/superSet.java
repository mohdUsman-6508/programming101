public class superSet {
    public static void main(String[] args) {
        String s="abc";
        subsequence(s," ");
    }
    private static void subsequence(String s,String ans){
        //base condition
        if(s.length()==0){
            System.out.print(ans+" ");
            return;
        }

        String op1=ans;
        String op2=ans+s.charAt(0);
        s=s.substring(1);

        subsequence(s,op1);
        subsequence(s,op2);


    }
}
