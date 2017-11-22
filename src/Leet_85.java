/**
 * Created by tracysaber on 2017-11-22.
 * Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.

 For example, given the following matrix:

 1 0 1 0 0
 1 0 1 1 1
 1 1 1 1 1
 1 0 0 1 0
 Return 6.
 */
public class Leet_85 {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        if(m==0)    return 0;
        int n = matrix[0].length;
        int max =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='1'){
                    max = Math.max(max,maxInPoint(matrix,i,j));
                }
            }
        }
        return max;
    }
    int maxInPoint(char [][]a,int row,int col){
        int m=a.length;
        int n = a[0].length;
        int max =0;
        int kuan =n ;
        for(int i=row;i<m;i++){
            int index = col;
            int line=0;
            while(index<n&&a[i][index]=='1'){
                line++;
                index++;
            }
            if(line>0) {
                kuan = Math.min(kuan, line);
                max = Math.max(max,kuan*(i-row+1));
            }
            else{
                return max;
            }
        }
        return max;
    }
    public static void main(String []args){
        char a[][]={{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(new Leet_85().maximalRectangle(a));
    }
}
