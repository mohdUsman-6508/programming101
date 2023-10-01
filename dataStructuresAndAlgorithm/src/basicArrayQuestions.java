import java.util.Scanner;

public class basicArrayQuestions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] problems=new int[n];

            for (int i=0;i<problems.length;i++){
                problems[i]=sc.nextInt();
            }

            int count=0;
            for (int i=0;i<problems.length;i++){
                if (problems[i]>1000){
                    count++;
                }
                System.out.println(count);

            }
        }
    }
}
