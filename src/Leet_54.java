import java.util.LinkedList;
import java.util.List;

/**
 * Created by tracysaber on 2017-10-31.
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

 For example,
 Given the following matrix:

 [
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
 ]
 You should return [1,2,3,6,9,8,7,4,5].
 */
public class Leet_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new LinkedList<Integer>();
        return spOrder(matrix,result);
    }
    public List<Integer> spOrder(int [][]matrix,List<Integer> re){
        int m=matrix.length;
        if(m==0)
            return re;
        int n=matrix[0].length;
        if(m==1){
            for(int i=0;i<n;i++){
                re.add(matrix[0][i]);
            }
            return re;
        }
        if(n==1){
            for(int i=0;i<m;i++){
                re.add(matrix[i][0]);
            }
            return re;
        }
//        if(m==2){
//            for(int i=0;i<n;i++){
//                re.add(matrix[0][i]);
//            }
//            for(int i=0;i<n;i++){
//                re.add(matrix[1][n-i-1]);
//            }
//            return re;
//        }
//        if(n==2){
//            for(int i=0;i<m;i++){
//                re.add(matrix[i][1]);
//            }
//            for(int i=0;i<m;i++){
//                re.add(matrix[m-i-1][0]);
//            }
//            return re;
//        }
        for(int i=0;i<n-1;i++){
            re.add(matrix[0][i]);
        }
        for(int i=0;i<m-1;i++){
            re.add(matrix[i][n-1]);
        }
        for(int i=0;i<n-1;i++){
            re.add(matrix[m-1][n-i-1]);
        }
        for(int i=0;i<m-1;i++){
            re.add(matrix[m-1-i][0]);
        }
        if(m==2||n==2)
            return re;
        else {
            int a[][] = new int[m - 2][n - 2];
            for (int i = 0; i < m - 2; i++) {
                for (int j = 0; j < n - 2; j++) {
                    a[i][j] = matrix[i + 1][j + 1];
                }
            }
            return spOrder(a, re);
        }
    }
    public static void main(String args[]){
        int a[][]={{2,5},{8,4},{0,-1}};
        List<Integer> aa=new Leet_54().spiralOrder(a);
    }
}
