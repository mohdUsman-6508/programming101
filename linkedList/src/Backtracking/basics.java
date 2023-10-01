package Backtracking;

public class basics {
    public static void main(String[] args) {

        boolean[][] check=new boolean[3][2];

        System.out.println(mazeII(0, 0, check.length-1, check[0].length-1, check,""));


    }



    /// rate in a maze1 down and right only
    public static int maze(int sr, int sc, int er, int ec, String s) {

        if (sr > er || sc > ec) {
            return 0;
        }
        if (sr == er && sc == ec) {
            System.out.println(s);
            return 1;
        }

        //right
        int r = maze(sr, sc + 1, er, ec, s + "R");
        //down
        int d = maze(sr + 1, sc, er, ec, s + "D");

        int t = r + d;
        return t;
    }


    ////// rate in a mazeII using backtracking --- jhanda laga jab pahunch jaye to sare jhande ukhaad le🚩

    public static int mazeII(int sr,int sc,int er,int ec,boolean[][] check,String s){
        ///base case
        if(sr>er || sc>ec) return 0;
        if(sr<0 || sc<0) return 0;
        if(check[sr][sc]==true) return 0;
        if(sr==er && sc==ec){
            System.out.println(s);
            return 1;
        }

       check[sr][sc]=true;

        //down
        int down=mazeII(sr+1,sc,er,ec,check,s+"D");
        //right
        int right=mazeII(sr,sc+1,er,ec,check,s+"R");
        // up
        int up=mazeII(sr-1,sc,er,ec,check,s+"U");
        //left
        int left=mazeII(sr,sc-1,er,ec,check,s+"L");

        int total=down+right+up+left;

        check[sr][sc]=false; //backtracking
        return total;

    }
}
