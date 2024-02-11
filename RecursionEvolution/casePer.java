import java.util.HashMap;
import java.util.Map;

public class casePer {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        String str = "a1B2";
        solve(str, "", hm);
        System.out.println();
        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.print(e.getKey() + " ");

        }
    }

    static void solve(String ip, String op, HashMap<String, Integer> hm) {
        String op1 = "";
        String op2 = "";
        if (ip.length() == 0) {
            System.out.print(op + " ");
            hm.put(op, 1);
            return;
        }

        if (!(ip.charAt(0) > '0' && ip.charAt(0) < '9')) {
            op1 = op + (ip.charAt(0)+"").toLowerCase();
            op2 = op + (ip.charAt(0)+"").toUpperCase();
//            op2 = op + (ip.charAt(0) > 'A' && ip.charAt(0) < 'Z' ? (ip.charAt(0) + "").toLowerCase() : (ip.charAt(0) + "").toUpperCase());
            ip = ip.substring(1);
            solve(ip, op1, hm);
            solve(ip, op2, hm);

        } else {
            String op3 =op;
            op3=op3+ip.charAt(0);
            ip = ip.substring(1);
            solve(ip, op3, hm);
        }

    }
}
