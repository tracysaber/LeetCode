import java.util.LinkedList;
import java.util.List;

/**
 * Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord, such that:

 Only one letter can be changed at a time.
 Each transformed word must exist in the word list. Note that beginWord is not a transformed word.
 Note:

 Return 0 if there is no such transformation sequence.
 All words have the same length.
 All words contain only lowercase alphabetic characters.
 You may assume no duplicates in the word list.
 You may assume beginWord and endWord are non-empty and are not the same.
 Example 1:

 Input:
 beginWord = "hit",
 endWord = "cog",
 wordList = ["hot","dot","dog","lot","log","cog"]

 Output: 5

 Explanation: As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 return its length 5.
 Example 2:

 Input:
 beginWord = "hit"
 endWord = "cog"
 wordList = ["hot","dot","dog","lot","log"]

 Output: 0

 Explanation: The endWord "cog" is not in wordList, therefore no possible transformation.
 */
public class Leet_127 {
	static boolean isNeib(String word1,String word2){
		int count=0;
		for(int i=0;i<word1.length();i++){
			if(word1.charAt(i)!=word2.charAt(i))
				count++;
			if(count>=2)	return false;
		}
		return true;
	}
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		if(!wordList.contains(endWord))	return 0;
		if(isNeib(beginWord,endWord))	return 1;
		else{
			int pathLen = 1;
			//int len = wordList.size();
			LinkedList<String> now = new LinkedList<String>();
			LinkedList<String> next = new LinkedList<String>();
			now.add(beginWord);
			while(!wordList.isEmpty()){
				int len = wordList.size();
				for(int i =0;i<len;i++){
					//if(isNeib(wordList.get(i),beginWord)
				}
			}
			return pathLen;
		}
	}
}
