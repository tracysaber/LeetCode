import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by tracysaber on 2017-10-18.
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

 The Sudoku board could be partially filled, where empty cells are filled with the character '.'.


 A partially filled sudoku which is valid.
 */
public class Leet_36 {
  public boolean isValidSudoku(char[][] board) {
   Set seen = new HashSet();
   for (int i=0; i<9; ++i) {
    for (int j=0; j<9; ++j) {
     if (board[i][j] != '.') {
      String b = "(" + board[i][j] + ")";
      if (!seen.add(b + i) || !seen.add(j + b) || !seen.add(i/3 + b + j/3))
       return false;
     }
    }
   }
   return true;
  }

 public static void main(String args[]){
  //char a[][] = {{'.',"8","7","6","5","4","3","2","1"},{"2",".",".",".",".",".",".",".","."},{"3",".",".",".",".",".",".",".","."},{"4",".",".",".",".",".",".",".","."},{"5",".",".",".",".",".",".",".","."},{"6",".",".",".",".",".",".",".","."},{"7",".",".",".",".",".",".",".","."},{"8",".",".",".",".",".",".",".","."},{"9",".",".",".",".",".",".",".","."}};
  //System.out.println(new Leet_36().isValidSudoku(a));
 }
}
