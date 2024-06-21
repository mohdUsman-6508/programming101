import java.util.ArrayList;

public class lss {
    public static void main(String[] args) {
        String s = "acbd";
        int k = 2;
        ArrayList<String> list = new ArrayList<>();
        fn(s, list," ",0);
int len=0;
        for(String a:list){
            System.out.println(a+" ");
            len++;
        }
        System.out.println(len);
    }

    private static void fn(String s, ArrayList<String> list,String t,int i) {
          if(i==s.length()){
              list.add(t);
              return;
          }

          fn(s,list,t+s.charAt(i),i+1);
          fn(s,list,t,i+1);

    }
}
