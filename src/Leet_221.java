/**
 * Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

 Example:

 Input:

 1 0 1 0 0
 1 0 1 1 1
 1 1 1 1 1
 1 0 0 1 0

 Output: 4

 */
public class Leet_221 {
	public int maximalSquare(char[][] matrix) {
		if(matrix.length==0)	return 0;
		int m = matrix.length;int n=matrix[0].length;
		int max=0;
		int [][] result = new int[matrix.length][matrix[0].length];
		for(int i=0;i<result[0].length;i++) {
			result[result.length - 1][i] = (matrix[result.length - 1][i] == '1' ? 1 : 0);
			max = Math.max(max,result[result.length - 1][i]);
		}
		for(int i=0;i<result.length;i++){
			result[i][result[0].length-1] = (matrix[i][result[0].length-1]=='1'?1:0);
			max=Math.max(max,result[i][result[0].length-1]);
		}

		for(int i=m-2;i>=0;i--){
			for(int j = n-2;j>=0;j--){
				int min = Math.min(result[i+1][j+1],Math.min(result[i][j+1],result[i+1][j]));
				result[i][j] = matrix[i][j]=='0'?0:min+1;
				max = Math.max(max,result[i][j]);
			}
		}
		return max*max;
	}
	public static void main(String args[]){
		char [][]a ={{'1'}};
		System.out.print(new Leet_221().maximalSquare(a));
	}
}
