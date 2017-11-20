import java.util.HashSet;

/**
 * Created by tracysaber on 2017-11-18.
 * Given a 2D board and a word, find if the word exists in the grid.

 The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

 For example,
 Given board =

 [
 ['A','B','C','E'],
 ['S','F','C','S'],
 ['A','D','E','E']
 ]
 word = "ABCCED", -> returns true,
 word = "SEE", -> returns true,
 word = "ABCB", -> returns false.
 */
public class Leet_79 {
//    public boolean exist(char[][] board, String word) {
//        int m = board.length,n=0;
//        if(m==0)
//            return false;
//        else
//            n = board[0].length;
//        boolean flag = false;
//        HashSet<String> path = new HashSet<String>();
//        for(int i =0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(board[i][j]==word.charAt(0)) {
//                    path.add(String.valueOf(i)+String.valueOf(j));
//                    flag = check(i, j, board, word,path ,1);
//                    path.remove(String.valueOf(i)+String.valueOf(j));
//                }
//                if(flag==true)
//                    return true;
//            }
//        }
//        return flag;
//    }
//    public boolean check(int row,int col,char[][] board ,String word,HashSet<String> path,int index){
//        if(index==word.length())
//            return true;
//        else{
//            if(row>0&&board[row-1][col]==word.charAt(index)&&!path.contains(String.valueOf(row-1)+String.valueOf(col))){
//                path.add(String.valueOf(row-1)+String.valueOf(col));
//                if( check(row-1,col,board,word,path,index+1))
//                    return true;
//                else
//                    path.remove(String.valueOf(row-1)+String.valueOf(col));
//            }
//            if(col>0&&board[row][col-1]==word.charAt(index)&&!path.contains(String.valueOf(row)+String.valueOf(col-1))){
//                path.add(String.valueOf(row)+String.valueOf(col-1));
//                if( check(row,col-1,board,word,path,index+1))
//                    return true;
//                else
//                    path.remove(String.valueOf(row)+String.valueOf(col - 1));
//            }
//            if(row<board.length-1&&board[row+1][col]==word.charAt(index)&&!path.contains(String.valueOf(row+1)+String.valueOf(col))){
//                path.add(String.valueOf(row+1)+String.valueOf(col));
//                if( check(row+1,col,board,word,path,index+1))
//                    return true;
//                else
//                    path.remove(String.valueOf(row+1)+String.valueOf(col));
//            }
//            if(col<board[0].length-1&&board[row][col+1]==word.charAt(index)&&!path.contains(String.valueOf(row)+String.valueOf(col+1))){
//                path.add(String.valueOf(row)+String.valueOf(col+1));
//                if( check(row,col+1,board,word,path,index+1))
//                    return true;
//                else
//                    path.remove(String.valueOf(row)+String.valueOf(col+1));
//            }
//            return  false;
//        }
//    }
public boolean exist(char[][] board, String word) {
    char[] w = word.toCharArray();
    for (int y=0; y<board.length; y++) {
        for (int x=0; x<board[y].length; x++) {
            if (exist(board, y, x, w, 0)) return true;
        }
    }
    return false;
}

    private boolean exist(char[][] board, int y, int x, char[] word, int i) {
        if (i == word.length) return true;
        if (y<0 || x<0 || y == board.length || x == board[y].length) return false;
        if (board[y][x] != word[i]) return false;
        board[y][x] ^= 256;//把来时的路径去掉
        boolean exist = exist(board, y, x+1, word, i+1)
                || exist(board, y, x-1, word, i+1)
                || exist(board, y+1, x, word, i+1)
                || exist(board, y-1, x, word, i+1);
        board[y][x] ^= 256; //恢复来时的路径
        return exist;
    }
    public static void main(String args[]){
        char [][]a = {
                {'C','A','A'},
                {'A','A','A'},
                {'B','C','D'}};
        System.out.println(new Leet_79().exist(a,"AAB"));
    }
}
