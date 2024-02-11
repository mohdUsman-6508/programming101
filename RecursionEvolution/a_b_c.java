public class a_b_c {
    public static void main(String[] args) {
        String str = "ab";
        perSpace(str.substring(1), str.charAt(0) + "");
    }

    private static void perSpace(String ip, String op) {
        if (ip.length() == 0) {
//            if (!(op.charAt(op.length() - 1) + "").equals("_")) {
//                System.out.print(op + " ");
//            }
            System.out.print(op + " ");
            return;
        }

        String op2 = op + "_" + ip.charAt(0);
        String op1 = op + ip.charAt(0);

        ip = ip.substring(1);

        perSpace(ip, op1);
        perSpace(ip, op2);

    }
}
