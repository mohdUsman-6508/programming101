package Recursion;

import java.util.Scanner;
import java.util.SplittableRandom;
import java.lang.String;

public class recursionStrings {

    //////////////////////////////////////////
    static String reverseS(String s,int idx){

        if (idx==s.length()){
            return "";
        }
        String small=reverseS(s,idx+1);
        return small+s.charAt(idx);

    }
    //////////////////////////////////////////

    /////////////////////////////////to remove particular character from a string
    static String removeA(String s,int idx,char r){
        if (idx==s.length()){
            return "";
        }
        String small=removeA(s,idx+1,r);
        char current=s.charAt(idx);
        if (current!=r){
            return current+small;
        }
        else {
            return small;
        }
    }

    /////////////////////////////
    static void isPalindrome(String s){


       if (s.equals(reverseS(s,0))){
           System.out.println("palindrome");
       }
       else System.out.println("not a palindrome");
    }
    /////////////////////////////////


    static boolean isPm(String s,int l,int r){
        if (l>=r){
            return true;
        }
        return (s.charAt(l)==s.charAt(r)&&isPm(s,l+1,r-1));
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String s= sc.nextLine();
        System.out.println("enter char to remove:");
        char c=sc.next().charAt(0);

        System.out.println(reverseS(s,0));
        System.out.println(removeA(s,0,c));
        isPalindrome(s);
        System.out.println(isPm(s,0,s.length()-1));

    }
}
