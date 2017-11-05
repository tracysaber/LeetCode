/**
 * Created by tracysaber on 2017-11-5.
 * Follow up for "Unique Paths":

 Now consider if some obstacles are added to the grids. How many unique paths would there be?

 An obstacle and empty space is marked as 1 and 0 respectively in the grid.

 For example,
 There is one obstacle in the middle of a 3x3 grid as illustrated below.

 [
 [0,0,0],
 [0,1,0],
 [0,0,0]
 ]
 The total number of unique paths is 2.
 */
public class Leet_63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        if(m==0)
            return 0;
        int n=obstacleGrid[0].length;
        if(n==0)
            return 0;
        int re[][]= new int[m][n];
        boolean flag=true;
        for(int i=0;i<n;i++){
            if(obstacleGrid[0][i]==1)
                flag = false;
            if(!flag)
                re[0][i]=0;
            else
                re[0][i]=1;

        }
        flag=true;
        for(int i=0;i<m;i++){
            if(obstacleGrid[i][0]==1)
                flag = false;
            if(!flag)
                re[i][0]=0;
            else
                re[i][0]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(obstacleGrid[i][j]==1)
                    re[i][j]=0;
                else
                    re[i][j]=re[i-1][j]+re[i][j-1];
            }
        }
        return re[m-1][n-1];
    }
}
