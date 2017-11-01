import java.util.LinkedList;
import java.util.List;

/**
 * Created by tracysaber on 2017-10-30.
 * The n-queens puzzle is the problem of placing n queens on an n��n chessboard such that no two queens attack each other.



 Given an integer n, return all distinct solutions to the n-queens puzzle.

 Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.

 For example,
 There exist two distinct solutions to the 4-queens puzzle:

 [
 [".Q..",  // Solution 1
 "...Q",
 "Q...",
 "..Q."],

 ["..Q.",  // Solution 2
 "Q...",
 "...Q",
 ".Q.."]
 ]

 */
public class Leet_51 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String >> result = new LinkedList<List<String>>();
        char matrix[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                matrix[i][j]='.';
            }
        }
        dfs(matrix,0,result);
        return result;
    }
    public void dfs(char m[][],int index,List<List<String>> re){
        if(index==m.length){
            re.add(convert(m));
            return ;
        }
        for(int i=0;i<m.length;i++){
            if(isvalid(m,index,i)){
                m[index][i]='Q';
                dfs(m,index+1,re);
                m[index][i]='.';
            }
        }
    }
    public List<String> convert(char m[][]){
        List<String> con = new LinkedList<String>();
        for(int i=0;i<m.length;i++){
            StringBuilder a = new StringBuilder();
            for(int j=0;j<m.length;j++){
                a.append(m[i][j]);
            }
            con.add(a.toString());
        }
        return con;
    }
    public boolean isvalid(char m[][],int row,int col){
        for(int i =0;i<row;i++){
            for(int j=0;j<m.length;j++){
                if(m[i][j]=='Q'&&((col==j)||(Math.abs(j-col)==Math.abs(i-row)))){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        List<List<String>> a= new Leet_51().solveNQueens(4);
    }
}
