/**
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 Example 1:

 11110
 11010
 11000
 00000
 Answer: 1

 Example 2:

 11000
 11000
 00100
 00011
 Answer: 3
 */
public class Leet_200 {
	public void findIsland(int i,int j,char [][]grid){
		grid[i][j]='0';
		if(grid[i-1][j]=='1'){
			//grid[i-1][j]='0';
			findIsland(i-1,j,grid);
		}
		if(grid[i][j-1]=='1'){
			//grid[i][j-1]='0';
			findIsland(i,j-1,grid);
		}
		if(grid[i+1][j]=='1'){
			//grid[i+1][j]='0';
			findIsland(i+1,j,grid);
		}
		if(grid[i][j+1]=='1'){
			//grid[i][j+1]='0';
			findIsland(i,j+1,grid);
		}
	}
	public int numIslands(char[][] grid) {
		if(grid.length==0)	return 0;
		int nums = 0;
		char [][] grids = new char[grid.length+2][grid[0].length+2];
		for(int i=0;i<grids.length;i++){
			for(int j=0;j<grids[0].length;j++)
				grids[i][j]='0';
		}
		for(int i=1;i<grids.length-1;i++){
			for(int j=1;j<grids[0].length-1;j++)
				grids[i][j]=grid[i-1][j-1];
		}
		for(int i=0;i<grids.length;i++){
			for(int j=0;j<grids[0].length;j++){
				if(grids[i][j]=='1'){
					nums++;
					findIsland(i,j,grids);
				}
			}
		}
		return nums;
	}
	public static void main(String args[]){
		char a[][]={{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'},{'1','1','1','1','0'}};
		System.out.print(new Leet_200().numIslands(a));
	}
}
