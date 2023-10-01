import java.util.Scanner;

public class testing {
    public static void main(String[] args) {

/** here we discussed some methods of string class**/

        Scanner sc=new Scanner(System.in);
//        System.out.println("enter string");
//        String s=sc.nextLine();
//        System.out.println("enter string");
//        String c=sc.nextLine();
        String s="shah";
        String c="shah";

        System.out.println(s.concat(c));/////concatenating two strings
        System.out.println(s.indexOf('s',2));
        System.out.println(s.length());
        System.out.println(s.equals(c));
        System.out.println(s.charAt(3));
        System.out.println(s.replaceAll("sha","alam"));
        System.out.println(s.substring(1,3));


        /////////////////////////////////////behtreen method


        char[] array=s.toCharArray();
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        /**  *********************************** ****************************************** **************** **/


    }
}
