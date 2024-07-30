import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        String str="ABC";
        ArrayList<String> list=new ArrayList<>();
        permute(str,0,str.length()-1,list);
        System.out.println(list);
    }

    private static void permute(String str,int l,int r,ArrayList<String> list){
        if(l==r){
            list.add(str);
        }else{
           for(int i=l;i<=r;i++){
               str=swap(str,l,i);
               permute(str,l+1,r,list);
               str=swap(str,l,i);
           }
        }
    }
    private static String swap(String str,int l,int r){
        char[] ch=str.toCharArray();
        char temp=ch[l];
        ch[l]=ch[r];
        ch[r]=temp;
        return String.valueOf(ch);
    }
}
