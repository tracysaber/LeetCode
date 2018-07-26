import java.util.Collections;
import java.util.Comparator;

/**
 * Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.

 A region is captured by flipping all 'O's into 'X's in that surrounded region.

 For example,
 X X X X
 X O O X
 X X O X
 X O X X
 After running your function, the board should be:

 X X X X
 X X X X
 X X X X
 X O X X

 */
public class Leet_130 {
	public void findO(char[][] b,int i,int j){
		int rows = b.length,cols =0;
		if(rows!=0) cols = b[0].length;
		b[i][j] ='D';
		if(i>0&&b[i-1][j]=='O')
			findO(b,i-1,j);
		if(j<cols-1&&b[i][j+1]=='O')
			findO(b,i,j+1);
		if(i<rows-1&&b[i+1][j]=='O')
			findO(b,i+1,j);
		if(j>0&&b[i][j-1]=='O')
			findO(b,i,j-1);
	}
	public void solve(char[][] board) {
		int rows = board.length,cols =0;
		if(rows!=0) cols = board[0].length;
		else return;
		if(rows==1||cols==1)	return;
		for(int i=0;i<cols-1;i++) {
			if (board[0][i] == 'O') findO(board, 0, i);

			if (board[rows-1][cols-i-1] == 'O') findO(board, rows-1, cols-i-1);

		}
		for(int i=0;i<rows-1;i++){
			if (board[i][cols - 1] == 'O') findO(board, i, cols-1);
			if (board[rows-i-1][0] == 'O') findO(board, rows-i-1, 0);
		}
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if(board[i][j]=='D')
					board[i][j]='O';
				else
					board[i][j]='X';
			}
		}
	}
	public static void main(String args[]){
		//char a[][] ={{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
		char a[][] ={{'X','O','X','O','X','X'},{'O','X','O','X','O','X'},{'X','O','X','O','X','O'},{'O','X','O','X','O','X'}};
		char b[][]={{'O'}};
		new Leet_130().solve(b);
		System.out.println();
	}
}
