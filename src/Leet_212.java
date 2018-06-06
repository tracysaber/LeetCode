import java.util.LinkedList;
import java.util.List;

/**
 *
Given a 2D board and a list of words from the dictionary, find all words in the board.

Each word must be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.

Example:

Input:
words = ["oath","pea","eat","rain"] and board =
[
  ['o','a','a','n'],
  ['e','t','a','e'],
  ['i','h','k','r'],
  ['i','f','l','v']
]

Output: ["eat","oath"]
 */
public class Leet_212 {
	public void findWord(char[][] b,String word,int i,int j,int index,List<String> results){
		if(word.length()==index)	{
			if(!results.contains(word))
				results.add(word);
			return;
		}
		else{
			char now_char = word.charAt(index);
			if(i>0&&b[i-1][j]==now_char){
				b[i-1][j]=' ';
				findWord(b,word,i-1,j,index+1,results);
				b[i-1][j]=now_char;
			}
			if(j>0&&b[i][j-1]==now_char){
				b[i][j-1]=' ';
				findWord(b,word,i,j-1,index+1,results);
				b[i][j-1]=now_char;
			}
			if(j<b[0].length-1&&b[i][j+1]==now_char){
				b[i][j+1]=' ';
				findWord(b,word,i,j+1,index+1,results);
				b[i][j+1]=now_char;
			}
			if(i<b.length-1&&b[i+1][j]==now_char){
				b[i+1][j]=' ';
				findWord(b,word,i+1,j,index+1,results);
				b[i+1][j]=now_char;
			}
			return;
		}
	}
	public List<String> findWords(char[][] board, String[] words) {
		List<String> results = new LinkedList<String>();
		for(int i =0;i<words.length;i++){
			String now_word = words[i];
			char a = now_word.charAt(0);
			for(int j=0;j<board.length;j++){
				for(int k=0;k<board[0].length;k++){
					if(board[j][k]==a&&!results.contains(now_word)){
						if(now_word.length()==1)	results.add(now_word);
						else{
							board[j][k]=' ';
							findWord(board,now_word,j,k,1,results);
							board[j][k]=a;
						}
					}
				}
			}
		}
		return results;
	}
	public static void main(String args[]){
		char[][] a = new char[1][1];
		a[0][0]='a';
		String []b= {"ab"};
		List<String> re = new Leet_212().findWords(a,b);
		System.out.println();
	}
}
