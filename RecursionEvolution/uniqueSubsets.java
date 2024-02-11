import java.util.HashMap;

public class uniqueSubsets {
    public static void main(String[] args) {
        String s ="aab";
        HashMap<String,Integer> hm=new HashMap<>();
        subSet(s, " ",hm);
        System.out.println(hm);
        System.out.println(hm.size());
    }

    private static void subSet(String ip, String op,HashMap<String,Integer> hm) {
        if (ip.length() == 0) {
            hm.put(op, 1);
            System.out.print(op + " ");
            return ;
        }
        String op1 = op;
        String op2 = op + ip.charAt(0);
        ip = ip.substring(1);

        subSet(ip, op1,hm);
        subSet(ip, op2,hm);

    }
}
