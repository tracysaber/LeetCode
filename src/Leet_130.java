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
	public boolean findO(char [][]b,int x,int y){
		int row_len = b.length;
		int col_len = b[0].length;
		if(x==0||x==row_len-1||y==0||y==col_len-1){
			//b[x][y]='X';
			return true;
		}

		if(x>0&&b[x-1][y]=='O'){
			b[x][y]='X';
			if(findO(b,x-1,y)){
				b[x][y]='O';
			}
		}
		if(x>0&&y>0&&b[x+1][y+1]=='O'){

		}
		if(x>0&&y>0&&b[x+1][y+1]=='O'){

		}
		if(x>0&&y>0&&b[x+1][y+1]=='O'){

		}
		return false;
	}
	public void solve(char[][] board) {
		char [][] result = new char[board.length][board[0].length];
		//for(int i=0;i<)
	}
}
