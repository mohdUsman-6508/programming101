package Recursion;
import java.util.*;
import java.io.*;
import java.lang.*;


public class arrayList {

    //////////////////////finding subsequences of given string
    static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans=new ArrayList<>();
        if (s.length()==0){
            ans.add(" ");
            return ans;
        }
        char curr=s.charAt(0);
        ArrayList<String> small=getSSQ(s.substring(1));
        for (String ss:small){
            ans.add(ss);
            ans.add(curr+ss);

        }
        return ans;

    }
    ///////////////////////////////////////////


    /////////////////////more efficient method
    static void printSSQ(String s,String currAns){
        if (s.length()==0){
            System.out.println(currAns);
            return;
        }
        char currChar=s.charAt(0);
        String remString=s.substring(1);
        printSSQ(remString,currAns+currChar);
        printSSQ(remString,currAns);


    }

    ///////////////////////////////////



    /////////////////////////sum of subsets
    static void subSum(int[] a,int n,int idx,int sum){
        if (idx>=n){
            System.out.println(sum);
            return;
        }
        subSum(a,n,idx+1,sum);
        subSum(a,n,idx+1,sum+a[idx]);


    }
    public static void main(String[] args){

//        ArrayList<String> s=getSSQ("abc");
//
//        for (String ss:s){
//            System.out.print(ss+" ");
//        }

//        printSSQ("abc","");
        int[] a={1,2,3};
        subSum(a,a.length,0,0);

    }
}
