/**
 * Created by tracysaber on 2017-11-5.
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

 Note: You can only move either down or right at any point in time.

 Example 1:
 [[1,3,1],
 [1,5,1],
 [4,2,1]]
 Given the above grid map, return 7. Because the path 1¡ú3¡ú1¡ú1¡ú1 minimizes the sum.

 */
public class Leet_64 {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        if(m==0)
            return 0;
        int n=grid[0].length;
        if(n==0)
            return 0;
        int re[][]= new int[m][n];
        re[0][0]=grid[0][0];
        for(int i=1;i<n;i++){
            re[0][i]=re[0][i-1]+grid[0][i];
        }
        for(int i=1;i<m;i++){
            re[i][0]=grid[i][0]+re[i-1][0];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                re[i][j]=grid[i][j]+Math.min(re[i-1][j], re[i][j-1]);
            }
        }
        return re[m-1][n-1];
    }
}
