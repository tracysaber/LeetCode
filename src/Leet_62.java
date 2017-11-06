/**
 * Created by tracysaber on 2017-11-4.
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

 The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

 How many possible unique paths are there?


 Above is a 3 x 7 grid. How many possible unique paths are there?
 */
public class Leet_62 {
    public int uniquePaths(int m, int n) {
        int re[][]=new int [m][n];
        for(int i=0;i<m;i++){
            re[i][0]=1;
        }
        for(int i =0;i<n;i++){
            re[0][i]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                re[i][j]=re[i-1][j]+re[i][j-1];
            }
        }
        return re[m-1][n-1];
    }

}
